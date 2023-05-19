package br.org.serratec.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.biblioteca.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
