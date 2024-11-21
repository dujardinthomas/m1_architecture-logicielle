package org.example.creational.builder.tpModularCars;

import java.io.Serializable;

public class Car {
    // attributs obligatoire
    private Model model;
    private Engine engine;
    private int seats;



    // attributs facultatifs
    private String color;
    private boolean isGPSEnable;
    private boolean isRoofOpen;


    public Car(){}

    public Car(CarBuilder carBuilder){
        this.model = carBuilder.model;
        this.engine = carBuilder.engine;
        this.seats = carBuilder.seats;
        this.isGPSEnable = carBuilder.isGPSEnable;
        this.isRoofOpen = carBuilder.isRoofOpen;
    }


    public Model getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean isGPSEnable() {
        return isGPSEnable;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", engine=" + engine +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                ", isGPSEnable=" + isGPSEnable +
                ", isRoofOpen=" + isRoofOpen +
                '}';
    }

    public static class CarBuilder{
        // attributs obligatoire
        private Model model;
        private Engine engine;
        private int seats;



        // attributs facultatifs
        private String color;
        private boolean isGPSEnable;
        private boolean isRoofOpen;

        public CarBuilder(Model model, Engine engine, int seats){
            this.model = model;
            setEngine(engine);
            setSeats(seats);
        }


        public CarBuilder color (String color){
            this.color = color;
            return this;
        }

        public CarBuilder isGPSEnable (boolean isGPS){
            this.isGPSEnable = isGPS;
            return this;
        }

        public CarBuilder isRoofOpen (boolean isRoofOpen){
            this.isRoofOpen = isRoofOpen;
            return this;
        }

        public void setEngine(Engine engine) {
            if(this.model.equals(Model.Sport) && engine.equals(Engine.Electrique)){
                throw new IllegalArgumentException("Violation contrainte 3");
            }
            this.engine = engine;
        }

        public void setSeats(int seats) {
            if(this.model.equals(Model.SUV) && seats<5){
                throw new IllegalArgumentException("Violation contrainte 4");
            }
            this.seats = seats;
        }

        public Car build(){
            return new Car(this);
        }
    }

}
