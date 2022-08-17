package br.com.neki.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.desafio.entities.Skill;
import br.com.neki.desafio.repositories.SkillRepository;

@Service
public class SkillService {
	
	@Autowired
	private SkillRepository habilidadeRepository;
	
	public List<Skill> findAll() {
		return habilidadeRepository.findAllAtivos();
	}
	
	public Skill findById(Integer id) {
		return habilidadeRepository.findById(id).get();
	}
	
	public void deleteLogical(Integer id) {
		Optional<Skill> habilidade = habilidadeRepository.findById(id);
		if(habilidade.isPresent()) {
			Skill usu = habilidade.get();
			usu.setAtivo(false);
			habilidadeRepository.save(usu);
		}
	}
	
	public Skill save(Skill habilidade) {
		Skill newHabilidade = habilidadeRepository.save(habilidade);
		return newHabilidade;
	}
	
	public Skill update(Skill habilidade, Integer id) {
		habilidade.setId(id);
		return habilidadeRepository.save(habilidade);
	}


}
