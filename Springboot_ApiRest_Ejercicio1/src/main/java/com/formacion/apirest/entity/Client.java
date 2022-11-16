package com.formacion.apirest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Etidad de BBDD de MYSQL
@Entity

//Aasignar el nombre de la Tabla en BBDD
@Table(name="clientes")
public class Client implements Serializable {
	
	//Id de la tabla
	@Id
	//Id autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long No_Cliente;
	
	//Campo no nullable
	@Column(nullable=false)
	private String nombre;
	private String apellidos;
	private String sexo;
	private Integer telefono;
	

	
	
	/*-----GETTERS&SETTERS-------------------*/
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



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public Integer getTelefono() {
		return telefono;
	}



	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}




	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
