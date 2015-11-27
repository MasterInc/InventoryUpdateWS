
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGoodsReceiptPOSerialDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGoodsReceiptPOSerialDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoodsReceiptPOSerialDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}GoodsReceiptPOSerialDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGoodsReceiptPOSerialDetail", propOrder = {
    "goodsReceiptPOSerialDetails"
})
public class ArrayOfGoodsReceiptPOSerialDetail {

    @XmlElement(name = "GoodsReceiptPOSerialDetail", nillable = true)
    protected List<GoodsReceiptPOSerialDetail> goodsReceiptPOSerialDetails;

    /**
     * Gets the value of the goodsReceiptPOSerialDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsReceiptPOSerialDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsReceiptPOSerialDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsReceiptPOSerialDetail }
     * 
     * 
     */
    public List<GoodsReceiptPOSerialDetail> getGoodsReceiptPOSerialDetails() {
        if (goodsReceiptPOSerialDetails == null) {
            goodsReceiptPOSerialDetails = new ArrayList<GoodsReceiptPOSerialDetail>();
        }
        return this.goodsReceiptPOSerialDetails;
    }

}
