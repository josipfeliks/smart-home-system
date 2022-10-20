package com.example.smarthomesystemapi.services.interfaces;

import java.util.UUID;

public interface ILightService {
    
    boolean turnOn(UUID lightId);

    boolean turnOff(UUID lightId);

    boolean isOn(UUID lightId);

    boolean isOff(UUID lightId);

    boolean dimLight(UUID lightId, double percentage);

    //TODO napraviti metode da se svijetla pale/gase itd u određeno vrijeme

}
