
package br.com.ggdio.estoque.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ListagemLivros", targetNamespace = "http://service.estoque.ggdio.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ListagemLivros {


    /**
     * 
     * @return
     *     returns java.util.List<br.com.ggdio.estoque.service.Livro>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarLivros", targetNamespace = "http://service.estoque.ggdio.com.br/", className = "br.com.ggdio.estoque.service.ListarLivros")
    @ResponseWrapper(localName = "listarLivrosResponse", targetNamespace = "http://service.estoque.ggdio.com.br/", className = "br.com.ggdio.estoque.service.ListarLivrosResponse")
    @Action(input = "http://service.estoque.ggdio.com.br/ListagemLivros/listarLivrosRequest", output = "http://service.estoque.ggdio.com.br/ListagemLivros/listarLivrosResponse")
    public List<Livro> listarLivros();

}