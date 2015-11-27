
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
 *         &lt;element name="SaveVendorGroupListResult" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfVendorGroup" minOccurs="0"/>
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
    "saveVendorGroupListResult"
})
@XmlRootElement(name = "SaveVendorGroupListResponse")
public class SaveVendorGroupListResponse {

    @XmlElementRef(name = "SaveVendorGroupListResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVendorGroup> saveVendorGroupListResult;

    /**
     * Gets the value of the saveVendorGroupListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVendorGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVendorGroup> getSaveVendorGroupListResult() {
        return saveVendorGroupListResult;
    }

    /**
     * Sets the value of the saveVendorGroupListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVendorGroup }{@code >}
     *     
     */
    public void setSaveVendorGroupListResult(JAXBElement<ArrayOfVendorGroup> value) {
        this.saveVendorGroupListResult = value;
    }

}
