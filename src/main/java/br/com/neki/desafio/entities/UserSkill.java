package br.com.neki.desafio.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user_skill", schema = "teste_residencia")
public class UserSkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "user_skill_seq")
	@SequenceGenerator(name = "user_skill_seq", sequenceName = "user_skill_seq", initialValue = 1)
	@Column(name = "id")
	private Integer idUsuarioHabilidade;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User usuario;
	
	@ManyToOne
	@JoinColumn(name = "skill_id", referencedColumnName = "id")
	private Skill habilidade;
	
	@Column(name = "knowledge_level")
	private Integer nivelHabilidadeUsuario;
	
	@Column(name = "created_at")
	private LocalDate dataCriacao;
	
	@Column(name = "updated_at")
	private LocalDate dataAtualizacao;

	public UserSkill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserSkill(Integer idUsuarioHabilidade, User usuario, Skill habilidade, Integer nivelHabilidadeUsuario,
			LocalDate dataCriacao, LocalDate dataAtualizacao) {
		super();
		this.idUsuarioHabilidade = idUsuarioHabilidade;
		this.usuario = usuario;
		this.habilidade = habilidade;
		this.nivelHabilidadeUsuario = nivelHabilidadeUsuario;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
	}

	public Integer getIdUsuarioHabilidade() {
		return idUsuarioHabilidade;
	}

	public void setIdUsuarioHabilidade(Integer idUsuarioHabilidade) {
		this.idUsuarioHabilidade = idUsuarioHabilidade;
	}

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

	public Skill getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(Skill habilidade) {
		this.habilidade = habilidade;
	}

	public Integer getNivelHabilidadeUsuario() {
		return nivelHabilidadeUsuario;
	}

	public void setNivelHabilidadeUsuario(Integer nivelHabilidadeUsuario) {
		this.nivelHabilidadeUsuario = nivelHabilidadeUsuario;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	
	
}