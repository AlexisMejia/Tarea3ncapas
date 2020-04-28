package com.uca.capas.domain;

import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.format.annotation.NumberFormat;

import java.util.ArrayList;
import java.util.Date;


public class alumno {

	
	private String names;
	private String lastnames;
	private String school;
	private String place;
	@NumberFormat
	private Integer phoneNumber;

	@NumberFormat
	private Integer mobilePhone;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;

	public alumno() {
		
	}
	
	
	public alumno(String names, String lastnames, String school, String place, Integer phoneNumber, Integer mobilePhone,
			Date birthday) {
		super();
		this.names = names;
		this.lastnames = lastnames;
		this.school = school;
		this.place = place;
		this.phoneNumber = phoneNumber;
		this.mobilePhone = mobilePhone;
		this.birthday = birthday;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getLastnames() {
		return lastnames;
	}

	public void setLastnames(String lastnames) {
		this.lastnames = lastnames;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(Integer mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean valFields() {
		boolean bandera = true;

		if (!(this.getNames().length() >= 1 && this.getNames().length() <= 25)) {
			bandera = false;
		}
		if (!(this.getLastnames().length() >= 1 && this.getLastnames().length() <= 25)) {
			bandera = false;
		}if (!(this.getBirthday().after((new Date("2003/01/01"))))) {
			bandera = false;
		}
		if (!(this.getPlace().length() >= 1 && this.getPlace().length() <= 25)) {
			bandera = false;
		}
		if (!(this.getSchool().length() >= 1 && this.getSchool().length() <= 100)) {
			bandera = false;
		}
		if (!(this.getPhoneNumber().toString().length() == 8)) {
			bandera = false;
			System.out.println("pruebaError");
		}
		if (!(this.getMobilePhone().toString().length() == 8)) {
			bandera = false;
		}
		return bandera;
	}


	// mensajes de error

	public ArrayList<String> messageError() {
		 ArrayList<String> alumns = new ArrayList<>();
		if (!(this.getNames().length() >= 1 && this.getNames().length() <= 25)) {
			alumns.add("El campo Nombres no puede ser menor de un caracter o mayor a 25 caracteres");
		}else
		if (!(this.getLastnames().length() >= 1 && this.getLastnames().length() <= 25)) {
			alumns.add( "El campo Apellidos no puede ser menor de un caracter o mayor a 25 caracteres");
		}if (!(this.getBirthday().after(new Date("01/01/2003")))) {
			alumns.add("La fecha de nacimiento debe ser mayor a 01/01/2003");
		}
		if (!(this.getPlace().length() >= 1 && this.getPlace().length() <= 25)) {
		alumns.add("El campo Lugar de Nacimiento no puede ser menor de un caracter o mayor a 25 caracteres");
		}
		if (!(this.getSchool().length() >= 1 && this.getSchool().length() <= 100)) {
			alumns.add("El campo Colegio de Procedencia no puede ser menor de un caracter o mayor a 100 caracteres");
		}
		if (!(this.getPhoneNumber().toString().length() == 8)) {
			alumns.add( "El campo Teléfono Fijo no puede ser menor de un caracter o mayor a 8 caracteres");
		}
		if (!(this.getMobilePhone().toString().length() == 8)) {
			alumns.add( "El campo Teléfono Móvil no puede ser menor de un caracter o mayor a 8 caracteres");
		}
		return alumns;
	}

}
