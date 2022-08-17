package br.com.neki.desafio.mapper;

import br.com.neki.desafio.dto.UserDTO;
import br.com.neki.desafio.entities.User;

public class EntidadeDTOMapper {
	
	public UserDTO userToUserDTO(User usuario, UserDTO userDTO) {
		userDTO.setId(usuario.getId());
		userDTO.setLoginUsuario(usuario.getLoginUsuario());
		userDTO.setSenhaUsuario(usuario.getSenhaUsuario());
		userDTO.setUltimoLoginData(usuario.getUltimoLoginData());
		userDTO.setAtivo(usuario.getAtivo());
		
		return userDTO;
	}
	
	public User userDTOToUser(User usuario, UserDTO userDTO) {
		usuario.setId(userDTO.getId());
		usuario.setLoginUsuario(userDTO.getLoginUsuario());
		usuario.setSenhaUsuario(userDTO.getSenhaUsuario());
		usuario.setUltimoLoginData(userDTO.getUltimoLoginData());
		usuario.setAtivo(userDTO.getAtivo());
		
		return usuario;
		
	}

}
