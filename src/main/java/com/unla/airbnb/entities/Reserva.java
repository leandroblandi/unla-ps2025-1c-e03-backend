package com.unla.airbnb.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Reserva {
	@Id
	@Column
	@JsonProperty("id_reserva")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReserva;
	
	@Column
	@JsonProperty("fecha_reserva")
	private LocalDate fechaReserva;
	
	@Column
	@JsonProperty("cantidad_personas")
	private int cantidadPersonas;
}
