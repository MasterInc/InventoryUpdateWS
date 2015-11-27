
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
 *         &lt;element name="SaveUOMGroupResult" type="{http://www.iVend.com/IIntegrationService/2010/12}UOMGroup" minOccurs="0"/>
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
    "saveUOMGroupResult"
})
@XmlRootElement(name = "SaveUOMGroupResponse")
public class SaveUOMGroupResponse {

    @XmlElementRef(name = "SaveUOMGroupResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<UOMGroup> saveUOMGroupResult;

    /**
     * Gets the value of the saveUOMGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UOMGroup }{@code >}
     *     
     */
    public JAXBElement<UOMGroup> getSaveUOMGroupResult() {
        return saveUOMGroupResult;
    }

    /**
     * Sets the value of the saveUOMGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UOMGroup }{@code >}
     *     
     */
    public void setSaveUOMGroupResult(JAXBElement<UOMGroup> value) {
        this.saveUOMGroupResult = value;
    }

}
