package com.airlineReservation.reservation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airlineReservation.reservation.dao.TripDao;
import com.airlineReservation.reservation.entities.Trip;
import com.airlineReservation.reservation.entities.User;
import com.airlineReservation.reservation.requests.TripRequest;

@Service
public class TripService {

	private TripDao dao;
	
	public Trip trip(int id) {
		return this.dao.findById(id);
	}
	
	public List<Trip> trips() {
		return this.dao.findAll();
	}
	
	public Trip create(Trip t) {
		return this.dao.save(t);
	}
	
	public Trip update(int id , TripRequest r) {
		Trip t = this.dao.findById(id);
		t.setAirPlanes(r.getAirPlanes());
		t.setDestination(r.getDestination());
		t.setReturnTime(r.getReturnTime());
		t.setTakeOffPoint(r.getTakeOffPoint());
		t.setTakeOffTime(r.getTakeOffTime());
		return this.dao.save(t);
	}
	
	public void delete(Trip t) {
		this.dao.delete(t);
	}
	
	

}
