
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
 *         &lt;element name="replicationSendDumpList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfReplicationSendDump" minOccurs="0"/>
 *         &lt;element name="destinationSiteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sourceSiteID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "replicationSendDumpList",
    "destinationSiteId",
    "sourceSiteID"
})
@XmlRootElement(name = "SaveReplicationSendDumpList")
public class SaveReplicationSendDumpList {

    @XmlElementRef(name = "replicationSendDumpList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReplicationSendDump> replicationSendDumpList;
    protected Integer destinationSiteId;
    protected Integer sourceSiteID;

    /**
     * Gets the value of the replicationSendDumpList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReplicationSendDump }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReplicationSendDump> getReplicationSendDumpList() {
        return replicationSendDumpList;
    }

    /**
     * Sets the value of the replicationSendDumpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReplicationSendDump }{@code >}
     *     
     */
    public void setReplicationSendDumpList(JAXBElement<ArrayOfReplicationSendDump> value) {
        this.replicationSendDumpList = value;
    }

    /**
     * Gets the value of the destinationSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationSiteId() {
        return destinationSiteId;
    }

    /**
     * Sets the value of the destinationSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationSiteId(Integer value) {
        this.destinationSiteId = value;
    }

    /**
     * Gets the value of the sourceSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceSiteID() {
        return sourceSiteID;
    }

    /**
     * Sets the value of the sourceSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceSiteID(Integer value) {
        this.sourceSiteID = value;
    }

}
