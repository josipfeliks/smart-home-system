package com.example.smarthomesystemapi.services;

import java.time.LocalTime;
import java.util.UUID;

import com.example.smarthomesystemapi.services.interfaces.ICurtainsService;

/**
 * Rolete
 */
public class CurtainsService implements ICurtainsService {

    @Override
    public boolean openCurtains(UUID curtainsId, LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean openCurtains(UUID curtainsId) {
        return openCurtains(curtainsId, LocalTime.now());
    }

    @Override
    public boolean closeCurtains(UUID curtainsId, LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean closeCurtains(UUID curtainsId) {
        return closeCurtains(curtainsId, LocalTime.now());
    }

    @Override
    public boolean openAllCurtains() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean openAllCurtains(LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean closeAllCurtains() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean closeAllCurtains(LocalTime when) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
