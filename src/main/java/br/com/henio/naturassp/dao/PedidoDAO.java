package br.com.henio.naturassp.dao;

import br.com.henio.naturassp.model.Cliente;
import br.com.henio.naturassp.model.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {

    public ArrayList<Pedido> findAllByCliente(Cliente cliente);
}
