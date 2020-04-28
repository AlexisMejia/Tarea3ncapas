package com.uca.capas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.domain.alumno;

@Controller
public class MainController {

	private List<String> errorList = new ArrayList<String>();
	@GetMapping("/ingresar")
	public String getInformation(alumno student) {
		return "ingresar";
	}

	@PostMapping("/ingresar")
	public ModelAndView showInformation(alumno studentInfo) {
		ModelAndView mav = new ModelAndView();
		//ArrayList<String> mensaje = studentInfo.messageError();

		

		if (studentInfo.valFields()) {
			mav.setViewName("ingresoCorrecto");
		} else {
			mav.setViewName("errores");
			mav.addObject("msg", studentInfo.messageError());
		}
		
		System.out.println(studentInfo.messageError());
		return mav;
	}

}
