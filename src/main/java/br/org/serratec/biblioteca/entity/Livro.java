package br.org.serratec.biblioteca.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String titulo;

	@ManyToOne
	@JoinColumn(name = "editora_id")
	private Editora editora;

	@OneToMany(mappedBy = "livro")
	private List<EmprestimoItem> emprestimoItems = new ArrayList<>();

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

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public List<EmprestimoItem> getEmprestimoItems() {
		return emprestimoItems;
	}

	public void setEmprestimoItems(List<EmprestimoItem> emprestimoItems) {
		this.emprestimoItems = emprestimoItems;
	}

}
