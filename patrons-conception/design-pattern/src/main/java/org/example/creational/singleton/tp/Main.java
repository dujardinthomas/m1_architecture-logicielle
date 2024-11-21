package org.example.creational.singleton.tp;

public class Main {

    public static void main(String[] args) {
        Configuration configuration = Configuration.getInstance();
        System.out.println("config0 : " + configuration.getSetting("user"));

        Configuration configuration1 = Configuration.getInstance();
        System.out.println("config1 : " + configuration1.getSetting("user"));


        configuration.setSetting("ip", "127.0.1.1");
        configuration1.setSetting("user", "toto");

        System.out.println("config0 : " + configuration.getSetting("ip"));
        System.out.println("config1 : " + configuration1.getSetting("ip"));

//        configuration.setSetting("user", "toto");
//        System.out.println(configuration.getSetting("user"));
//
//        Configuration configuration1 = Configuration.getInstance();
//        System.out.println("config0 :" +configuration.getSetting("user"));
//        System.out.println("config1 :" + configuration1.getSetting("user"));
//
//
//
//        //configuration.setSetting("os", "windows");
//        configuration.setSetting("os", "windows");
//        System.out.println(configuration.getSetting("os"));
    }
}
