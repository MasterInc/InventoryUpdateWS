
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.InventoryAllocationMethod;


/**
 * <p>Java class for FulfillmentPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FulfillmentPlan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequireAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InventoryAllocationMethod" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}InventoryAllocationMethod" minOccurs="0"/>
 *         &lt;element name="MinLeadTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SurchargeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayInAdvance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FulfillmentPlanSurchargeList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfFulfillmentPlanSurcharge" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfillmentPlan", propOrder = {
    "id",
    "description",
    "requireAddress",
    "inventoryAllocationMethod",
    "minLeadTime",
    "surchargeId",
    "payInAdvance",
    "fulfillmentPlanSurchargeList"
})
public class FulfillmentPlan
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "RequireAddress")
    protected Boolean requireAddress;
    @XmlElement(name = "InventoryAllocationMethod")
    protected InventoryAllocationMethod inventoryAllocationMethod;
    @XmlElement(name = "MinLeadTime")
    protected Integer minLeadTime;
    @XmlElementRef(name = "SurchargeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surchargeId;
    @XmlElement(name = "PayInAdvance")
    protected Boolean payInAdvance;
    @XmlElementRef(name = "FulfillmentPlanSurchargeList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFulfillmentPlanSurcharge> fulfillmentPlanSurchargeList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the requireAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireAddress() {
        return requireAddress;
    }

    /**
     * Sets the value of the requireAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireAddress(Boolean value) {
        this.requireAddress = value;
    }

    /**
     * Gets the value of the inventoryAllocationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryAllocationMethod }
     *     
     */
    public InventoryAllocationMethod getInventoryAllocationMethod() {
        return inventoryAllocationMethod;
    }

    /**
     * Sets the value of the inventoryAllocationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryAllocationMethod }
     *     
     */
    public void setInventoryAllocationMethod(InventoryAllocationMethod value) {
        this.inventoryAllocationMethod = value;
    }

    /**
     * Gets the value of the minLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinLeadTime() {
        return minLeadTime;
    }

    /**
     * Sets the value of the minLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinLeadTime(Integer value) {
        this.minLeadTime = value;
    }

    /**
     * Gets the value of the surchargeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurchargeId() {
        return surchargeId;
    }

    /**
     * Sets the value of the surchargeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurchargeId(JAXBElement<String> value) {
        this.surchargeId = value;
    }

    /**
     * Gets the value of the payInAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayInAdvance() {
        return payInAdvance;
    }

    /**
     * Sets the value of the payInAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayInAdvance(Boolean value) {
        this.payInAdvance = value;
    }

    /**
     * Gets the value of the fulfillmentPlanSurchargeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFulfillmentPlanSurcharge }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFulfillmentPlanSurcharge> getFulfillmentPlanSurchargeList() {
        return fulfillmentPlanSurchargeList;
    }

    /**
     * Sets the value of the fulfillmentPlanSurchargeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFulfillmentPlanSurcharge }{@code >}
     *     
     */
    public void setFulfillmentPlanSurchargeList(JAXBElement<ArrayOfFulfillmentPlanSurcharge> value) {
        this.fulfillmentPlanSurchargeList = value;
    }

}
