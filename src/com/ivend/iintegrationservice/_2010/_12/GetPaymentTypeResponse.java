
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
 *         &lt;element name="GetPaymentTypeResult" type="{http://www.iVend.com/IIntegrationService/2010/12}PaymentType" minOccurs="0"/>
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
    "getPaymentTypeResult"
})
@XmlRootElement(name = "GetPaymentTypeResponse")
public class GetPaymentTypeResponse {

    @XmlElementRef(name = "GetPaymentTypeResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<PaymentType> getPaymentTypeResult;

    /**
     * Gets the value of the getPaymentTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaymentType }{@code >}
     *     
     */
    public JAXBElement<PaymentType> getGetPaymentTypeResult() {
        return getPaymentTypeResult;
    }

    /**
     * Sets the value of the getPaymentTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaymentType }{@code >}
     *     
     */
    public void setGetPaymentTypeResult(JAXBElement<PaymentType> value) {
        this.getPaymentTypeResult = value;
    }

}
