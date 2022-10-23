package com.example.smarthomesystemapi.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.smarthomesystemapi.models.Light;
import com.example.smarthomesystemapi.requests.LightRequest;
import com.example.smarthomesystemapi.services.interfaces.ILightService;
import com.example.smarthomesystemapi.services.interfaces.IRoomService;

@RestController
@RequestMapping("lights")
public class LightsController {

    @Autowired
    ILightService lightService;

    @Autowired
    IRoomService roomService;    

    // add light to room
    @PostMapping()
    public UUID createLight(@RequestBody LightRequest lightRequest) {
        return lightService.createLight(lightRequest);
    }
    
    // get light by id
    @GetMapping("/{id}")
    public Light getLightById(@PathVariable UUID id) {
        return lightService.getLightById(id);
    }
    
    // get all lights
    @GetMapping()
    public List<Light> getAllLights() {
        return lightService.getAllLights();
    }
    
    // update light
    @PutMapping()
    public boolean updateLight(@RequestBody LightRequest lightRequest) {
        return lightService.updateLight(lightRequest);
    }

    
    // delete light
    @DeleteMapping()
    public boolean deleteLight(@RequestParam UUID id) {
        return lightService.deleteLight(id);
    }
    
    // turn light on
    @PutMapping("/{id}/on")
    public boolean turnLightOn(@PathVariable UUID id) {
        return lightService.turnLightOn(id);
    }
    
    // turn light off
    @PutMapping("/{id}/off")
    public boolean turnLightOff(@PathVariable UUID id) {
        return lightService.turnLightOff(id);
    }
    
    // turn all lights on
    @PutMapping("/all/on")
    public boolean turnAllLightsOn() {
        return lightService.turnAllLightsOn();
    }
    
    // turn all lights off
    @PutMapping("/all/off")
    public boolean turnAllLightsOff() {
        return lightService.turnAllLightsOff();
    }

    // is light on
    @GetMapping("/{id}/is-on")
    public boolean isLightOn(@PathVariable UUID id) {
        return lightService.isLightOn(id);
    }

    // is light off
    @GetMapping("/{id}/is-off")
    public boolean isLightOff(@PathVariable UUID id) {
        return lightService.isLightOff(id);
    }

    // dim light
    @PutMapping("/{lightId}/dim")
    public boolean dimLight(@RequestParam UUID lightId, @RequestParam double percentage) {
        return lightService.dimLight(lightId, percentage);
    }

}
