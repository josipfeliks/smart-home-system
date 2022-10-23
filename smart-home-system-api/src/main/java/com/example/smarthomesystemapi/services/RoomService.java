package com.example.smarthomesystemapi.services;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.example.smarthomesystemapi.models.Light;
import com.example.smarthomesystemapi.models.Room;
import com.example.smarthomesystemapi.services.interfaces.IRoomService;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class RoomService implements IRoomService {
    public static final String COL_NAME = "rooms";

    public String saveRoom(Room room) throws InterruptedException, ExecutionException {

        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(room.getName()).set(room);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public Room getRoomDetails(String name) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COL_NAME).document(name);
        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = future.get();

        Room room = null;

        if(document.exists()) {
            room = document.toObject(Room.class);
            return room;
        }else {
            return null;
        }
    }

    public List<Light> getLightsInRoom(UUID roomId) {
        return null;
    }
}
