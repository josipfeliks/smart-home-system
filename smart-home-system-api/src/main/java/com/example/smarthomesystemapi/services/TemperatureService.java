package com.example.smarthomesystemapi.services;

import java.time.LocalTime;
import java.util.UUID;

import com.example.smarthomesystemapi.services.interfaces.ITemperatureService;

public class TemperatureService implements ITemperatureService {

    @Override
    public boolean setTemperatureInRoom(UUID roomId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean setTemperatureInRoom(UUID roomId, LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean setTemperatureEverywhere() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean setTemperatureEverywhere(LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
