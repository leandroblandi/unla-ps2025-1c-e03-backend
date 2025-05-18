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
@Table(name = "alojamientos")
@Getter
@Setter
@Builder
public class Alojamiento {

	@Id
	@Column
	@JsonProperty("id_alojamiento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAlojamiento;

	@Column
	@JsonProperty("titulo")
	private String titulo;

	@Column
	@JsonProperty("descripcion")
	private String descripcion;
	
	@Column
	@ElementCollection
	@JsonProperty("url_imagenes")
	private Set<String> urlImagenes;

	@Column
	@JsonProperty("direccion")
	private String direccion;

	@Column
	@JsonProperty("precio_por_noche")
	private double precioPorNoche;

	@Column
	@JsonProperty("capacidad_personas")
	private int capacidadPersonas;

	@Column
	@JsonProperty("disponible")
	private boolean disponible;
}
