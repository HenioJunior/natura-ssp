package br.com.henio.naturassp.services;

import br.com.henio.naturassp.model.Categoria;

import java.util.ArrayList;

public interface ICategoriaService {

    public Categoria inserirNovaCategoria(Categoria categoria);

    public Categoria alterarCategoria(Categoria categoria);

    public ArrayList<Categoria> recuperarTodasCategorias();

    public ArrayList<Categoria> recuperarPorPalavraChave(String palavraChave);
}
