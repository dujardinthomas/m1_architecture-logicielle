package org.example.creational.builder;

public class Demo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setProcessor("intel");
        computer.setGraphicCardEnable(true);

        Computer computer2 = new Computer
                .ComputerBuilder("intel", 256)
                .build();

        Computer computer3 = new Computer
                .ComputerBuilder("intel", 256)
                .isBluetoothEnable(true)
                .build();

        Computer computer4 = new Computer
                .ComputerBuilder("intel", 512)
                .storage(2048)
                .build();

    }
}
