package com.example.smarthomesystemapi.services;

import java.time.LocalTime;
import java.util.UUID;

import com.example.smarthomesystemapi.services.interfaces.IDoorService;

public class DoorService implements IDoorService {

    @Override
    public boolean unlockDoor(UUID doorId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean unlockDoor(UUID doorId, LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean lockDoor(UUID doorId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean lockDoor(UUID doorId, LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
