package org.example.structural.adapter;

public class Demo {

    public static void main(String[] args) {
        AmericainPlug americainPlug = new AmericainPlug();
        EuropeanPlug europeanPlug = new PlugAdapter(americainPlug);

        europeanPlug.connectToEuropeanPlug();
    }
}
