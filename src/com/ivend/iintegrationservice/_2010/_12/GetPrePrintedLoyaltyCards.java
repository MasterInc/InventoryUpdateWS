
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
 *         &lt;element name="udid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apiToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "udid",
    "apiToken"
})
@XmlRootElement(name = "GetPrePrintedLoyaltyCards")
public class GetPrePrintedLoyaltyCards {

    @XmlElementRef(name = "udid", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udid;
    @XmlElementRef(name = "apiToken", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apiToken;

    /**
     * Gets the value of the udid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUdid() {
        return udid;
    }

    /**
     * Sets the value of the udid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUdid(JAXBElement<String> value) {
        this.udid = value;
    }

    /**
     * Gets the value of the apiToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApiToken() {
        return apiToken;
    }

    /**
     * Sets the value of the apiToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApiToken(JAXBElement<String> value) {
        this.apiToken = value;
    }

}
