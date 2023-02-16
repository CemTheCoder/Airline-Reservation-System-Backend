package com.airlineReservation.reservation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airlineReservation.reservation.dao.CompanyDao;
import com.airlineReservation.reservation.entities.Company;
import com.airlineReservation.reservation.entities.User;

@Service
public class CompanyService {

	private CompanyDao dao;
	
	
	public Company company(int id) {
		return this.dao.findById(id);
	}
	
	public List<Company> companies() {
		return this.dao.findAll();
	}
	
	public Company create(Company c) {
		return this.dao.save(c);
	}
	
	public Company update(Company c) {
		return this.dao.save(c);
	}
	
	public void delete(Company c) {
		this.dao.delete(c);
	}
	
	

}
