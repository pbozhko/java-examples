package com.example.model;

import java.util.Arrays;

public class Flat {

    private Room[] rooms;

    public Flat(Integer roomsCount) {

        this.rooms = new Room[roomsCount];
        for(int i = 0; i < roomsCount; i++) {
            this.rooms[i] = new Room("Room #" + i);
        }
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
            "rooms=" + Arrays.toString(rooms) +
            '}';
    }
}
