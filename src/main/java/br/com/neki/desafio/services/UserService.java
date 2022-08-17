package br.com.neki.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.desafio.dto.UserDTO;
import br.com.neki.desafio.entities.User;
import br.com.neki.desafio.mapper.EntidadeDTOMapper;
import br.com.neki.desafio.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository usuarioRepository;

	public List<User> findAll() {
		return usuarioRepository.findAllAtivos();
	}
	
	public User findById(Integer id) {
		return usuarioRepository.findById(id).get();
	}

	public String loginApp(String login, String senha) {

		User usuario = usuarioRepository.findByLoginUsuario(login);

		if (usuarioRepository.findByLoginUsuario(login) != null) {
			if (usuario.getSenhaUsuario().equals(senha)) {
				return "Login confirmado!";
			} else {
				return "Login e/ou senha inválidos.";
			}
		} else {
			return "Login e/ou senha inválidos.";
		}
	}
	
	public void deleteLogical(Integer id) {
		Optional<User> usuario = usuarioRepository.findById(id);
		if(usuario.isPresent()) {
			User usu = usuario.get();
			usu.setAtivo(false);
			usuarioRepository.save(usu);
		}
	}
	
	public User save(UserDTO usuarioDTO) {
		EntidadeDTOMapper entidadeDTOMapper = new EntidadeDTOMapper();
		User newUsuario = new User();
		entidadeDTOMapper.userDTOToUser(newUsuario, usuarioDTO);
		return usuarioRepository.save(newUsuario);
	}
	
	public User update(User usuario, Integer id) {
		usuario.setId(id);
		return usuarioRepository.save(usuario);
	}

}
