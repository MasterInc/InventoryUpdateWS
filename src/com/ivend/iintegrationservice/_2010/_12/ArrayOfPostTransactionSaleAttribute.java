
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPostTransactionSaleAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPostTransactionSaleAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostTransactionSaleAttribute" type="{http://www.iVend.com/IIntegrationService/2010/12}PostTransactionSaleAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPostTransactionSaleAttribute", propOrder = {
    "postTransactionSaleAttributes"
})
public class ArrayOfPostTransactionSaleAttribute {

    @XmlElement(name = "PostTransactionSaleAttribute", nillable = true)
    protected List<PostTransactionSaleAttribute> postTransactionSaleAttributes;

    /**
     * Gets the value of the postTransactionSaleAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postTransactionSaleAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostTransactionSaleAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostTransactionSaleAttribute }
     * 
     * 
     */
    public List<PostTransactionSaleAttribute> getPostTransactionSaleAttributes() {
        if (postTransactionSaleAttributes == null) {
            postTransactionSaleAttributes = new ArrayList<PostTransactionSaleAttribute>();
        }
        return this.postTransactionSaleAttributes;
    }

}
