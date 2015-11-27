
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGoodsReceiptPO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGoodsReceiptPO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoodsReceiptPO" type="{http://www.iVend.com/IIntegrationService/2010/12}GoodsReceiptPO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGoodsReceiptPO", propOrder = {
    "goodsReceiptPOs"
})
public class ArrayOfGoodsReceiptPO {

    @XmlElement(name = "GoodsReceiptPO", nillable = true)
    protected List<GoodsReceiptPO> goodsReceiptPOs;

    /**
     * Gets the value of the goodsReceiptPOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsReceiptPOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsReceiptPOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsReceiptPO }
     * 
     * 
     */
    public List<GoodsReceiptPO> getGoodsReceiptPOs() {
        if (goodsReceiptPOs == null) {
            goodsReceiptPOs = new ArrayList<GoodsReceiptPO>();
        }
        return this.goodsReceiptPOs;
    }

}
