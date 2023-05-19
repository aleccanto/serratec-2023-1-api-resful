package br.org.serratec.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.biblioteca.dto.LivroDTO;
import br.org.serratec.biblioteca.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	private LivroService service;

//	http://localhost:8080/livro
	@GetMapping
	public ResponseEntity<List<LivroDTO>> getAll() {
		return ResponseEntity.ok(service.findAll());
	}

//	http://localhost:8080/livro/:id
	@GetMapping("/{id}")
	public ResponseEntity<LivroDTO> getById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@PostMapping
	public ResponseEntity<LivroDTO> create(@RequestBody LivroDTO livro) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(livro));
	}
}
