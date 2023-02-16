package com.airlineReservation.reservation.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airlineReservation.reservation.dao.UserDao;
import com.airlineReservation.reservation.entities.User;
import com.airlineReservation.reservation.requests.UserRequest;
import com.airlineReservation.reservation.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping("/user")
	public ResponseEntity<User> getUser(@RequestParam (name ="id") int id ) {
		return new ResponseEntity<User>(this.service.user(id),HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<List<User>>(this.service.users(),HttpStatus.OK);
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User u) {
		return new ResponseEntity<User>(this.service.create(u) , HttpStatus.CREATED);
	}
	
	@DeleteMapping("/user")
	public ResponseEntity<User> deleteUser(@RequestParam(name = "id") int id) {
		User u  = this.service.user(id);
		this.service.delete(u);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@PutMapping("/user")
	public ResponseEntity<User> updateUser(@RequestParam(name = "id") int id , @RequestBody UserRequest r) {
		User u  = this.service.user(id);
		u.setEmail(r.getEmail());
		u.setName(r.getName());
		u.setPassword(r.getPassword());
		u.setSurname(r.getSurname());
		
		return new ResponseEntity<User>(this.service.update(u),HttpStatus.OK);
	}
	

}
