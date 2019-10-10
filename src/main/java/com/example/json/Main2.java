package com.example.json;

import com.example.model.Color;
import com.example.model.Flat;
import com.example.model.Lamp;
import com.example.model.Room;
import com.google.gson.Gson;

public class Main2 {

    public static void main(String... args) {

        Room room = new Room("Room1");
        room.addDevice(new Lamp("Lamp1", "Descr1", Color.GREEN, 60.0));
        Flat flat = new Flat(0);
        flat.setRooms(new Room[]{room});


        Gson gson = new Gson();
        String json = gson.toJson(room);
        System.out.println(json);
    }
}
