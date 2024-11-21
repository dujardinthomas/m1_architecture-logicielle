package org.example.creational.builder.tpModularCars;

public class Main {

    public static void main(String[] args) {
        Car succes = new Car
                .CarBuilder(Model.Berline, Engine.Electrique, 2)
                .build();
        System.out.println("succès : " + succes);


        System.out.println("failSport : ");
        try {
            Car failSport = new Car
                    .CarBuilder(Model.Sport, Engine.Electrique, 5)
                    .color("red")
                    .isGPSEnable(true)
                    .isRoofOpen(true)
                    .build();
            System.out.println("failSport :" + failSport);

        }catch (Exception e){
            System.out.println(e);
        }


        System.out.println("failSeats : ");
        try{
            Car failSeats = new Car
                    .CarBuilder(Model.SUV, Engine.Electrique, 2)
                    .color("red")
                    .isGPSEnable(true)
                    .isRoofOpen(true)
                    .build();
            System.out.println("failSeat : " + failSeats);
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
