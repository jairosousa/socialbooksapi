package com.teste.socialbooks.domain;

import java.util.Date;

public class Comentario {

	private Long id;
	private String texro;
	private String usuario;
	private Date data;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTexro() {
		return texro;
	}
	public void setTexro(String texro) {
		this.texro = texro;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}	
	
	
}
