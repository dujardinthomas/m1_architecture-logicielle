package org.example.structural.adapter;

public class PlugAdapter implements EuropeanPlug{

    private AmericainPlug americainPlug;

    public PlugAdapter(AmericainPlug americainPlug){
        this.americainPlug = americainPlug;
    }

    @Override
    public void connectToEuropeanPlug() {
        System.out.println("adaptateur en cours");
        americainPlug.connectToAmericainPlug();
    }
}
