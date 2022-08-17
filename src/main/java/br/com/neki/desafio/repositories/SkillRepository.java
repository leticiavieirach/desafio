package br.com.neki.desafio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.neki.desafio.entities.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
	
	@Query(value = "select * from teste_residencia.skill where ativo = true", nativeQuery = true)
	List<Skill> findAllAtivos();

}