package br.com.neki.desafio.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.desafio.dto.UserSkillAssociadasDTO;
import br.com.neki.desafio.entities.Skill;
import br.com.neki.desafio.entities.User;
import br.com.neki.desafio.entities.UserSkill;
import br.com.neki.desafio.repositories.SkillRepository;
import br.com.neki.desafio.repositories.UserRepository;
import br.com.neki.desafio.repositories.UserSkillRepository;

@Service
public class UserSkillService {

	@Autowired
	private UserSkillRepository usuarioHabilidadeRepository;
	
	@Autowired
	private UserRepository usuarioRepository;
	
	@Autowired
	private SkillRepository habilidadeRepository;
	
	public List<UserSkillAssociadasDTO> findAllSkills(Integer id) {
		return usuarioHabilidadeRepository.findAllSkills(id);
	}

	public void delete(Integer id) {
		usuarioHabilidadeRepository.deleteById(id);
	}
	
	public UserSkill save(Integer idUsuario, Integer idHabilidade, Integer level) {
		LocalDate data = LocalDate.now();

		UserSkill usuarioHabilidade = new UserSkill();
		User usuario = usuarioRepository.findById(idUsuario).get();
		Skill habilidade = habilidadeRepository.findById(idHabilidade).get();
		
		usuarioHabilidade.setLevelHabilidadeUsuario(level);
		usuarioHabilidade.setUsuario(usuario);
		usuarioHabilidade.setHabilidade(habilidade);
		usuarioHabilidade.setDataCriacao(data);
		usuarioHabilidade.setDataAtualizacao(data);
		
		return usuarioHabilidadeRepository.save(usuarioHabilidade);
	}

	public UserSkill update(Integer idUsuarioHabilidade, Integer level) {
		UserSkill usuarioHabilidade = usuarioHabilidadeRepository.findById(idUsuarioHabilidade).get();
		
		usuarioHabilidade.setLevelHabilidadeUsuario(level);
		
		return usuarioHabilidadeRepository.save(usuarioHabilidade);
	}
	
}
