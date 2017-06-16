package com.fpe.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpe.springdemo.domain.Organization;
import com.fpe.springdemo.service.OrganizationService;

@Controller
public class OrganizationController {
	
	@Autowired  //inyecta la clase OrganizationService (lo ideal es usar un interface para la clase)
	private OrganizationService organizationService;
	
	@RequestMapping("/location")
	public String addLocation(){
		return "location";
	}
	
	@RequestMapping("/listOrgs")  
	public String listOrganiation(Model model) {
		List<Organization> orgs = organizationService.getOrgList();  //llamamos a la clase de servicio q hemos creado y q lee todas las organizations de la DB
		model.addAttribute("orgList", orgs); //establece el parametro orglist con el orbjeto q contiene las organozaciones leidas y este parametro es accesible desde el jsp o jsf
		return "listOrganizations"; //mapeara al jsp listOrganizations.jsp en views
	}

}
