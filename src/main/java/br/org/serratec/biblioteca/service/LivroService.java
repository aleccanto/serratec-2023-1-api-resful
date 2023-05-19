package br.org.serratec.biblioteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.biblioteca.dto.LivroDTO;
import br.org.serratec.biblioteca.entity.Livro;
import br.org.serratec.biblioteca.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;

	public List<LivroDTO> findAll() {

		return repository.findAll().stream().map(item -> new LivroDTO(item)).toList();
	}

	public LivroDTO findById(Long id) {
		Optional<Livro> livro = repository.findById(id);
		if (livro.isPresent()) {
			return new LivroDTO(livro.get());
		}
		return null;
	}

	public LivroDTO create(LivroDTO livro) {
		Livro livroEntity = new Livro();
		livroEntity.setTitulo(livro.getTitulo());
		return new LivroDTO(repository.save(livroEntity));
	}

	public Livro update(Long id, Livro livro) {
		Livro livroEntity = null;
		if (livroEntity != null) {
			if (livro.getEditora() != null) {
				livroEntity.setEditora(livro.getEditora());
			}
			if (!livro.getEmprestimoItems().isEmpty()) {
				livroEntity.setEmprestimoItems(livro.getEmprestimoItems());
			}
		}
		return livroEntity;
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}
