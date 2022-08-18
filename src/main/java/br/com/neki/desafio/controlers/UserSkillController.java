package br.com.neki.desafio.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.desafio.dto.UserSkillAssociadasDTO;
import br.com.neki.desafio.entities.UserSkill;
import br.com.neki.desafio.services.UserSkillService;

@RestController
@RequestMapping("/usuarioHabilidade")
public class UserSkillController {
	
	@Autowired
	private UserSkillService usuarioHabilidadeService;
	
	@GetMapping("/listarSkills/{id}")
	public ResponseEntity<List<UserSkillAssociadasDTO>> listagemSkills(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(usuarioHabilidadeService.findAllSkills(id), headers, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public void excluirAssociacao(@PathVariable Integer id) {
		usuarioHabilidadeService.delete(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<UserSkill> associarSkill(@RequestParam Integer idUsuario, @RequestParam Integer idHabilidade, @RequestParam Integer level) {
		HttpHeaders headers = new HttpHeaders();
		UserSkill newUserSkill = usuarioHabilidadeService.save(idUsuario, idHabilidade, level);
		if(null != newUserSkill) {
			return new ResponseEntity<>(newUserSkill, headers, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(newUserSkill, headers, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public UserSkill atualizarAssociacao(@RequestParam Integer idUsuarioHabilidade, @RequestParam Integer level) {
		return usuarioHabilidadeService.update(idUsuarioHabilidade, level);
	}
	
}
