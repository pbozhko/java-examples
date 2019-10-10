package com.example.model;

import java.io.Serializable;

abstract public class Device implements Serializable {

    private String name;
    private String description;

    public Device() {}

    public Device(String name, String description) {

        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Device{" +
            "name='" + name + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}
