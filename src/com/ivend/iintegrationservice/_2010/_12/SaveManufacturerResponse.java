
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
 *         &lt;element name="SaveManufacturerResult" type="{http://www.iVend.com/IIntegrationService/2010/12}Manufacturer" minOccurs="0"/>
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
    "saveManufacturerResult"
})
@XmlRootElement(name = "SaveManufacturerResponse")
public class SaveManufacturerResponse {

    @XmlElementRef(name = "SaveManufacturerResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Manufacturer> saveManufacturerResult;

    /**
     * Gets the value of the saveManufacturerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}
     *     
     */
    public JAXBElement<Manufacturer> getSaveManufacturerResult() {
        return saveManufacturerResult;
    }

    /**
     * Sets the value of the saveManufacturerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}
     *     
     */
    public void setSaveManufacturerResult(JAXBElement<Manufacturer> value) {
        this.saveManufacturerResult = value;
    }

}
