
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGoodsIssueDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGoodsIssueDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoodsIssueDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}GoodsIssueDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGoodsIssueDetail", propOrder = {
    "goodsIssueDetails"
})
public class ArrayOfGoodsIssueDetail {

    @XmlElement(name = "GoodsIssueDetail", nillable = true)
    protected List<GoodsIssueDetail> goodsIssueDetails;

    /**
     * Gets the value of the goodsIssueDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsIssueDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsIssueDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsIssueDetail }
     * 
     * 
     */
    public List<GoodsIssueDetail> getGoodsIssueDetails() {
        if (goodsIssueDetails == null) {
            goodsIssueDetails = new ArrayList<GoodsIssueDetail>();
        }
        return this.goodsIssueDetails;
    }

}
