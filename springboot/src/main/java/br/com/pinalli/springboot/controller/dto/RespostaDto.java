package br.com.pinalli.springboot.controller.dto;

import java.time.LocalDateTime;

import br.com.pinalli.springboot.model.Resposta;

public class RespostaDto {

		private Long id;
		private String mensagem;
		private LocalDateTime dataCricao;
		private String nomeAutor;
		
		
		public RespostaDto(Resposta resposta) {
			this.id = resposta.getId();
			this.mensagem = resposta.getMensagem();
			this.dataCricao = resposta.getDataCriacao();
			this.nomeAutor = resposta.getAutor().getNome();
			
			
		}


		public Long getId() {
			return id;
		}


		public String getMensagem() {
			return mensagem;
		}


		public LocalDateTime getDataCricao() {
			return dataCricao;
		}


		public String getNomeAutor() {
			return nomeAutor;
		}
		
}
