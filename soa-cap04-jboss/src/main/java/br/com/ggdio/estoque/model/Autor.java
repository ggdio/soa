package br.com.ggdio.estoque.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Autor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;

	public Autor(String nome) {
		this.nome = nome;
	}
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
