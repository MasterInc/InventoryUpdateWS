
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetCardSetupMethodResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "getCardSetupMethodResult"
})
@XmlRootElement(name = "GetCardSetupMethodResponse")
public class GetCardSetupMethodResponse {

    @XmlElement(name = "GetCardSetupMethodResult")
    protected Integer getCardSetupMethodResult;

    /**
     * Gets the value of the getCardSetupMethodResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetCardSetupMethodResult() {
        return getCardSetupMethodResult;
    }

    /**
     * Sets the value of the getCardSetupMethodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetCardSetupMethodResult(Integer value) {
        this.getCardSetupMethodResult = value;
    }

}
