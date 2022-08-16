package br.com.neki.desafio.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "habilidade")
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idHabilidade;
	
	@Column(name = "version")
	private String versaoHabilidade;
	
	@Column(name = "name")
	private String nomeHabilidade;
	
	@Column(name = "description")
	private String descricaoHabilidade;
	
	@Column(name = "image_url")
	private String imagemHabilidade;

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skill(Integer idHabilidade, String versaoHabilidade, String nomeHabilidade, String descricaoHabilidade,
			String imagemHabilidade) {
		super();
		this.idHabilidade = idHabilidade;
		this.versaoHabilidade = versaoHabilidade;
		this.nomeHabilidade = nomeHabilidade;
		this.descricaoHabilidade = descricaoHabilidade;
		this.imagemHabilidade = imagemHabilidade;
	}

	public Integer getIdHabilidade() {
		return idHabilidade;
	}

	public void setIdHabilidade(Integer idHabilidade) {
		this.idHabilidade = idHabilidade;
	}

	public String getVersaoHabilidade() {
		return versaoHabilidade;
	}

	public void setVersaoHabilidade(String versaoHabilidade) {
		this.versaoHabilidade = versaoHabilidade;
	}

	public String getNomeHabilidade() {
		return nomeHabilidade;
	}

	public void setNomeHabilidade(String nomeHabilidade) {
		this.nomeHabilidade = nomeHabilidade;
	}

	public String getDescricaoHabilidade() {
		return descricaoHabilidade;
	}

	public void setDescricaoHabilidade(String descricaoHabilidade) {
		this.descricaoHabilidade = descricaoHabilidade;
	}

	public String getImagemHabilidade() {
		return imagemHabilidade;
	}

	public void setImagemHabilidade(String imagemHabilidade) {
		this.imagemHabilidade = imagemHabilidade;
	}
	
}
