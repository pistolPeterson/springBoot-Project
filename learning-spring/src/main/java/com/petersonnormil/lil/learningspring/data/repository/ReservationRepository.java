package com.petersonnormil.lil.learningspring.data.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.petersonnormil.lil.learningspring.data.repository.entity.*;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
