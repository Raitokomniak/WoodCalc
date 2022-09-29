package com.raito.woodcalc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WoodcalcApplication {
    public static CalcApp cApp;

	public static void main(String[] args) {
		SpringApplication.run(WoodcalcApplication.class, args);

        //Set UTF-8 encoding
        System.setProperty("file.encoding","UTF-8");

        
        //Set properties for Thymeleaf
        Properties prop = new Properties();
        String fileName = "app.config";
        try (FileInputStream fis = new FileInputStream(fileName)) {
            prop.load(fis);
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } 

        //Create new service instances
        cApp = new CalcApp();
        cApp.Reset();
	}

}
