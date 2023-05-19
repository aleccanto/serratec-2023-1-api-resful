package br.org.serratec.biblioteca.dto;

import br.org.serratec.biblioteca.entity.Editora;

public class EditoraDTO {

	private Long id;

	private String nome;

	public EditoraDTO() {

	}

	public EditoraDTO(Editora editora) {
		this.id = editora.getId();
		this.nome = editora.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
