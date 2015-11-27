
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
 *         &lt;element name="GetManufacturerResult" type="{http://www.iVend.com/IIntegrationService/2010/12}Manufacturer" minOccurs="0"/>
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
    "getManufacturerResult"
})
@XmlRootElement(name = "GetManufacturerResponse")
public class GetManufacturerResponse {

    @XmlElementRef(name = "GetManufacturerResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Manufacturer> getManufacturerResult;

    /**
     * Gets the value of the getManufacturerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}
     *     
     */
    public JAXBElement<Manufacturer> getGetManufacturerResult() {
        return getManufacturerResult;
    }

    /**
     * Sets the value of the getManufacturerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}
     *     
     */
    public void setGetManufacturerResult(JAXBElement<Manufacturer> value) {
        this.getManufacturerResult = value;
    }

}
