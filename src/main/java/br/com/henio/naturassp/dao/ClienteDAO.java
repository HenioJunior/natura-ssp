package br.com.henio.naturassp.dao;

import br.com.henio.naturassp.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {

    public Cliente findByEmailOrTelefone(String email, String telefone);
}
