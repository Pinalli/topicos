package br.com.pinalli.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pinalli.springboot.controller.dto.TopicoDto;

import br.com.pinalli.springboot.model.Topico;
import br.com.pinalli.springboot.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(String nomeCurso){
		if(nomeCurso == null) {
	List<Topico> topicos = topicoRepository.findAll();
	return TopicoDto.converter(topicos);
		}
		else {
		List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
		return TopicoDto.converter(topicos);
		}
		
		
	}
}
