
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
 *         &lt;element name="signatureData" type="{http://schemas.microsoft.com/Message}StreamBody"/>
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
    "signatureData"
})
@XmlRootElement(name = "SaveTransactionSignature")
public class SaveTransactionSignature {

    @XmlElement(required = true)
    protected byte[] signatureData;

    /**
     * Gets the value of the signatureData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignatureData() {
        return signatureData;
    }

    /**
     * Sets the value of the signatureData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignatureData(byte[] value) {
        this.signatureData = value;
    }

}
