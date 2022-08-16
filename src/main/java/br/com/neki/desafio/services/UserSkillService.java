package br.com.neki.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.desafio.entities.UserSkill;
import br.com.neki.desafio.repositories.UserSkillRepository;

@Service
public class UserSkillService {

	@Autowired
	private UserSkillRepository usuarioHabilidadeRepository;
	
	public List<UserSkill> findAll() {
		return usuarioHabilidadeRepository.findAll();
	}

}
