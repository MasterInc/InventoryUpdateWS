
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
 *         &lt;element name="giftCertificateMasterList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGiftCertificateMaster" minOccurs="0"/>
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
    "giftCertificateMasterList"
})
@XmlRootElement(name = "SaveGiftCertificateMasterList")
public class SaveGiftCertificateMasterList {

    @XmlElementRef(name = "giftCertificateMasterList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGiftCertificateMaster> giftCertificateMasterList;

    /**
     * Gets the value of the giftCertificateMasterList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGiftCertificateMaster }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGiftCertificateMaster> getGiftCertificateMasterList() {
        return giftCertificateMasterList;
    }

    /**
     * Sets the value of the giftCertificateMasterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGiftCertificateMaster }{@code >}
     *     
     */
    public void setGiftCertificateMasterList(JAXBElement<ArrayOfGiftCertificateMaster> value) {
        this.giftCertificateMasterList = value;
    }

}
