package com.example.model;

import java.util.Arrays;

public class Room {

    private String name;
    private Device[] devices;

    public Room(String name) {

        this.name = name;
        this.devices = new Device[0];
    }

    public Room(String name, Device[] devices) {

        this.name = name;
        this.devices = devices;
    }

    public void addDevice(Device device) {

        Device[] newDevices = new Device[devices.length + 1];
        for(int i = 0; i < devices.length; i++) {
            newDevices[i] = devices[i];
        }
        newDevices[newDevices.length - 1] = device;
        this.devices = newDevices;
    }

    public boolean hasDevice(Device device) {

        for (Device device1 : devices) {

            if (device1.equals(device)) {
                return true;
            }
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device[] getDevices() {
        return devices;
    }

    public void setDevices(Device[] devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "Room{" +
            "name='" + name + '\'' +
            ", devices=" + Arrays.toString(devices) +
            '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Room room = (Room) o;
//        return Objects.equals(name, room.name) &&
//            Arrays.equals(devices, room.devices);
//    }
//
//    @Override
//    public int hashCode() {
//
//        int result = Objects.hash(name);
//        result = 31 * result + Arrays.hashCode(devices);
//        return result;
//    }
}
