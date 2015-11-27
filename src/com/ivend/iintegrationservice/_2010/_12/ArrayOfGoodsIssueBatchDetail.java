
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGoodsIssueBatchDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGoodsIssueBatchDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoodsIssueBatchDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}GoodsIssueBatchDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGoodsIssueBatchDetail", propOrder = {
    "goodsIssueBatchDetails"
})
public class ArrayOfGoodsIssueBatchDetail {

    @XmlElement(name = "GoodsIssueBatchDetail", nillable = true)
    protected List<GoodsIssueBatchDetail> goodsIssueBatchDetails;

    /**
     * Gets the value of the goodsIssueBatchDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsIssueBatchDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsIssueBatchDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsIssueBatchDetail }
     * 
     * 
     */
    public List<GoodsIssueBatchDetail> getGoodsIssueBatchDetails() {
        if (goodsIssueBatchDetails == null) {
            goodsIssueBatchDetails = new ArrayList<GoodsIssueBatchDetail>();
        }
        return this.goodsIssueBatchDetails;
    }

}
