package com.teago.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ModeloGenericoTeste")
public class ModeloGenericoTeste {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "CAMPO_1")
	private String campo1;

	@Column(name = "CAMPO_2")
	private String campo2;

	public ModeloGenericoTeste() {
	}
	
	public ModeloGenericoTeste( String campo1, String campo2) {
		//this.id = id;
		this.campo1 = campo1;
		this.campo2 = campo2;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCampo1() {
		return campo1;
	}

	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}

	public String getCampo2() {
		return campo2;
	}

	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}

}
