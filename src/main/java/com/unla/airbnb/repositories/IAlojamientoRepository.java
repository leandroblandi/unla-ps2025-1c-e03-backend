package com.unla.airbnb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.airbnb.entities.Alojamiento;

@Repository
public interface IAlojamientoRepository extends JpaRepository<Alojamiento, Long> {

}
