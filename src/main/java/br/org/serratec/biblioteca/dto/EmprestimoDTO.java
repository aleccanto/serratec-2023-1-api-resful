package br.org.serratec.biblioteca.dto;

import java.util.ArrayList;
import java.util.List;

import br.org.serratec.biblioteca.entity.Emprestimo;

public class EmprestimoDTO {

	private Long id;

	private Long pessoaId;

	private List<EmprestimoItemDTO> itensEmprestimoDTO = new ArrayList<>();

	public EmprestimoDTO() {

	}

	public EmprestimoDTO(Emprestimo emprestimo) {
		
		this.id = emprestimo.getId();
		this.pessoaId = emprestimo.getPessoa().getId();

		emprestimo.getEmprestimoItems().forEach(item -> {
			EmprestimoItemDTO emprestimoItemDTO = new EmprestimoItemDTO(item);
			this.itensEmprestimoDTO.add(emprestimoItemDTO);
		});
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}

	public List<EmprestimoItemDTO> getItensEmprestimoDTO() {
		return itensEmprestimoDTO;
	}

	public void setItensEmprestimoDTO(List<EmprestimoItemDTO> itensEmprestimoDTO) {
		this.itensEmprestimoDTO = itensEmprestimoDTO;
	}

}
