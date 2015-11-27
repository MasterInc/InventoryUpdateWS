
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
 *         &lt;element name="GetTaxCodeResult" type="{http://www.iVend.com/IIntegrationService/2010/12}TaxCode" minOccurs="0"/>
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
    "getTaxCodeResult"
})
@XmlRootElement(name = "GetTaxCodeResponse")
public class GetTaxCodeResponse {

    @XmlElementRef(name = "GetTaxCodeResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxCode> getTaxCodeResult;

    /**
     * Gets the value of the getTaxCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     
     */
    public JAXBElement<TaxCode> getGetTaxCodeResult() {
        return getTaxCodeResult;
    }

    /**
     * Sets the value of the getTaxCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     
     */
    public void setGetTaxCodeResult(JAXBElement<TaxCode> value) {
        this.getTaxCodeResult = value;
    }

}
