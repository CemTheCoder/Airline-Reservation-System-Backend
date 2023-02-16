package com.airlineReservation.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.airlineReservation.reservation.dao.PilotDao;
import com.airlineReservation.reservation.services.PilotService;

@RestController
public class PilotController {

	@Autowired
	private PilotService service;
	
	
	

}
