package org.example.creational.singleton.tp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Configuration {

    private static Configuration instance;
    private Map<String, String> configurations;

    private final static String FILE_CONFIG = "configForSingleton.properties";


    private Configuration(){
        this.configurations = new HashMap<>();
        loadPropertiesToMap(configurations);
    }


    public static synchronized Configuration getInstance(){
        if(instance == null){
            instance = new Configuration();
        }
        return instance;
    }

    public String getSetting(String key){
        return configurations.get(key);
    }

    public void setSetting(String key, String value){
        this.configurations.put(key, value);
        saveMapFromProperties(key, value);
    }

    private static void loadPropertiesToMap(Map<String, String> map) {
        Properties properties = new Properties();

        try (FileInputStream file = new FileInputStream(FILE_CONFIG)) {
            properties.load(file);

            for (String key : properties.stringPropertyNames()) {
                map.put(key, properties.getProperty(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveMapFromProperties(String key, String value){
        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream(FILE_CONFIG)) {
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("Le fichier de configuration n'existe pas, création d'un nouveau fichier.");
        }

        properties.setProperty(key, value);

        try (FileOutputStream fos = new FileOutputStream(FILE_CONFIG)) {
            properties.store(fos, "Updated Configuration Properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
