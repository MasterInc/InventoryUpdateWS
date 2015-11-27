
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGoodsReceiptPODetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGoodsReceiptPODetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoodsReceiptPODetail" type="{http://www.iVend.com/IIntegrationService/2010/12}GoodsReceiptPODetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGoodsReceiptPODetail", propOrder = {
    "goodsReceiptPODetails"
})
public class ArrayOfGoodsReceiptPODetail {

    @XmlElement(name = "GoodsReceiptPODetail", nillable = true)
    protected List<GoodsReceiptPODetail> goodsReceiptPODetails;

    /**
     * Gets the value of the goodsReceiptPODetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsReceiptPODetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsReceiptPODetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsReceiptPODetail }
     * 
     * 
     */
    public List<GoodsReceiptPODetail> getGoodsReceiptPODetails() {
        if (goodsReceiptPODetails == null) {
            goodsReceiptPODetails = new ArrayList<GoodsReceiptPODetail>();
        }
        return this.goodsReceiptPODetails;
    }

}
