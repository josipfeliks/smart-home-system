package com.example.smarthomesystemapi.services;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

import com.example.smarthomesystemapi.models.Light;
import com.example.smarthomesystemapi.requests.LightRequest;
import com.example.smarthomesystemapi.services.interfaces.ILightService;

public class LightService implements ILightService {

    @Override
    public boolean turnLightOn(UUID lightId, LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean turnLightOn(UUID lightId) {
        return turnLightOn(lightId, LocalTime.now());
    }

    @Override
    public boolean turnLightOff(UUID lightId, LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean turnLightOff(UUID lightId) {
        return turnLightOff(lightId, LocalTime.now());
    }

    @Override
    public boolean isLightOn(UUID lightId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isLightOff(UUID lightId) {
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

    @Override
    public boolean turnAllLightsOn() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean turnAllLightsOn(LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean turnAllLightsOff() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean turnAllLightsOff(LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    public Light getLightById(UUID id) {
        return null;
    }

    public List<Light> getAllLights() {
        return null;
    }

    public boolean updateLight(LightRequest light) {
        return false;
    }

    public boolean deleteLight(UUID id) {
        return false;
    }

    @Override
    public UUID createLight(LightRequest lightRequest) {
        // TODO Auto-generated method stub
        return null;
    }



}
