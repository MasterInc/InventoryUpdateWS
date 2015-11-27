
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
 *         &lt;element name="RollBackRedeemedPointsResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "rollBackRedeemedPointsResult"
})
@XmlRootElement(name = "RollBackRedeemedPointsResponse")
public class RollBackRedeemedPointsResponse {

    @XmlElement(name = "RollBackRedeemedPointsResult")
    protected Boolean rollBackRedeemedPointsResult;

    /**
     * Gets the value of the rollBackRedeemedPointsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollBackRedeemedPointsResult() {
        return rollBackRedeemedPointsResult;
    }

    /**
     * Sets the value of the rollBackRedeemedPointsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollBackRedeemedPointsResult(Boolean value) {
        this.rollBackRedeemedPointsResult = value;
    }

}
