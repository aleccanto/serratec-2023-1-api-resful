package br.org.serratec.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.biblioteca.entity.Livro;
import br.org.serratec.biblioteca.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	private LivroService service;

//	http://localhost:8080/livro
	@GetMapping
	public ResponseEntity<List<Livro>> getAll() {
		return ResponseEntity.ok(service.findAll());
	}

//	http://localhost:8080/livro/:id
	@GetMapping("/{id}")
	public ResponseEntity<Livro> getById(@PathVariable Long id) {
		System.out.println(id);
		return ResponseEntity.ok(service.findById(id));
	}
}
