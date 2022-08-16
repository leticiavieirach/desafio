package br.com.neki.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.neki.desafio.entities.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

}