package com.trips.models;

public class Categoria {
	
	private Integer id;
	private String nomcategoria;
	private String descripcion;
	private  Boolean activo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomcategoria() {
		return nomcategoria;
	}
	public void setNomcategoria(String nomcategoria) {
		this.nomcategoria = nomcategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	

}
