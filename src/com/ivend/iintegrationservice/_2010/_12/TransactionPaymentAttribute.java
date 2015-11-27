
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionPaymentAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionPaymentAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="PaymentTypeAttributeKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CustomInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionPaymentAttribute", propOrder = {
    "paymentTypeAttributeKey",
    "customInformation"
})
public class TransactionPaymentAttribute
    extends BaseWrapper
{

    @XmlElement(name = "PaymentTypeAttributeKey")
    protected long paymentTypeAttributeKey;
    @XmlElement(name = "CustomInformation", required = true, nillable = true)
    protected String customInformation;

    /**
     * Gets the value of the paymentTypeAttributeKey property.
     * 
     */
    public long getPaymentTypeAttributeKey() {
        return paymentTypeAttributeKey;
    }

    /**
     * Sets the value of the paymentTypeAttributeKey property.
     * 
     */
    public void setPaymentTypeAttributeKey(long value) {
        this.paymentTypeAttributeKey = value;
    }

    /**
     * Gets the value of the customInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomInformation() {
        return customInformation;
    }

    /**
     * Sets the value of the customInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomInformation(String value) {
        this.customInformation = value;
    }

}
