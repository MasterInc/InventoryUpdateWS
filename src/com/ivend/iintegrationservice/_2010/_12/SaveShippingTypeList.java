
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
 *         &lt;element name="shippingTypeList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfShippingType" minOccurs="0"/>
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
    "shippingTypeList"
})
@XmlRootElement(name = "SaveShippingTypeList")
public class SaveShippingTypeList {

    @XmlElementRef(name = "shippingTypeList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfShippingType> shippingTypeList;

    /**
     * Gets the value of the shippingTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfShippingType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfShippingType> getShippingTypeList() {
        return shippingTypeList;
    }

    /**
     * Sets the value of the shippingTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfShippingType }{@code >}
     *     
     */
    public void setShippingTypeList(JAXBElement<ArrayOfShippingType> value) {
        this.shippingTypeList = value;
    }

}
