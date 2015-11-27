
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X_GetExchangeRateResult" type="{http://www.iVend.com/IIntegrationService/2010/12}ExchangeRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xGetExchangeRateResult"
})
@XmlRootElement(name = "X_GetExchangeRateResponse")
public class XGetExchangeRateResponse {

    @XmlElementRef(name = "X_GetExchangeRateResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ExchangeRate> xGetExchangeRateResult;

    /**
     * Gets the value of the xGetExchangeRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     
     */
    public JAXBElement<ExchangeRate> getXGetExchangeRateResult() {
        return xGetExchangeRateResult;
    }

    /**
     * Sets the value of the xGetExchangeRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     
     */
    public void setXGetExchangeRateResult(JAXBElement<ExchangeRate> value) {
        this.xGetExchangeRateResult = value;
    }

}
