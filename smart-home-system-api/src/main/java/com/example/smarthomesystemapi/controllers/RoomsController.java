package com.example.smarthomesystemapi.controllers;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.smarthomesystemapi.models.Light;
import com.example.smarthomesystemapi.models.Room;
import com.example.smarthomesystemapi.services.RoomService;

@RestController
@RequestMapping("rooms")
public class RoomsController {
    
    @Autowired
    RoomService roomService;

    @GetMapping("/getRoomDetails")
    public Room getRoom(@RequestParam String name ) throws InterruptedException, ExecutionException{
        return roomService.getRoomDetails(name);
    }

    @PostMapping("/createRoom")
    public String createRoom(@RequestBody Room room) throws InterruptedException, ExecutionException {
        return roomService.saveRoom(room);
    }

    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }

    // get lights in room
    @GetMapping("/{id}/lights")
    public List<Light> getLightsInRoom(@PathVariable UUID id) {
        return roomService.getLightsInRoom(id);
    }
    



}
