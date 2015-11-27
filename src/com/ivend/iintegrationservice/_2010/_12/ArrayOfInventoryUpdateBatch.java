
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInventoryUpdateBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInventoryUpdateBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InventoryUpdateBatch" type="{http://www.iVend.com/IIntegrationService/2010/12}InventoryUpdateBatch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInventoryUpdateBatch", propOrder = {
    "inventoryUpdateBatches"
})
public class ArrayOfInventoryUpdateBatch {

    @XmlElement(name = "InventoryUpdateBatch", nillable = true)
    protected List<InventoryUpdateBatch> inventoryUpdateBatches;

    /**
     * Gets the value of the inventoryUpdateBatches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryUpdateBatches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryUpdateBatches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryUpdateBatch }
     * 
     * 
     */
    public List<InventoryUpdateBatch> getInventoryUpdateBatches() {
        if (inventoryUpdateBatches == null) {
            inventoryUpdateBatches = new ArrayList<InventoryUpdateBatch>();
        }
        return this.inventoryUpdateBatches;
    }

}
