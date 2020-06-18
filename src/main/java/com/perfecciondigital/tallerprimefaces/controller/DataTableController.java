package com.perfecciondigital.tallerprimefaces.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.perfecciondigital.tallerprimefaces.model.Car;

import lombok.Data;

@Data
@Named
@ViewScoped
public class DataTableController implements Serializable {

	private static final long serialVersionUID = -1731186755108785856L;
	
	private List<Car> cars;
	
	@PostConstruct
	public void init() {
		cars = new ArrayList<>();
		for(int i = 0 ; i < 50 ; i++) {
			cars.add(new Car(getRandomId(), getRandomYear(), getRandomColor(), getRandomBrand()));
		}
	}
	
	private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
     
    private int getRandomYear() {
        return (int) (Math.random() * 50 + 1960);
    }
     
    private String getRandomColor() {
    	String[] colors = new String[10];
         colors[0] = "Black";
         colors[1] = "White";
         colors[2] = "Green";
         colors[3] = "Red";
         colors[4] = "Blue";
         colors[5] = "Orange";
         colors[6] = "Silver";
         colors[7] = "Yellow";
         colors[8] = "Brown";
         colors[9] = "Maroon";
        return colors[(int) (Math.random() * 10)];
    }
     
    private String getRandomBrand() {
    	String[] brands = new String[10];
        brands[0] = "BMW";
        brands[1] = "Mercedes";
        brands[2] = "Volvo";
        brands[3] = "Audi";
        brands[4] = "Renault";
        brands[5] = "Fiat";
        brands[6] = "Volkswagen";
        brands[7] = "Honda";
        brands[8] = "Jaguar";
        brands[9] = "Ford";
        return brands[(int) (Math.random() * 10)];
    }
	
}
