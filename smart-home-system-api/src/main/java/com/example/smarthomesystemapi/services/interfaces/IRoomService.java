package com.example.smarthomesystemapi.services.interfaces;

import java.util.List;
import java.util.UUID;

import com.example.smarthomesystemapi.models.Light;

public interface IRoomService {

    List<Light> getLightsInRoom(UUID roomId);
    
}
