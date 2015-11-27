
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGoodsReceiptPOBatchDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGoodsReceiptPOBatchDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoodsReceiptPOBatchDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}GoodsReceiptPOBatchDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGoodsReceiptPOBatchDetail", propOrder = {
    "goodsReceiptPOBatchDetails"
})
public class ArrayOfGoodsReceiptPOBatchDetail {

    @XmlElement(name = "GoodsReceiptPOBatchDetail", nillable = true)
    protected List<GoodsReceiptPOBatchDetail> goodsReceiptPOBatchDetails;

    /**
     * Gets the value of the goodsReceiptPOBatchDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsReceiptPOBatchDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsReceiptPOBatchDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsReceiptPOBatchDetail }
     * 
     * 
     */
    public List<GoodsReceiptPOBatchDetail> getGoodsReceiptPOBatchDetails() {
        if (goodsReceiptPOBatchDetails == null) {
            goodsReceiptPOBatchDetails = new ArrayList<GoodsReceiptPOBatchDetail>();
        }
        return this.goodsReceiptPOBatchDetails;
    }

}
