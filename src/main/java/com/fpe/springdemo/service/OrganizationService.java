package com.fpe.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpe.springdemo.domain.Organization;
import com.fpe.springdemo.domain.dao.OrganizationDao;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationDao organizationDao;

	public List<Organization> getOrgList() {

		List<Organization> orgList = organizationDao.getAllOrganizations();
		return orgList;
	}
}
