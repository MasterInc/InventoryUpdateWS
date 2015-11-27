
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
 *         &lt;element name="UpdateMasterObjectResult" type="{http://www.iVend.com/IIntegrationService/2010/12}UpdateMaster" minOccurs="0"/>
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
    "updateMasterObjectResult"
})
@XmlRootElement(name = "UpdateMasterObjectResponse")
public class UpdateMasterObjectResponse {

    @XmlElementRef(name = "UpdateMasterObjectResult", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateMaster> updateMasterObjectResult;

    /**
     * Gets the value of the updateMasterObjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateMaster }{@code >}
     *     
     */
    public JAXBElement<UpdateMaster> getUpdateMasterObjectResult() {
        return updateMasterObjectResult;
    }

    /**
     * Sets the value of the updateMasterObjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateMaster }{@code >}
     *     
     */
    public void setUpdateMasterObjectResult(JAXBElement<UpdateMaster> value) {
        this.updateMasterObjectResult = value;
    }

}
