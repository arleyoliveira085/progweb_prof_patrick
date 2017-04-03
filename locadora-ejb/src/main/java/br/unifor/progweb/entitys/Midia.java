package br.unifor.progweb.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Midia implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7814926364435731452L;

	@Id
	@Column(name="id_midia")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="tipo_midia")
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
