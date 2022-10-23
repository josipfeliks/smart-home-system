package com.example.smarthomesystemapi.services.interfaces;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

import com.example.smarthomesystemapi.models.Light;
import com.example.smarthomesystemapi.requests.LightRequest;

public interface ILightService {
    
    boolean turnLightOn(UUID lightId, LocalTime when);
    boolean turnLightOn(UUID lightId);

    boolean turnLightOff(UUID lightId, LocalTime when);
    boolean turnLightOff(UUID lightId);

    boolean isLightOn(UUID lightId);
    boolean isLightOff(UUID lightId);

    boolean dimLight(UUID lightId, double percentage, LocalTime when);
    boolean dimLight(UUID lightId, double percentage);

    boolean turnAllLightsOn();
    boolean turnAllLightsOn(LocalTime when);

    boolean turnAllLightsOff();
    boolean turnAllLightsOff(LocalTime when);
    UUID createLight(LightRequest lightRequest);
    Light getLightById(UUID id);
    List<Light> getAllLights();
    boolean updateLight(LightRequest lightRequest);
    boolean deleteLight(UUID id);

}
