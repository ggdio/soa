
package com.knight.estoque.services.autoresservice.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AutoresService", targetNamespace = "http://knight.com/estoque/services/AutoresService/v1", wsdlLocation = "http://localhost:8080/soa-cap07-wsaddressing-servidor-0.0.1-SNAPSHOT/AutoresService?wsdl")
public class AutoresService_Service
    extends Service
{

    private final static URL AUTORESSERVICE_WSDL_LOCATION;
    private final static WebServiceException AUTORESSERVICE_EXCEPTION;
    private final static QName AUTORESSERVICE_QNAME = new QName("http://knight.com/estoque/services/AutoresService/v1", "AutoresService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/soa-cap07-wsaddressing-1/AutoresService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AUTORESSERVICE_WSDL_LOCATION = url;
        AUTORESSERVICE_EXCEPTION = e;
    }

    public AutoresService_Service() {
        super(__getWsdlLocation(), AUTORESSERVICE_QNAME);
    }

    public AutoresService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), AUTORESSERVICE_QNAME, features);
    }

    public AutoresService_Service(URL wsdlLocation) {
        super(wsdlLocation, AUTORESSERVICE_QNAME);
    }

    public AutoresService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AUTORESSERVICE_QNAME, features);
    }

    public AutoresService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AutoresService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AutoresService
     */
    @WebEndpoint(name = "AutoresServiceSOAP")
    public AutoresService getAutoresServiceSOAP() {
        return super.getPort(new QName("http://knight.com/estoque/services/AutoresService/v1", "AutoresServiceSOAP"), AutoresService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AutoresService
     */
    @WebEndpoint(name = "AutoresServiceSOAP")
    public AutoresService getAutoresServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://knight.com/estoque/services/AutoresService/v1", "AutoresServiceSOAP"), AutoresService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AUTORESSERVICE_EXCEPTION!= null) {
            throw AUTORESSERVICE_EXCEPTION;
        }
        return AUTORESSERVICE_WSDL_LOCATION;
    }

}
