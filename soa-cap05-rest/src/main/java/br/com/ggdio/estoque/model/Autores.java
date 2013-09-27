package br.com.ggdio.estoque.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Autores {

	@XmlElement(name="autor")
	private List<Autor> lista;
	
	public Autores() {
		// TODO Auto-generated constructor stub
	}

	public Autores(List<Autor> lista) {
		this.lista = lista;
	}

	public List<Autor> getLista() {
		return lista;
	}

	public void setLista(List<Autor> lista) {
		this.lista = lista;
	}
	
}
