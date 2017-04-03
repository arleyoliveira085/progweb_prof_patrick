package br.unifor.progweb.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genero implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1235433536976414648L;

	@Id
	@Column(name = "id_genero")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_genero;
	
	@Column(name="genero")
	private String Genero;

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

}
