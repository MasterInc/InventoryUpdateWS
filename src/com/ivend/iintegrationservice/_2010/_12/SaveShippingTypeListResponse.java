
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
 *         &lt;element name="SaveShippingTypeListResult" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfShippingType" minOccurs="0"/>
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
    "saveShippingTypeListResult"
})
@XmlRootElement(name = "SaveShippingTypeListResponse")
public class SaveShippingTypeListResponse {

    @XmlElementRef(name = "SaveShippingTypeListResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfShippingType> saveShippingTypeListResult;

    /**
     * Gets the value of the saveShippingTypeListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfShippingType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfShippingType> getSaveShippingTypeListResult() {
        return saveShippingTypeListResult;
    }

    /**
     * Sets the value of the saveShippingTypeListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfShippingType }{@code >}
     *     
     */
    public void setSaveShippingTypeListResult(JAXBElement<ArrayOfShippingType> value) {
        this.saveShippingTypeListResult = value;
    }

}
