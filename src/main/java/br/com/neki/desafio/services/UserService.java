package br.com.neki.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.desafio.entities.User;
import br.com.neki.desafio.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository usuarioRepository;
	
	public List<User> findAll() {
		return usuarioRepository.findAll();
	}

}
