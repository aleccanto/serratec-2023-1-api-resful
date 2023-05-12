package br.org.serratec.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.biblioteca.entity.Livro;
import br.org.serratec.biblioteca.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;

	public List<Livro> findAll() {
		return repository.findAll();
	}

	public Livro findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public Livro create(Livro livro) {
		return repository.save(livro);
	}

	public Livro update(Long id, Livro livro) {
		Livro livroEntity = this.findById(id);
		updateEntity(livro, livroEntity);
		return livroEntity;
	}

	public void delete(Long id) {
		Livro livro = findById(id);
		if (livro != null) {
			repository.deleteById(id);
		}
	}

	private void updateEntity(Livro livro, Livro livroEntity) {
		if (livroEntity != null) {
			if (livro.getEditora() != null) {
				livroEntity.setEditora(livro.getEditora());
			}
			if (!livro.getEmprestimoItems().isEmpty()) {
				livroEntity.setEmprestimoItems(livro.getEmprestimoItems());
			}
		}
	}
}
