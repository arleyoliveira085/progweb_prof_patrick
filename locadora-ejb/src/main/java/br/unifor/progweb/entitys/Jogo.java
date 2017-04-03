package br.unifor.progweb.entitys;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="jogo")
public class Jogo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3135992223110879648L;
	
	@Id
	@Column(name= "id_jogo")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name= "titulo_jogo")
	private String titulo;
	
	@Column(name = "descricao_jogo")
	private String descricao;
	/*
	@OneToMany
	@JoinTable(name="jogo_midia",
				joinColumns = @JoinColumn(name="jogo"),
				inverseJoinColumns = @JoinColumn(name="midia"))
	private Collection<Midia> midias;
	*/
	
	/*
	 * quando o relacionamento for de n para n, 1 para n,n para 1 deve usar Arraylist,List Collection
	 * */
	
	@OneToMany
	@Column(name = "jogo_midia")
	private Collection<Midia> midia;
	
	@OneToMany	
	@Column(name = "jogo_plataforma")
	private Collection<Plataforma> plataforma;
	/*
	@OneToOne
	//@Column(name = "jogo_produtora")
	private Produtora produtora;*/
	
	@OneToOne
    @JoinColumn(name = "id_da_tb_produtora")
	private Produtora produtora;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Collection<Midia> getMidia() {
		return midia;
	}

	public void setMidia(Collection<Midia> midia) {
		this.midia = midia;
	}

	public Collection<Plataforma> getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Collection<Plataforma> plataforma) {
		this.plataforma = plataforma;
	}

	public Produtora getProdutora() {
		return produtora;
	}

	public void setProdutora(Produtora produtora) {
		this.produtora = produtora;
	}
	

	
	
	
	
	
}
