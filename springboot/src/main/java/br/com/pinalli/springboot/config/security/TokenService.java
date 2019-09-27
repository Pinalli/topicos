package br.com.pinalli.springboot.config.security;

import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.pinalli.springboot.model.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service  //LOGICA PATA GERAR O TOKEN
public class TokenService {
		
	@Value("${springBoot.jwt.expiration}")
    private String expiration;
	
	@Value("${springBoot.jwt.secret}")
	private String secret;

			public String gerarToken (Authentication authentication) {
			Usuario logado = (Usuario) authentication.getPrincipal();
			Date hoje = new Date();
			Date dataExpiracao = new Date(hoje.getTime() + expiration);
			
			return Jwts.builder()
					.setIssuer("API do Spring Boot")
					.setSubject(logado.getId().toString())
					.setIssuedAt(hoje)
					.setExpiration(dataExpiracao)
					.signWith(SignatureAlgorithm.HS256, secret)
					.compact();
		}
}
