
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfShippingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfShippingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingType" type="{http://www.iVend.com/IIntegrationService/2010/12}ShippingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShippingType", propOrder = {
    "shippingTypes"
})
public class ArrayOfShippingType {

    @XmlElement(name = "ShippingType", nillable = true)
    protected List<ShippingType> shippingTypes;

    /**
     * Gets the value of the shippingTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingType }
     * 
     * 
     */
    public List<ShippingType> getShippingTypes() {
        if (shippingTypes == null) {
            shippingTypes = new ArrayList<ShippingType>();
        }
        return this.shippingTypes;
    }

}
