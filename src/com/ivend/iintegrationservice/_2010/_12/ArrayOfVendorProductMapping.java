
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVendorProductMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVendorProductMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorProductMapping" type="{http://www.iVend.com/IIntegrationService/2010/12}VendorProductMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVendorProductMapping", propOrder = {
    "vendorProductMappings"
})
public class ArrayOfVendorProductMapping {

    @XmlElement(name = "VendorProductMapping", nillable = true)
    protected List<VendorProductMapping> vendorProductMappings;

    /**
     * Gets the value of the vendorProductMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorProductMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorProductMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorProductMapping }
     * 
     * 
     */
    public List<VendorProductMapping> getVendorProductMappings() {
        if (vendorProductMappings == null) {
            vendorProductMappings = new ArrayList<VendorProductMapping>();
        }
        return this.vendorProductMappings;
    }

}
