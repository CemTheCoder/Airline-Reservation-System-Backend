package com.airlineReservation.reservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlineReservation.reservation.dao.UserDao;
import com.airlineReservation.reservation.entities.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public User user(int id) {
		return this.dao.findById(id);
	}
	
	public List<User> users() {
		return this.dao.findAll();
	}
	
	public User create(User u) {
		return this.dao.save(u);
	}
	
	public User update(User u) {
		return this.dao.save(u);
	}
	
	public void delete(User u) {
		this.dao.delete(u);
	}
	
	

}
