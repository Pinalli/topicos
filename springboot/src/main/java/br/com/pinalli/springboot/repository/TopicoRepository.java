package br.com.pinalli.springboot.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pinalli.springboot.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico,Long>{

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);

	

}
