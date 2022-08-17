package br.com.neki.desafio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.neki.desafio.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByLoginUsuario(String login);
	
	@Query(value = "select * from teste_residencia.user where ativo = true", nativeQuery = true)
	List<User> findAllAtivos();

}
