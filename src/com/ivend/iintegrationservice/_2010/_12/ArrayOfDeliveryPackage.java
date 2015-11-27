
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDeliveryPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDeliveryPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryPackage" type="{http://www.iVend.com/IIntegrationService/2010/12}DeliveryPackage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeliveryPackage", propOrder = {
    "deliveryPackages"
})
public class ArrayOfDeliveryPackage {

    @XmlElement(name = "DeliveryPackage", nillable = true)
    protected List<DeliveryPackage> deliveryPackages;

    /**
     * Gets the value of the deliveryPackages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryPackages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryPackage }
     * 
     * 
     */
    public List<DeliveryPackage> getDeliveryPackages() {
        if (deliveryPackages == null) {
            deliveryPackages = new ArrayList<DeliveryPackage>();
        }
        return this.deliveryPackages;
    }

}
