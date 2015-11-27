
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
 *         &lt;element name="GetCountryResult" type="{http://www.iVend.com/IIntegrationService/2010/12}Country" minOccurs="0"/>
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
    "getCountryResult"
})
@XmlRootElement(name = "GetCountryResponse")
public class GetCountryResponse {

    @XmlElementRef(name = "GetCountryResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Country> getCountryResult;

    /**
     * Gets the value of the getCountryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Country }{@code >}
     *     
     */
    public JAXBElement<Country> getGetCountryResult() {
        return getCountryResult;
    }

    /**
     * Sets the value of the getCountryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Country }{@code >}
     *     
     */
    public void setGetCountryResult(JAXBElement<Country> value) {
        this.getCountryResult = value;
    }

}
