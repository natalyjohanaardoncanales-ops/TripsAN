package com.trips.models;

public class Perfil {

	private Integer id;
	private String nomPerfil;
	private String descripccion;
	private boolean activo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomPerfil() {
		return nomPerfil;
	}
	public void setNomPerfil(String nomPerfil) {
		this.nomPerfil = nomPerfil;
	}
	public String getDescripccion() {
		return descripccion;
	}
	public void setDescripccion(String descripccion) {
		this.descripccion = descripccion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}
