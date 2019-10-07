package com.example.collections;

import com.example.model.Room;
import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String... args) {

        Collection arrayList = new ArrayList();
        Iterable hashSet = new HashSet();
        Collection arrayQueue = new ArrayQueue(10);
        Iterable collection = new ArrayList();

        Map map = new HashMap<String, Integer>();
        map.put("key", 125);

        List<Room> rooms = new ArrayList();
        rooms.add(new Room("Room1"));
        rooms.add(new Room("Room2"));
        rooms.add(new Room("Room3"));
        rooms.add(new Room("Room1"));

        for(Room room: rooms) {
            System.out.println(room);
        }

        System.out.println("///////////////");

        Set<Room> rooms2 = new HashSet();
        rooms2.add(new Room("Room1"));
        rooms2.add(new Room("Room2"));
        rooms2.add(new Room("Room3"));
        rooms2.add(new Room("Room1"));

        for(Room room: rooms2) {
            System.out.println(room);
        }
    }
}
