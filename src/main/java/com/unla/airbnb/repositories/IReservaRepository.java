package com.unla.airbnb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.airbnb.entities.Reserva;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Long> {

}
