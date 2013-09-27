package br.com.ggdio.estoque.rest;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.ggdio.estoque.dao.AutoresDAO;
import br.com.ggdio.estoque.model.Autor;
import br.com.ggdio.estoque.model.Autores;

@Path("/autores")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class AutoresService {
	
	@GET
	@Path("/service-name")
	public Response serviceName(){
		return Response.ok("AutoresService !!!").build();
	}
	
	@POST
	public Response create(@Context UriInfo uriInfo, Autor autor){
		//Cria o usuario
		autor.setId(10L);
		UriBuilder uriBuilder = uriInfo.getAbsolutePathBuilder();
		URI location = uriBuilder.path("/{id}").build(autor);
		return Response.created(location).build();
	}
	
	@GET
	public Response listarAutores(){
		List<Autor> autores = obterDAO().listarAutores();
		return Response.ok(new Autores(autores)).build();
	}
	
	@GET
	@Path("/{id}")
	public Response find(@PathParam("id") Long id){
		String nome = "Autor de Teste";
		if(id == 10){
			nome = "Autor Criado";
		}
		Autor autor = new Autor(id,nome);
		return Response.ok(autor).build();
	}
	
	public AutoresDAO obterDAO(){
		return new AutoresDAO();
	}	
	
}
