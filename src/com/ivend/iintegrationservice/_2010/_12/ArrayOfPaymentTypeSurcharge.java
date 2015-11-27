
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPaymentTypeSurcharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPaymentTypeSurcharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentTypeSurcharge" type="{http://www.iVend.com/IIntegrationService/2010/12}PaymentTypeSurcharge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaymentTypeSurcharge", propOrder = {
    "paymentTypeSurcharges"
})
public class ArrayOfPaymentTypeSurcharge {

    @XmlElement(name = "PaymentTypeSurcharge", nillable = true)
    protected List<PaymentTypeSurcharge> paymentTypeSurcharges;

    /**
     * Gets the value of the paymentTypeSurcharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTypeSurcharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTypeSurcharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTypeSurcharge }
     * 
     * 
     */
    public List<PaymentTypeSurcharge> getPaymentTypeSurcharges() {
        if (paymentTypeSurcharges == null) {
            paymentTypeSurcharges = new ArrayList<PaymentTypeSurcharge>();
        }
        return this.paymentTypeSurcharges;
    }

}
