package br.com.neki.desafio.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.desafio.entities.Skill;
import br.com.neki.desafio.services.SkillService;

@RestController
@RequestMapping("/habilidade")
public class SkillController {
	
	@Autowired
	private SkillService habilidadeService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Skill>> findAll() {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(habilidadeService.findAll(), headers, HttpStatus.OK);
	}

}