package com.example.json;

import com.example.model.Color;
import com.example.model.Flat;
import com.example.model.Lamp;
import com.example.model.Room;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

public class Main1 {

    public static void main(String... args) throws JsonProcessingException {

        Room room = new Room("Room1");
        room.addDevice(new Lamp("Lamp1", "Descr1", Color.GREEN, 60.0));
        Flat flat = new Flat(0);
        flat.setRooms(new Room[]{room});


        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(room);
        System.out.println(json);
    }
}
