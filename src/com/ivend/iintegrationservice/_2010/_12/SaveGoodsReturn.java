
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
 *         &lt;element name="goodsReturn" type="{http://www.iVend.com/IIntegrationService/2010/12}GoodsReturn" minOccurs="0"/>
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
    "goodsReturn"
})
@XmlRootElement(name = "SaveGoodsReturn")
public class SaveGoodsReturn {

    @XmlElementRef(name = "goodsReturn", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<GoodsReturn> goodsReturn;

    /**
     * Gets the value of the goodsReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GoodsReturn }{@code >}
     *     
     */
    public JAXBElement<GoodsReturn> getGoodsReturn() {
        return goodsReturn;
    }

    /**
     * Sets the value of the goodsReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GoodsReturn }{@code >}
     *     
     */
    public void setGoodsReturn(JAXBElement<GoodsReturn> value) {
        this.goodsReturn = value;
    }

}
