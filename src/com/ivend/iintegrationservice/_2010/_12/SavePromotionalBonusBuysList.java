
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionBonusBuysList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPromotionBonusBuys" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "promotionBonusBuysList"
})
@XmlRootElement(name = "SavePromotionalBonusBuysList")
public class SavePromotionalBonusBuysList {

    @XmlElementRef(name = "PromotionBonusBuysList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPromotionBonusBuys> promotionBonusBuysList;

    /**
     * Gets the value of the promotionBonusBuysList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPromotionBonusBuys }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPromotionBonusBuys> getPromotionBonusBuysList() {
        return promotionBonusBuysList;
    }

    /**
     * Sets the value of the promotionBonusBuysList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPromotionBonusBuys }{@code >}
     *     
     */
    public void setPromotionBonusBuysList(JAXBElement<ArrayOfPromotionBonusBuys> value) {
        this.promotionBonusBuysList = value;
    }

}
