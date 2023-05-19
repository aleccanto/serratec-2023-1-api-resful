package br.org.serratec.biblioteca.dto;

import br.org.serratec.biblioteca.entity.Pessoa;

public class PessoaDTO {

	private Long id;

	private String nome;

	public PessoaDTO() {

	}

	public PessoaDTO(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
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
