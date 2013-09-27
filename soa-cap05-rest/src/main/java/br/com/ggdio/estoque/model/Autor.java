package br.com.ggdio.estoque.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Autor {
	
	private Long id;
	private String nome;
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public Autor(String nome) {
		this(0L,nome);
	}
	
	public Autor(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
