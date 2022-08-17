package br.com.neki.desafio.controlers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.desafio.entities.Skill;
import br.com.neki.desafio.entities.User;
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
	
	@GetMapping("/{id}")
	public ResponseEntity<Skill> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(habilidadeService.findById(id), headers, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		habilidadeService.deleteLogical(id);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Skill update(@Valid @RequestBody Skill skill, @PathVariable Integer id) {
		return habilidadeService.update(skill, id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Skill> save(@Valid @RequestBody Skill skill) {
		HttpHeaders headers = new HttpHeaders();
		Skill newHabilidade = habilidadeService.save(skill);
		if(null != newHabilidade) {
			return new ResponseEntity<>(newHabilidade, headers, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(newHabilidade, headers, HttpStatus.BAD_REQUEST);
		}
	
	}
}