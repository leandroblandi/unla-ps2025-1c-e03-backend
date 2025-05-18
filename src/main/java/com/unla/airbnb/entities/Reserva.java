package com.unla.airbnb.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Reserva {
	@Id
	private Long idReserva;
	
	@Column
	private LocalDate fechaReserva;
	
	@Column
	private int cantidadPersonas;
}
