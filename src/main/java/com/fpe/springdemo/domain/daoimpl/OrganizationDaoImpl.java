package com.fpe.springdemo.domain.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fpe.springdemo.domain.Organization;
import com.fpe.springdemo.domain.dao.OrganizationDao;

@Repository("orgDao")
public class OrganizationDaoImpl implements OrganizationDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}

	public boolean create(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public Organization getOrganization(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Organization> getAllOrganizations() {
		String sqlQuery = "SELECT * FROM organization";
		List<Organization> orgList = jdbcTemplate.query(sqlQuery, new OrganizationRowMapper());
		return orgList;
	}

	public boolean delete(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public void cleanup() {
		// TODO Auto-generated method stub

	}

}
