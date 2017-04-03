package br.unifor.progweb.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plataforma implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2126433156554503175L;

	@Id
	@Column(name = "id_plataforma")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_plataforma;
	
	@Column(name = "nome_plataforma")
	private String Plataforma;

	public String getPlataforma() {
		return Plataforma;
	}

	public void setPlataforma(String plataforma) {
		Plataforma = plataforma;
	}
}
