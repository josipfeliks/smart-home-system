package com.example.smarthomesystemapi.services.interfaces;

import java.time.LocalTime;
import java.util.UUID;

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

}
