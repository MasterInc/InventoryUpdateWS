
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
 *         &lt;element name="SavePurchaseOrderListResult" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPurchaseOrder" minOccurs="0"/>
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
    "savePurchaseOrderListResult"
})
@XmlRootElement(name = "SavePurchaseOrderListResponse")
public class SavePurchaseOrderListResponse {

    @XmlElementRef(name = "SavePurchaseOrderListResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPurchaseOrder> savePurchaseOrderListResult;

    /**
     * Gets the value of the savePurchaseOrderListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrder }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPurchaseOrder> getSavePurchaseOrderListResult() {
        return savePurchaseOrderListResult;
    }

    /**
     * Sets the value of the savePurchaseOrderListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrder }{@code >}
     *     
     */
    public void setSavePurchaseOrderListResult(JAXBElement<ArrayOfPurchaseOrder> value) {
        this.savePurchaseOrderListResult = value;
    }

}
