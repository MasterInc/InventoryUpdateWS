
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
 *         &lt;element name="udid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apiToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastRecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastErrorRecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isInitialized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "udid",
    "apiToken",
    "lastRecordNumber",
    "lastErrorRecordNumber",
    "lastErrorMessage",
    "isInitialized"
})
@XmlRootElement(name = "UpdateSynchronizationStatus")
public class UpdateSynchronizationStatus {

    @XmlElementRef(name = "udid", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udid;
    @XmlElementRef(name = "apiToken", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apiToken;
    protected Integer lastRecordNumber;
    protected Integer lastErrorRecordNumber;
    @XmlElementRef(name = "lastErrorMessage", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastErrorMessage;
    protected Boolean isInitialized;

    /**
     * Gets the value of the udid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUdid() {
        return udid;
    }

    /**
     * Sets the value of the udid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUdid(JAXBElement<String> value) {
        this.udid = value;
    }

    /**
     * Gets the value of the apiToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApiToken() {
        return apiToken;
    }

    /**
     * Sets the value of the apiToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApiToken(JAXBElement<String> value) {
        this.apiToken = value;
    }

    /**
     * Gets the value of the lastRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastRecordNumber() {
        return lastRecordNumber;
    }

    /**
     * Sets the value of the lastRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastRecordNumber(Integer value) {
        this.lastRecordNumber = value;
    }

    /**
     * Gets the value of the lastErrorRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastErrorRecordNumber() {
        return lastErrorRecordNumber;
    }

    /**
     * Sets the value of the lastErrorRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastErrorRecordNumber(Integer value) {
        this.lastErrorRecordNumber = value;
    }

    /**
     * Gets the value of the lastErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastErrorMessage() {
        return lastErrorMessage;
    }

    /**
     * Sets the value of the lastErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastErrorMessage(JAXBElement<String> value) {
        this.lastErrorMessage = value;
    }

    /**
     * Gets the value of the isInitialized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInitialized() {
        return isInitialized;
    }

    /**
     * Sets the value of the isInitialized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInitialized(Boolean value) {
        this.isInitialized = value;
    }

}
