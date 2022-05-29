package br.com.henio.naturassp.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.henio.naturassp.model.Categoria;
import br.com.henio.naturassp.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

    public ArrayList<Produto> findAllByDisponivel(int disponivel);
    public ArrayList<Produto>findAllByDisponivelAndCategoria(int disponivel, Categoria cat);
	public ArrayList<Produto> findAllByCategoria(Categoria categoria);
    
    // o findAll retorna uma interface Iterable e essa interface é compativel com ArrayList

}
