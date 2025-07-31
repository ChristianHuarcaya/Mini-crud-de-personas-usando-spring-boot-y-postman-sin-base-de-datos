package com.idat.semana1.Entidad;

public class Persona {

	private int idpersona;
	private String nombre;
	private String apellidos;

	public Persona() {

	}

	public Persona(int idpersona, String nombre, String apellidos) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
