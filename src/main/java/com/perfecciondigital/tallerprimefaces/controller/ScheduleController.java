package com.perfecciondigital.tallerprimefaces.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleModel;

import lombok.Getter;

@Named
@ViewScoped
public class ScheduleController implements Serializable {

	private static final long serialVersionUID = 4485802000815699191L;

	@Getter
	private ScheduleModel eventModel = new DefaultScheduleModel();

}
