package com.fpe.springdemo.domain;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fpe.springdemo.domain.dao.OrganizationDao;

public class JdbcTemplateClassicApp1 {

	public static void main(String[] args) {
		
		//creemos el application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//Creemos la bean
		OrganizationDao dao = (OrganizationDao) ctx.getBean("orgDao");
		List<Organization> orgs = dao.getAllOrganizations();
		
		for (Organization org : orgs) {
			System.out.println(org);
		}
		
		//cerremos de application context
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}
