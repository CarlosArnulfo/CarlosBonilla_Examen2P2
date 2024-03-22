/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_ex2p2_carlosbonilla;

import java.io.Serializable;

/**
 *
 * @author lospe
 */
public class Carros implements Serializable{
    int speed;
   String brand;
   String model;

    public Carros(int speed, String brand, String model) {
        this.speed = speed;
        this.brand = brand;
        this.model = model;
    }

   
   
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Carros{" + "speed=" + speed + ", brand=" + brand + ", model=" + model + '}';
    }
   
}
