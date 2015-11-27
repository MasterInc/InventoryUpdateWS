
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTransactionSurcharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTransactionSurcharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionSurcharge" type="{http://www.iVend.com/IIntegrationService/2010/12}TransactionSurcharge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransactionSurcharge", propOrder = {
    "transactionSurcharges"
})
public class ArrayOfTransactionSurcharge {

    @XmlElement(name = "TransactionSurcharge", nillable = true)
    protected List<TransactionSurcharge> transactionSurcharges;

    /**
     * Gets the value of the transactionSurcharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionSurcharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionSurcharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionSurcharge }
     * 
     * 
     */
    public List<TransactionSurcharge> getTransactionSurcharges() {
        if (transactionSurcharges == null) {
            transactionSurcharges = new ArrayList<TransactionSurcharge>();
        }
        return this.transactionSurcharges;
    }

}
