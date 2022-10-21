package com.example.smarthomesystemapi.services.interfaces;

import java.time.LocalTime;
import java.util.UUID;

public interface IDoorService {
    
    boolean unlockDoor(UUID doorId);
    boolean unlockDoor(UUID doorId, LocalTime when);

    boolean lockDoor(UUID doorId);
    boolean lockDoor(UUID doorId, LocalTime when);

}
