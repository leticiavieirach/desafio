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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.desafio.dto.UserDTO;
import br.com.neki.desafio.entities.User;
import br.com.neki.desafio.services.UserService;

@RestController
@RequestMapping("/usuario")
public class UserController {
	
	@Autowired
	private UserService usuarioService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<User>> findAll() {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(usuarioService.findAll(), headers, HttpStatus.OK);
	}

	@GetMapping("/login")
	public String login(@Valid @RequestParam String login, @RequestParam String senha) {
		return usuarioService.loginApp(login, senha);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(usuarioService.findById(id), headers, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		usuarioService.deleteLogical(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<User> cadastro(@Valid @RequestBody UserDTO user) {
		HttpHeaders headers = new HttpHeaders();
		User newUser = usuarioService.save(user);
		if(null != newUser) {
			return new ResponseEntity<>(newUser, headers, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(newUser, headers, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public User update(@Valid @RequestBody User user, @PathVariable Integer id) {
		return usuarioService.update(user, id);
	}
}
