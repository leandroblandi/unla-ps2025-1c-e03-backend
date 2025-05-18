package com.unla.airbnb.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

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
@Table(name = "experiencias")
@Getter
@Setter
@Builder
public class Experiencia {
	@Id
	@Column
	@JsonProperty("id_experiencia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idExperiencia;
	
	@Column
	@JsonProperty("titulo")
	private String titulo;
	
	@Column
	@JsonProperty("descripcion")
	private String descripcion;
	
	@Column
	@JsonProperty("url_imagenes")
	@ElementCollection
	private Set<String> urlImagenes;
	
	@Column
	@JsonProperty("precio_por_persona")
	private double precioPorPersona;
	
	@Column
	@JsonProperty("direccion")
	private String direccion;
	
	@Column
	@JsonProperty("tiene_cupo")
	private boolean tieneCupo;
}

