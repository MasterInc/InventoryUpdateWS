
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
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
 *         &lt;element name="X_GetGiftCertificateBalanceResult" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    "xGetGiftCertificateBalanceResult"
})
@XmlRootElement(name = "X_GetGiftCertificateBalanceResponse")
public class XGetGiftCertificateBalanceResponse {

    @XmlElement(name = "X_GetGiftCertificateBalanceResult")
    protected BigDecimal xGetGiftCertificateBalanceResult;

    /**
     * Gets the value of the xGetGiftCertificateBalanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXGetGiftCertificateBalanceResult() {
        return xGetGiftCertificateBalanceResult;
    }

    /**
     * Sets the value of the xGetGiftCertificateBalanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXGetGiftCertificateBalanceResult(BigDecimal value) {
        this.xGetGiftCertificateBalanceResult = value;
    }

}
