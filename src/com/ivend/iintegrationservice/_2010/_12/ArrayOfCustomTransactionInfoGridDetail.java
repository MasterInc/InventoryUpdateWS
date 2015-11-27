
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCustomTransactionInfoGridDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCustomTransactionInfoGridDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomTransactionInfoGridDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}CustomTransactionInfoGridDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomTransactionInfoGridDetail", propOrder = {
    "customTransactionInfoGridDetails"
})
public class ArrayOfCustomTransactionInfoGridDetail {

    @XmlElement(name = "CustomTransactionInfoGridDetail", nillable = true)
    protected List<CustomTransactionInfoGridDetail> customTransactionInfoGridDetails;

    /**
     * Gets the value of the customTransactionInfoGridDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTransactionInfoGridDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTransactionInfoGridDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomTransactionInfoGridDetail }
     * 
     * 
     */
    public List<CustomTransactionInfoGridDetail> getCustomTransactionInfoGridDetails() {
        if (customTransactionInfoGridDetails == null) {
            customTransactionInfoGridDetails = new ArrayList<CustomTransactionInfoGridDetail>();
        }
        return this.customTransactionInfoGridDetails;
    }

}
