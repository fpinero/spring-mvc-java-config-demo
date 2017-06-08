package com.fpe.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpe.springdemo.service.GenericWelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired 
	private GenericWelcomeService welcomeService;
	
	@RequestMapping     // ("/")
	public String doWelcome(Model model){
		
		// recopila la data q necesitamos
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Fernando Piñero");
		
		// añade la data al modelo
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		//retorna el nombre de la vista a emplear (en este caso welcomeNew.jsp"
		return "welcomeNew";
	}

}
