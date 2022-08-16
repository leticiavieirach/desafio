package br.com.neki.desafio.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.desafio.entities.UserSkill;
import br.com.neki.desafio.services.UserSkillService;

@RestController
@RequestMapping("/usuarioHabilidade")
public class UserSkillController {
	
	@Autowired
	private UserSkillService usuarioHabilidadeService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<UserSkill>> findAll() {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(usuarioHabilidadeService.findAll(), headers, HttpStatus.OK);
	}

}
