package br.com.neki.desafio.controlers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	public String loginApp(@Valid @RequestParam String login, @RequestParam String senha) {
		return usuarioService.loginApp(login, senha);
	}
}
