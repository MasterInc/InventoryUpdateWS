
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
 *         &lt;element name="GetPrePrintedLoyaltyCardsBySiteIdResult" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfLoyaltyPrePrintedCards" minOccurs="0"/>
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
    "getPrePrintedLoyaltyCardsBySiteIdResult"
})
@XmlRootElement(name = "GetPrePrintedLoyaltyCardsBySiteIdResponse")
public class GetPrePrintedLoyaltyCardsBySiteIdResponse {

    @XmlElementRef(name = "GetPrePrintedLoyaltyCardsBySiteIdResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLoyaltyPrePrintedCards> getPrePrintedLoyaltyCardsBySiteIdResult;

    /**
     * Gets the value of the getPrePrintedLoyaltyCardsBySiteIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLoyaltyPrePrintedCards }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLoyaltyPrePrintedCards> getGetPrePrintedLoyaltyCardsBySiteIdResult() {
        return getPrePrintedLoyaltyCardsBySiteIdResult;
    }

    /**
     * Sets the value of the getPrePrintedLoyaltyCardsBySiteIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLoyaltyPrePrintedCards }{@code >}
     *     
     */
    public void setGetPrePrintedLoyaltyCardsBySiteIdResult(JAXBElement<ArrayOfLoyaltyPrePrintedCards> value) {
        this.getPrePrintedLoyaltyCardsBySiteIdResult = value;
    }

}
