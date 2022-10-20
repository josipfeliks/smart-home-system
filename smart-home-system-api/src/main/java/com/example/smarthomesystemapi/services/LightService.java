package com.example.smarthomesystemapi.services;

import java.time.LocalTime;
import java.util.UUID;

import com.example.smarthomesystemapi.services.interfaces.ILightService;

public class LightService implements ILightService {

    @Override
    public boolean turnOn(UUID lightId, LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean turnOn(UUID lightId) {
        return turnOn(lightId, LocalTime.now());
    }

    @Override
    public boolean turnOff(UUID lightId, LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean turnOff(UUID lightId) {
        return turnOff(lightId, LocalTime.now());
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
    public boolean dimLight(UUID lightId, double percentage, LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean dimLight(UUID lightId, double percentage) {
        return dimLight(lightId, percentage, LocalTime.now());
    }

}
