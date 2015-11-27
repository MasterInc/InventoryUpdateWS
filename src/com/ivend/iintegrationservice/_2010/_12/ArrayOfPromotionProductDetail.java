
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPromotionProductDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPromotionProductDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionProductDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}PromotionProductDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPromotionProductDetail", propOrder = {
    "promotionProductDetails"
})
public class ArrayOfPromotionProductDetail {

    @XmlElement(name = "PromotionProductDetail", nillable = true)
    protected List<PromotionProductDetail> promotionProductDetails;

    /**
     * Gets the value of the promotionProductDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionProductDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionProductDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionProductDetail }
     * 
     * 
     */
    public List<PromotionProductDetail> getPromotionProductDetails() {
        if (promotionProductDetails == null) {
            promotionProductDetails = new ArrayList<PromotionProductDetail>();
        }
        return this.promotionProductDetails;
    }

}
