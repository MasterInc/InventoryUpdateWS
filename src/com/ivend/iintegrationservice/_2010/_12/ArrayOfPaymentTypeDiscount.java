
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPaymentTypeDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPaymentTypeDiscount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentTypeDiscount" type="{http://www.iVend.com/IIntegrationService/2010/12}PaymentTypeDiscount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaymentTypeDiscount", propOrder = {
    "paymentTypeDiscounts"
})
public class ArrayOfPaymentTypeDiscount {

    @XmlElement(name = "PaymentTypeDiscount", nillable = true)
    protected List<PaymentTypeDiscount> paymentTypeDiscounts;

    /**
     * Gets the value of the paymentTypeDiscounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTypeDiscounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTypeDiscounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTypeDiscount }
     * 
     * 
     */
    public List<PaymentTypeDiscount> getPaymentTypeDiscounts() {
        if (paymentTypeDiscounts == null) {
            paymentTypeDiscounts = new ArrayList<PaymentTypeDiscount>();
        }
        return this.paymentTypeDiscounts;
    }

}
