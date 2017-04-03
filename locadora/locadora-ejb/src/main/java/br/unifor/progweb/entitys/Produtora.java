package br.unifor.progweb.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtora")
public class Produtora implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1825554920978919079L;

	@Id
	@Column(name="id_produtora")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_produtora;
	
	@Column(name = "nome_produtora")
	private String nomeProdutora;

	public String getNomeProdutora() {
		return nomeProdutora;
	}

	public void setNomeProdutora(String nomeProdutora) {
		this.nomeProdutora = nomeProdutora;
	}

	
}
