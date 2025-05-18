package com.unla.airbnb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.airbnb.entities.Experiencia;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Long> {

}
