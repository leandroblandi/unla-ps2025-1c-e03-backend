package com.unla.airbnb.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "alojamientos")
@Getter
@Setter
@Builder
public class Alojamiento {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAlojamiento;

	@Column
	private String titulo;

	@Column
	private String descripcion;
	
	@Column
	@ElementCollection
	private Set<String> urlImagenes;

	@Column
	private String direccion;

	@Column
	private double precioPorNoche;

	@Column
	private int capacidadPersonas;

	@Column
	private boolean disponible;
}
