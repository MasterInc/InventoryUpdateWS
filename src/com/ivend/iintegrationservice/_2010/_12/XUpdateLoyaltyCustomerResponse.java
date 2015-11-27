
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
 *         &lt;element name="X_UpdateLoyaltyCustomerResult" type="{http://www.iVend.com/IIntegrationService/2010/12}Customer" minOccurs="0"/>
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
    "xUpdateLoyaltyCustomerResult"
})
@XmlRootElement(name = "X_UpdateLoyaltyCustomerResponse")
public class XUpdateLoyaltyCustomerResponse {

    @XmlElementRef(name = "X_UpdateLoyaltyCustomerResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Customer> xUpdateLoyaltyCustomerResult;

    /**
     * Gets the value of the xUpdateLoyaltyCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public JAXBElement<Customer> getXUpdateLoyaltyCustomerResult() {
        return xUpdateLoyaltyCustomerResult;
    }

    /**
     * Sets the value of the xUpdateLoyaltyCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public void setXUpdateLoyaltyCustomerResult(JAXBElement<Customer> value) {
        this.xUpdateLoyaltyCustomerResult = value;
    }

}
