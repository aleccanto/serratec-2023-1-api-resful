package br.org.serratec.biblioteca.dto;

import br.org.serratec.biblioteca.entity.Livro;

public class LivroDTO {

	private Long id;

	private String titulo;

	private Long editoraId;

	public LivroDTO() {

	}

	public LivroDTO(Livro livro) {
		this.id = livro.getId();
		this.titulo = livro.getTitulo();
		if (livro.getEditora() != null) {
			this.editoraId = livro.getEditora().getId();
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getEditoraId() {
		return editoraId;
	}

	public void setEditoraId(Long editoraId) {
		this.editoraId = editoraId;
	}

}
