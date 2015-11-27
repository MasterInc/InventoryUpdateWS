
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
 *         &lt;element name="attributeList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfAttributeMaster" minOccurs="0"/>
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
    "attributeList"
})
@XmlRootElement(name = "SaveAttributeList")
public class SaveAttributeList {

    @XmlElementRef(name = "attributeList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAttributeMaster> attributeList;

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttributeMaster }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttributeMaster> getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttributeMaster }{@code >}
     *     
     */
    public void setAttributeList(JAXBElement<ArrayOfAttributeMaster> value) {
        this.attributeList = value;
    }

}
