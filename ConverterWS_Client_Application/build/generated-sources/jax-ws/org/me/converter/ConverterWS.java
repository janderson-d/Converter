
package org.me.converter;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConverterWS", targetNamespace = "http://converter.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConverterWS {


    /**
     * 
     * @param euro
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "euroUsd", targetNamespace = "http://converter.me.org/", className = "org.me.converter.EuroUsd")
    @ResponseWrapper(localName = "euroUsdResponse", targetNamespace = "http://converter.me.org/", className = "org.me.converter.EuroUsdResponse")
    @Action(input = "http://converter.me.org/ConverterWS/euroUsdRequest", output = "http://converter.me.org/ConverterWS/euroUsdResponse")
    public double euroUsd(
        @WebParam(name = "euro", targetNamespace = "")
        double euro);

    /**
     * 
     * @param usd
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "usdEuro", targetNamespace = "http://converter.me.org/", className = "org.me.converter.UsdEuro")
    @ResponseWrapper(localName = "usdEuroResponse", targetNamespace = "http://converter.me.org/", className = "org.me.converter.UsdEuroResponse")
    @Action(input = "http://converter.me.org/ConverterWS/usdEuroRequest", output = "http://converter.me.org/ConverterWS/usdEuroResponse")
    public double usdEuro(
        @WebParam(name = "usd", targetNamespace = "")
        double usd);

}