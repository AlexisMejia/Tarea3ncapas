package com.uca.capas.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class formValidation {
	alumno alumn = new alumno();
	Date date = new Date(2003,01,01);

	// validaciones

	public boolean valFields() {
		boolean bandera = true;

		if (alumn.getNames().length() >= 1 && alumn.getNames().length() <= 25) {
			bandera = true;
		} else {
			bandera = false;
		}
		if (alumn.getLastnames().length() >= 1 && alumn.getLastnames().length() <= 25) {
			bandera = true;
		} else {
			bandera = false;
		}
		if (alumn.getBirthday().after(date)) {
			bandera = true;
		} else {
			bandera = false;
		}
		if (alumn.getPlace().length() >= 1 && alumn.getPlace().length() <= 25) {
			bandera = true;
		} else {
			bandera = false;
		}
		if (alumn.getSchool().length() >= 1 && alumn.getSchool().length() <= 100) {
			bandera = true;
		} else {
			bandera = false;
		}
		if (alumn.getPhoneNumber().toString().length() == 8) {
			bandera = true;
		} else {
			bandera = false;
		}
		if (alumn.getMobilePhone().toString().length() == 8) {
			bandera = true;
		} else {
			bandera = false;
		}
		System.out.println(bandera);
		return bandera;
	}

	// mensajes de error

	public String messageError() {
		if (!(alumn.getNames().length() >= 1 && alumn.getNames().length() <= 25)) {
			return "El campo Nombres no puede ser menor de un caracter o mayor a 25 caracteres";
		}
		if (!(alumn.getLastnames().length() >= 1 && alumn.getLastnames().length() <= 25)) {
			return "El campo Apellidos no puede ser menor de un caracter o mayor a 25 caracteres";
		}
		if (!(alumn.getBirthday().after(new Date("01/01/2003")))) {
			return "La fecha de nacimiento debe ser mayor a 01/01/2003";
		}
		if (!(alumn.getPlace().length() >= 1 && alumn.getPlace().length() <= 25)) {
			return "El campo Lugar de Nacimiento no puede ser menor de un caracter o mayor a 25 caracteres";
		}
		if (!(alumn.getSchool().length() >= 1 && alumn.getSchool().length() <= 100)) {
			return "El campo Colegio de Procedencia no puede ser menor de un caracter o mayor a 100 caracteres";
		}
		if (!(alumn.getPhoneNumber().toString().length() == 8)) {
			return "El campo Teléfono Fijo no puede ser menor de un caracter o mayor a 8 caracteres";
		}
		if (!(alumn.getMobilePhone().toString().length() == 8)) {
			return "El campo Teléfono Móvil no puede ser menor de un caracter o mayor a 8 caracteres";
		}
		System.out.println(alumn.getLastnames());
		return null;

	}
}
