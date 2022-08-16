package br.com.neki.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.neki.desafio.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByLogin(String login);

}
