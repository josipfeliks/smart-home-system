package com.example.smarthomesystemapi.services.interfaces;

import java.time.LocalTime;
import java.util.UUID;

public interface ITemperatureService {
    
    boolean setTemperatureInRoom(UUID roomId);
    boolean setTemperatureInRoom(UUID roomId, LocalTime when);

    boolean setTemperatureEverywhere();
    boolean setTemperatureEverywhere(LocalTime when);

}
