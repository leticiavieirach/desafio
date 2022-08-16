package br.com.neki.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.neki.desafio.entities.UserSkill;

@Repository
public interface UserSkillRepository  extends JpaRepository<UserSkill, Integer>{

}