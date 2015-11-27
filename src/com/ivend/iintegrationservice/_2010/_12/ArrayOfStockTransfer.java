
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStockTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStockTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockTransfer" type="{http://www.iVend.com/IIntegrationService/2010/12}StockTransfer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStockTransfer", propOrder = {
    "stockTransfers"
})
public class ArrayOfStockTransfer {

    @XmlElement(name = "StockTransfer", nillable = true)
    protected List<StockTransfer> stockTransfers;

    /**
     * Gets the value of the stockTransfers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockTransfers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockTransfers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockTransfer }
     * 
     * 
     */
    public List<StockTransfer> getStockTransfers() {
        if (stockTransfers == null) {
            stockTransfers = new ArrayList<StockTransfer>();
        }
        return this.stockTransfers;
    }

}
