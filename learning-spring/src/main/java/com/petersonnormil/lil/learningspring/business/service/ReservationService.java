package com.petersonnormil.lil.learningspring.business.service;
import com.petersonnormil.lil.learningspring.business.domain.RoomReservation;
import com.petersonnormil.lil.learningspring.data.repository.GuestRepository;
import com.petersonnormil.lil.learningspring.data.repository.ReservationRepository;
import com.petersonnormil.lil.learningspring.data.repository.RoomRepository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
	private final RoomRepository roomRepository;
	private final GuestRepository guestRepository;
	private final ReservationRepository reservationRepository;
	
	@Autowired	
	public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
		//super(); not needed
		this.roomRepository = roomRepository;
		this.guestRepository = guestRepository;
		this.reservationRepository = reservationRepository;
	}


	public List<RoomReservation> getRoomReservationsForDate(Date date){
		return null;
	}
}
