package br.com.ggdio.estoque.services.autoresservice.v1;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.ggdio.estoque.domain.v1.Autor;

@WebService(endpointInterface = "br.com.ggdio.estoque.services.autoresservice.v1.AutoresService", 
			portName = "AutoresServiceSOAP", 
			serviceName = "AutoresService", 
			targetNamespace = "http://ggdio.com.br/estoque/services/AutoresService/v1", 
			wsdlLocation = "WEB-INF/contracts/AutoresService.wsdl")
public class AutoresServiceImpl implements AutoresService {

	@WebMethod(action = "AutoresService/ListarAutores")
	@WebResult(name = "autor",targetNamespace = "")
	@RequestWrapper(localName = "listarAutores", 
					targetNamespace="http://ggdio.com.br/estoque/services/AutoresService/v1", 
					className = "br.com.ggdio.estoque.services.autoresservice.v1.ListarAutores")
	@ResponseWrapper(localName = "listarAutoresResponse",
					 targetNamespace = "http://ggdio.com.br/estoque/services/AutoresService/v1",
					 className = "br.com.ggdio.estoque.services.autoresservice.v1.ListarAutoresResponse")
	public List<Autor> listarAutores() {
		// TODO Auto-generated method stub
		return null;
	}

}
