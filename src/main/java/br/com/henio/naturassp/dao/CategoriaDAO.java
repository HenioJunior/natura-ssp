package br.com.henio.naturassp.dao;

import br.com.henio.naturassp.model.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CategoriaDAO extends CrudRepository<Categoria, Integer> {

    public ArrayList<Categoria> findByNomeContaining(String palavra);

}
