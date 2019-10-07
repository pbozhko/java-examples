package com.example.smarthome;

import com.example.model.Color;
import com.example.model.Flat;
import com.example.model.Lamp;
import com.example.model.Room;

public class Main {

    public static void main(String... args) {

        Flat flat = new Flat(3);
        System.out.println(flat);

        Room[] allRooms = flat.getRooms();
        for (Room room: allRooms) {
            room.addDevice(new Lamp("Lamp1", "Description1", Color.WHITE, 100.0));
        }
        System.out.println(flat);

        allRooms[1].addDevice(new Lamp("Lamp2", "Description2", Color.GREEN, 60.0));
        System.out.println(flat);
    }
}
