package com.example.smarthomesystemapi.services.interfaces;

import java.time.LocalTime;
import java.util.UUID;

public interface ILightService {
    
    boolean turnOn(UUID lightId, LocalTime when);
    boolean turnOn(UUID lightId);

    boolean turnOff(UUID lightId, LocalTime when);
    boolean turnOff(UUID lightId);

    boolean isOn(UUID lightId);
    boolean isOff(UUID lightId);

    boolean dimLight(UUID lightId, double percentage, LocalTime when);
    boolean dimLight(UUID lightId, double percentage);

}
