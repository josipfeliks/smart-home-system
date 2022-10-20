package com.example.smarthomesystemapi.services;

import java.util.UUID;

import com.example.smarthomesystemapi.services.interfaces.ILightService;

public class LightService implements ILightService {

    @Override
    public boolean turnOn(UUID lightId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean turnOff(UUID lightId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isOn(UUID lightId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isOff(UUID lightId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean dimLight(UUID lightId, double percentage) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
