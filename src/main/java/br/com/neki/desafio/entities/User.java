package br.com.neki.desafio.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idUsuario;
	
	@Column(name = "login")
	private String loginUsuario;
	
	@Column(name = "password")
	private String senhaUsuario;
	
	@Column(name = "last_login_date")
	private LocalDate ultimoLoginData;
	
//	@OneToMany(mappedBy = "user")
//	private List<UserSkill> usuarioHabilidade;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer idUsuario, String loginUsuario, String senhaUsuario, LocalDate ultimoLoginData) {
		super();
		this.idUsuario = idUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.ultimoLoginData = ultimoLoginData;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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

}