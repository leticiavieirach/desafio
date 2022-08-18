package br.com.neki.desafio.dto;

public class UserDTO {
	
	private String loginUsuario;
	private String senhaUsuario;
	
	public UserDTO() {
		super();
	}

	public UserDTO(String loginUsuario, String senhaUsuario) {
		super();
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
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
	
}
