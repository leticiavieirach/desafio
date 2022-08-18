package br.com.neki.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.neki.desafio.dto.UserDTO;
import br.com.neki.desafio.entities.User;
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

		if (usuario != null) {
			BCryptPasswordEncoder criptografar = new BCryptPasswordEncoder();
			boolean senhaDescriptografada = criptografar.matches(senha, usuario.getSenhaUsuario());
			if (senhaDescriptografada) {
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

	public User save(UserDTO usuario) {
		User user = new User();
		BCryptPasswordEncoder criptografar = new BCryptPasswordEncoder();
		String senhaCriptografada = criptografar.encode(usuario.getSenhaUsuario());
		usuario.setSenhaUsuario(senhaCriptografada);
		
		user.setAtivo(true);
		user.setSenhaUsuario(usuario.getSenhaUsuario());
		user.setLoginUsuario(usuario.getLoginUsuario());
		
		return usuarioRepository.save(user);
	}
	
	public User update(User usuario, Integer id) {
		usuario.setId(id);
		return usuarioRepository.save(usuario);
	}

	
}
