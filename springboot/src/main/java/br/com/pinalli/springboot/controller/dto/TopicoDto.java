package br.com.pinalli.springboot.controller.dto;

import java.time.LocalDateTime;



import org.springframework.data.domain.Page;

import br.com.pinalli.springboot.model.Topico;

public class TopicoDto {  //DTO (Data Transfer Object)
	
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


	public static Page<TopicoDto> converter(Page<Topico> topicos) {
		
		return topicos.map(TopicoDto:: new);
	}
	
	
}
