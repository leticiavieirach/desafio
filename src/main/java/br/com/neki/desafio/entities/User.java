package br.com.neki.desafio.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user", schema = "teste_residencia")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "teste_residencia.user_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@NotBlank(message = "O login não pode ficar vazio.")
	@Size(max = 12, message = "O login não pode ultrapassar 12 caracteres.")
	@Column(name = "login")
	private String loginUsuario;

	@NotBlank(message = "A senha não pode ficar vazia.")
	@Size(max = 100, message = "A senha não pode ultrapassar 100 caracteres.")
	@Column(name = "password")
	private String senhaUsuario;

	@Column(name = "last_login_date")
	private LocalDate ultimoLoginData;

	@Column(name = "ativo")
	private Boolean ativo;

	public User() {
		super();
	}

	public User(Integer id, String loginUsuario, String senhaUsuario, LocalDate ultimoLoginData, Boolean ativo) {
		super();
		this.id = id;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.ultimoLoginData = ultimoLoginData;
		this.ativo = ativo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public LocalDate getUltimoLoginData() {
		return ultimoLoginData;
	}

	public void setUltimoLoginData(LocalDate ultimoLoginData) {
		this.ultimoLoginData = ultimoLoginData;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}