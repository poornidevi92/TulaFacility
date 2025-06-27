package com.selenium.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utilss {

    public static void loadProperties(){
        FileReader reader = null;
        try {
             reader = new FileReader("config.properties");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        Properties properties = new Properties();

        try {
            properties.load(reader);
        }catch(IOException e){
            e.printStackTrace();

        }
        properties.getProperty("login.url");
        properties.getProperty("login.username");
        properties.getProperty("login.password");

    }

}
