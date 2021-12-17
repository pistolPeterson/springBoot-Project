package com.petersonnormil.lil.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.petersonnormil.lil.learningspring.data.repository.entity.Room;
import com.petersonnormil.lil.learningspring.data.repository.entity.Guest;
import com.petersonnormil.lil.learningspring.data.repository.entity.Reservation;
import com.petersonnormil.lil.learningspring.data.repository.RoomRepository;
import com.petersonnormil.lil.learningspring.data.repository.GuestRepository;
import com.petersonnormil.lil.learningspring.data.repository.ReservationRepository;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
		}
		
	//this is considered an antipattern, we are only doing this to show the data to the outside world
	

}
