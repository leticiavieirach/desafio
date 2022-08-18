package br.com.neki.desafio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.neki.desafio.dto.UserSkillAssociadasDTO;
import br.com.neki.desafio.entities.UserSkill;

@Repository
public interface UserSkillRepository  extends JpaRepository<UserSkill, Integer>{

	@Query(value = "select us.id as idUsuarioHabilidade,\r\n"
			+ "us.knowledge_level as nivelHabilidadeUsuario,\r\n"
			+ "us.created_at as dataCriacao,\r\n"
			+ "us.updated_at as dataAtualizacao,\r\n"
			+ "u.login as loginUsuario,\r\n"
			+ "s.name as nomeHabilidade\r\n"
			+ "from teste_residencia.user_skill us \r\n"
			+ "inner join teste_residencia.user u on u.id = us.user_id\r\n"
			+ "inner join teste_residencia.skill s on s.id = us.skill_id\r\n"
			+ "where us.user_id = :id", nativeQuery = true)
	List<UserSkillAssociadasDTO> findAllSkills(Integer id);
	
}