package br.com.neki.desafio.dto;

import java.time.LocalDate;

public class UserDTO {
	
	private Integer id;
	private String loginUsuario;
	private String senhaUsuario;
	private LocalDate ultimoLoginData;
	private Boolean ativo;
	public UserDTO() {
		super();
	}
	public UserDTO(Integer id, String loginUsuario, String senhaUsuario, LocalDate ultimoLoginData, Boolean ativo) {
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
