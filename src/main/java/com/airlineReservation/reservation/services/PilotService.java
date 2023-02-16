package com.airlineReservation.reservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlineReservation.reservation.dao.PilotDao;
import com.airlineReservation.reservation.entities.Pilot;
import com.airlineReservation.reservation.entities.User;

@Service
public class PilotService {
	
	@Autowired
	private PilotDao dao;
	
	public Pilot pilot(int id) {
		return this.dao.findById(id);
	}
	
	public List<Pilot> pilots() {
		return this.dao.findAll();
	}
	
	public Pilot create(Pilot p) {
		return this.dao.save(p);
	}
	
	public Pilot update(Pilot p) {
		return this.dao.save(p);
	}
	
	public void delete(Pilot p) {
		this.dao.delete(p);
	}
	
	

}
