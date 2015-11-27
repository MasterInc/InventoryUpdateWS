
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductCost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCost" type="{http://www.iVend.com/IIntegrationService/2010/12}ProductCost" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductCost", propOrder = {
    "productCosts"
})
public class ArrayOfProductCost {

    @XmlElement(name = "ProductCost", nillable = true)
    protected List<ProductCost> productCosts;

    /**
     * Gets the value of the productCosts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCosts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCost }
     * 
     * 
     */
    public List<ProductCost> getProductCosts() {
        if (productCosts == null) {
            productCosts = new ArrayList<ProductCost>();
        }
        return this.productCosts;
    }

}
