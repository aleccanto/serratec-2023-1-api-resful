package br.org.serratec.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.biblioteca.entity.EmprestimoItem;

public interface EmprestimoItemRepository extends JpaRepository<EmprestimoItem, Long> {

}
