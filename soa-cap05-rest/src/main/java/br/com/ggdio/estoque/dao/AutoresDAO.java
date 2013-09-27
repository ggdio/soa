package br.com.ggdio.estoque.dao;

import java.util.Arrays;
import java.util.List;

import br.com.ggdio.estoque.model.Autor;

public class AutoresDAO {
	
	public List<Autor> listarAutores(){
		return Arrays.asList(new Autor("Paulo Silveira"),new Autor("Guilherme Silveira"),new Autor("Alexandre Saudate"));
	}
	
}
