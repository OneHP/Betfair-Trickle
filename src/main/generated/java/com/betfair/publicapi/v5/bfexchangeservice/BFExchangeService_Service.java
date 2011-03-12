
/*
 * 
 */

package com.betfair.publicapi.v5.bfexchangeservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Sat Mar 12 13:45:58 GMT 2011
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "BFExchangeService", 
                  wsdlLocation = "https://api.betfair.com/exchange/v5/BFExchangeService.wsdl",
                  targetNamespace = "http://www.betfair.com/publicapi/v5/BFExchangeService/") 
public class BFExchangeService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "BFExchangeService");
    public final static QName BFExchangeService = new QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "BFExchangeService");
    static {
        URL url = null;
        try {
            url = new URL("https://api.betfair.com/exchange/v5/BFExchangeService.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from https://api.betfair.com/exchange/v5/BFExchangeService.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public BFExchangeService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BFExchangeService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BFExchangeService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns BFExchangeService
     */
    @WebEndpoint(name = "BFExchangeService")
    public BFExchangeService getBFExchangeService() {
        return super.getPort(BFExchangeService, BFExchangeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BFExchangeService
     */
    @WebEndpoint(name = "BFExchangeService")
    public BFExchangeService getBFExchangeService(WebServiceFeature... features) {
        return super.getPort(BFExchangeService, BFExchangeService.class, features);
    }

}
