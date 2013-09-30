package com.knight.estoque.services.autoresservice.v1;

import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.soap.AddressingFeature;

import com.knight.estoque.domain.v1.Autor;

public class Cliente {

	private static boolean ehAssincrono = true;
	private static String enderecoResposta = "http://localhost:8080/soa-cap07-wsaddressing-1/AutoresServiceCallback";

	public static void main(String[] args) {
		AutoresService service = null;

		if (ehAssincrono) {
			service = new AutoresService_Service()
					.getAutoresServiceSOAP(new AddressingFeature());
			List<Handler> handlerChain = ((BindingProvider) service)
					.getBinding().getHandlerChain();

			handlerChain.add(new AddressingHandler(enderecoResposta));
			((BindingProvider) service).getBinding().setHandlerChain(
					handlerChain);

		} else {
			service = new AutoresService_Service().getAutoresServiceSOAP();
		}

		List<Autor> autores = service.solicitarRelacaoDeAutores(null);

		for (Autor autor : autores) {
			System.out.println(autor.getNome());
		}

	}

}
