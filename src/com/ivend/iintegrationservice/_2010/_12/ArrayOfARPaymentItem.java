
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfARPaymentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfARPaymentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ARPaymentItem" type="{http://www.iVend.com/IIntegrationService/2010/12}ARPaymentItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfARPaymentItem", propOrder = {
    "arPaymentItems"
})
public class ArrayOfARPaymentItem {

    @XmlElement(name = "ARPaymentItem", nillable = true)
    protected List<ARPaymentItem> arPaymentItems;

    /**
     * Gets the value of the arPaymentItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arPaymentItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARPaymentItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARPaymentItem }
     * 
     * 
     */
    public List<ARPaymentItem> getARPaymentItems() {
        if (arPaymentItems == null) {
            arPaymentItems = new ArrayList<ARPaymentItem>();
        }
        return this.arPaymentItems;
    }

}
