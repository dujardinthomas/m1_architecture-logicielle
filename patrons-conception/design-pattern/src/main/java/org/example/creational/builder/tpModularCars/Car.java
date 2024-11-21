package org.example.creational.builder.tpModularCars;

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
            this.engine = engine;
            this.seats = seats;
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

        public Car build(){
            return new Car(this);
        }
    }

}
