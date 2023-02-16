package com.airlineReservation.reservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlineReservation.reservation.dao.AirPlaneDao;
import com.airlineReservation.reservation.entities.AirPlane;
import com.airlineReservation.reservation.requests.AirPlaneRequest;

@Service
public class AirPlaneService {

	@Autowired
	private AirPlaneDao dao;
	
	public AirPlane airplane(int id) {
		return this.dao.findById(id);
	}
	
	public List<AirPlane> airPlanes() {
		return this.dao.findAll();
	}
	
	public void delete(AirPlane a) {
		this.dao.delete(a);
	}
	
	public AirPlane create(AirPlane a) {
		return this.dao.save(a);
	}
	
	public AirPlane update(int id ,AirPlaneRequest r) {
		AirPlane a = this.dao.findById(id);
		a.setAirplaneModel(r.getAirplaneModel());
		a.setCompany(r.getCompany());
		a.setNumberOfSeats(r.getNumberOfSeats());
		a.setPilot(r.getPilot());
		a.setTrip(r.getTrip());
		return this.dao.save(a);
	}
	
}
