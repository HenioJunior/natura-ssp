package br.com.henio.naturassp.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.henio.naturassp.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	public Usuario findByUsernameOrEmail(String username, String email);

}
