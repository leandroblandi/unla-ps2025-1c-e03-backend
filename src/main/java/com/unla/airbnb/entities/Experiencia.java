package com.unla.airbnb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "experiencias")
@Getter
@Setter
@Builder
public class Experiencia {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idExperiencia;
	
	@Column
	private String titulo;
	
	@Column
	private String descripcion;
	
	@Column
	private double precioPorPersona;
	
	@Column
	private String direccion;
	
	@Column
	private boolean tieneCupo;
}

