package com.example.model;

import java.io.Serializable;

public class Lamp extends Device implements Serializable {

    private Color color;
    private Double power;

    public Lamp() {
        super();
    }

    public Lamp(String name, String description, Color color, Double power) {

        super(name, description);
        this.color = color;
        this.power = power;

        if(color.equals(Color.values())) {

        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Lamp{" +
            "color=" + color +
            ", power=" + power +
            "} " + super.toString();
    }
}
