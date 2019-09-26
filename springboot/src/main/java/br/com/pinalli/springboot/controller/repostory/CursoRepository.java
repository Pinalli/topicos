package br.com.pinalli.springboot.controller.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pinalli.springboot.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}
