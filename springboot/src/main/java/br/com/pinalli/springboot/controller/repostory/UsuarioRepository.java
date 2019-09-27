package br.com.pinalli.springboot.controller.repostory;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.pinalli.springboot.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Optional <Usuario> findByEmail(String email);
}
