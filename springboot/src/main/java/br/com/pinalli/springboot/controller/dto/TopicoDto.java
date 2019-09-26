package br.com.pinalli.springboot.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.pinalli.springboot.model.Topico;

public class TopicoDto {  //(Data Transfer Object)
	
	private long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
		
	}
	
	
	public long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCricao() {
		return dataCriacao;
	}


	public static List<TopicoDto> converter(List<Topico> topicos) {
		
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
	
	
}
