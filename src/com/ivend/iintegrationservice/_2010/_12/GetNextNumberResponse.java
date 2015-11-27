
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
 *         &lt;element name="GetNextNumberResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "getNextNumberResult"
})
@XmlRootElement(name = "GetNextNumberResponse")
public class GetNextNumberResponse {

    @XmlElement(name = "GetNextNumberResult")
    protected Long getNextNumberResult;

    /**
     * Gets the value of the getNextNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGetNextNumberResult() {
        return getNextNumberResult;
    }

    /**
     * Sets the value of the getNextNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGetNextNumberResult(Long value) {
        this.getNextNumberResult = value;
    }

}
