package br.com.neki.desafio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "skill", schema = "teste_residencia")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "skill_seq")
	@SequenceGenerator(name = "skill_seq", sequenceName = "skill_seq", initialValue = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "version")
	private String versaoHabilidade;

	@Column(name = "name")
	private String nomeHabilidade;

	@Column(name = "description")
	private String descricaoHabilidade;

	@Column(name = "image_url")
	private String imagemHabilidade;
	
	@Column(name = "ativo")
	private Boolean ativo;

	public Skill() {
		super();
	}
	
	public Skill(Integer id, String versaoHabilidade, String nomeHabilidade, String descricaoHabilidade,
			String imagemHabilidade, Boolean ativo) {
		super();
		this.id = id;
		this.versaoHabilidade = versaoHabilidade;
		this.nomeHabilidade = nomeHabilidade;
		this.descricaoHabilidade = descricaoHabilidade;
		this.imagemHabilidade = imagemHabilidade;
		this.ativo = ativo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
