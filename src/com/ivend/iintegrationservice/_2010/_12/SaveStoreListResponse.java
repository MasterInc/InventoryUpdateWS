
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
 *         &lt;element name="SaveStoreListResult" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfStore" minOccurs="0"/>
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
    "saveStoreListResult"
})
@XmlRootElement(name = "SaveStoreListResponse")
public class SaveStoreListResponse {

    @XmlElementRef(name = "SaveStoreListResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStore> saveStoreListResult;

    /**
     * Gets the value of the saveStoreListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStore }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStore> getSaveStoreListResult() {
        return saveStoreListResult;
    }

    /**
     * Sets the value of the saveStoreListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStore }{@code >}
     *     
     */
    public void setSaveStoreListResult(JAXBElement<ArrayOfStore> value) {
        this.saveStoreListResult = value;
    }

}
