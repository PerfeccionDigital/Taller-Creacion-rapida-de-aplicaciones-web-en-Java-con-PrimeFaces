package com.perfecciondigital.tallerprimefaces.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@RequestScoped
public class AutoCompleteController {
	
	private String txt1;
	
	public List<String> completeText(String query) {
        List<String> results = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            results.add(query + " " + i);
        }
         
        return results;
    }


}
