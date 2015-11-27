
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCustomerGroupDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCustomerGroupDiscount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerGroupDiscount" type="{http://www.iVend.com/IIntegrationService/2010/12}CustomerGroupDiscount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomerGroupDiscount", propOrder = {
    "customerGroupDiscounts"
})
public class ArrayOfCustomerGroupDiscount {

    @XmlElement(name = "CustomerGroupDiscount", nillable = true)
    protected List<CustomerGroupDiscount> customerGroupDiscounts;

    /**
     * Gets the value of the customerGroupDiscounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerGroupDiscounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerGroupDiscounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerGroupDiscount }
     * 
     * 
     */
    public List<CustomerGroupDiscount> getCustomerGroupDiscounts() {
        if (customerGroupDiscounts == null) {
            customerGroupDiscounts = new ArrayList<CustomerGroupDiscount>();
        }
        return this.customerGroupDiscounts;
    }

}
