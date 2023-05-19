package br.org.serratec.biblioteca.dto;

import br.org.serratec.biblioteca.entity.EmprestimoItem;

public class EmprestimoItemDTO {

	private Long id;

	private Long emprestimoId;

	private Long livroId;

	public EmprestimoItemDTO() {

	}

	public EmprestimoItemDTO(EmprestimoItem emprestimoItem) {
		this.id = emprestimoItem.getId();
		this.emprestimoId = emprestimoItem.getEmprestimo().getId();
		this.livroId = emprestimoItem.getLivro().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmprestimoId() {
		return emprestimoId;
	}

	public void setEmprestimoId(Long emprestimoId) {
		this.emprestimoId = emprestimoId;
	}

	public Long getLivroId() {
		return livroId;
	}

	public void setLivroId(Long livroId) {
		this.livroId = livroId;
	}

}
