
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
 *         &lt;element name="X_GetDeltaQueueResult" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfIntegrationQueue" minOccurs="0"/>
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
    "xGetDeltaQueueResult"
})
@XmlRootElement(name = "X_GetDeltaQueueResponse")
public class XGetDeltaQueueResponse {

    @XmlElementRef(name = "X_GetDeltaQueueResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfIntegrationQueue> xGetDeltaQueueResult;

    /**
     * Gets the value of the xGetDeltaQueueResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIntegrationQueue> getXGetDeltaQueueResult() {
        return xGetDeltaQueueResult;
    }

    /**
     * Sets the value of the xGetDeltaQueueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIntegrationQueue }{@code >}
     *     
     */
    public void setXGetDeltaQueueResult(JAXBElement<ArrayOfIntegrationQueue> value) {
        this.xGetDeltaQueueResult = value;
    }

}
