package com.example.smarthomesystemapi.services.interfaces;

import java.time.LocalTime;
import java.util.UUID;

public interface ICurtainsService {

    boolean openCurtains(UUID curtainsId, LocalTime when);
    boolean openCurtains(UUID curtainsId);

    boolean closeCurtains(UUID curtainsId, LocalTime when);
    boolean closeCurtains(UUID curtainsId);

    boolean openAllCurtains();
    boolean openAllCurtains(LocalTime when);

    boolean closeAllCurtains();
    boolean closeAllCurtains(LocalTime when);
}
