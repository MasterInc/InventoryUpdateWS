
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
 *         &lt;element name="inventoryItemList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfInventoryItem" minOccurs="0"/>
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
    "inventoryItemList"
})
@XmlRootElement(name = "SaveInventoryItems")
public class SaveInventoryItems {

    @XmlElementRef(name = "inventoryItemList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInventoryItem> inventoryItemList;

    /**
     * Gets the value of the inventoryItemList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    /**
     * Sets the value of the inventoryItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryItem }{@code >}
     *     
     */
    public void setInventoryItemList(JAXBElement<ArrayOfInventoryItem> value) {
        this.inventoryItemList = value;
    }

}
