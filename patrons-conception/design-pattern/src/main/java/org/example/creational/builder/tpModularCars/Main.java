package org.example.creational.builder.tpModularCars;

public class Main {

    public static void main(String[] args) {
        Car basique = new Car
                .CarBuilder(Model.Berline, Engine.Electrique, 2)
                .build();

        Car fullOption = new Car
                .CarBuilder(Model.Sport, Engine.Hybdride, 5)
                .color("red")
                .isGPSEnable(true)
                .isRoofOpen(true)
                .build();


        System.out.println(basique);
        System.out.println(fullOption);
    }
}
