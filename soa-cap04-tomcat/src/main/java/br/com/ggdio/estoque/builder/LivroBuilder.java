package br.com.ggdio.estoque.builder;

import java.util.ArrayList;
import java.util.List;

import br.com.ggdio.estoque.model.Autor;
import br.com.ggdio.estoque.model.Livro;

public class LivroBuilder {
	private Integer anoDePublicacao;
	private List<Autor> autores;
	private String editora;
	private String nome;
	private String resumo;
	
	public LivroBuilder() {
		this.autores = new ArrayList<Autor>();
	}
	
	public void clear(){
		this.anoDePublicacao = 0;
		this.autores = new ArrayList<Autor>();
		this.editora = "";
		this.resumo = "";
		this.nome = "";
	}
	
	public LivroBuilder comNome(String nome){
		this.nome = nome;
		return this;
	}
	
	public LivroBuilder daEditoria(String editora){
		this.editora = editora;
		return this;
	}
	
	public LivroBuilder comResumo(String resumo){
		this.resumo = resumo;
		return this;
	}
	
	public LivroBuilder noAno(Integer ano){
		this.anoDePublicacao = ano;
		return this;
	}
	
	public LivroBuilder addAutor(Autor autor){
		this.autores.add(autor);
		return this;
	}
	
	public Livro constroi(){
		return new Livro(anoDePublicacao, autores, editora, nome, resumo);
	}
}
