package br.com.neki.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.desafio.entities.Skill;
import br.com.neki.desafio.repositories.SkillRepository;

@Service
public class SkillService {
	
	@Autowired
	private SkillRepository habilidadeRepository;
	
	public List<Skill> findAll() {
		return habilidadeRepository.findAll();
	}

}
