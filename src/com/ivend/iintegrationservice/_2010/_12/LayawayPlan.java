
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.InventoryAllocationMethod;
import org.datacontract.schemas._2004._07.cxs_subsystem.LayawayPlanDepositType;
import org.datacontract.schemas._2004._07.cxs_subsystem.LayawayPlanDurationType;


/**
 * <p>Java class for LayawayPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayawayPlan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Deposit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DepositType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Payment}LayawayPlanDepositType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DurationType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Payment}LayawayPlanDurationType" minOccurs="0"/>
 *         &lt;element name="FirstInstallmentDue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InstallmentDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InventoryAllocationMethod" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}InventoryAllocationMethod" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LayawayPlanSurchargeList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfLayawayPlanSurcharge" minOccurs="0"/>
 *         &lt;element name="MaxInstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinInstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumDeliveryPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SurchargeId1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurchargeId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurchargeId3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayawayPlan", propOrder = {
    "deposit",
    "depositType",
    "description",
    "durationType",
    "firstInstallmentDue",
    "id",
    "installmentCount",
    "installmentDuration",
    "inventoryAllocationMethod",
    "isActive",
    "layawayPlanSurchargeList",
    "maxInstallmentCount",
    "minInstallmentCount",
    "minimumDeliveryPercentage",
    "surchargeId1",
    "surchargeId2",
    "surchargeId3"
})
public class LayawayPlan
    extends BaseWrapper
{

    @XmlElement(name = "Deposit")
    protected BigDecimal deposit;
    @XmlElement(name = "DepositType")
    protected LayawayPlanDepositType depositType;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "DurationType")
    protected LayawayPlanDurationType durationType;
    @XmlElement(name = "FirstInstallmentDue")
    protected Integer firstInstallmentDue;
    @XmlElementRef(name = "Id", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElement(name = "InstallmentCount")
    protected Integer installmentCount;
    @XmlElement(name = "InstallmentDuration")
    protected Integer installmentDuration;
    @XmlElement(name = "InventoryAllocationMethod")
    protected InventoryAllocationMethod inventoryAllocationMethod;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElementRef(name = "LayawayPlanSurchargeList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLayawayPlanSurcharge> layawayPlanSurchargeList;
    @XmlElement(name = "MaxInstallmentCount")
    protected Integer maxInstallmentCount;
    @XmlElement(name = "MinInstallmentCount")
    protected Integer minInstallmentCount;
    @XmlElement(name = "MinimumDeliveryPercentage")
    protected BigDecimal minimumDeliveryPercentage;
    @XmlElementRef(name = "SurchargeId1", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surchargeId1;
    @XmlElementRef(name = "SurchargeId2", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surchargeId2;
    @XmlElementRef(name = "SurchargeId3", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surchargeId3;

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeposit(BigDecimal value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link LayawayPlanDepositType }
     *     
     */
    public LayawayPlanDepositType getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayawayPlanDepositType }
     *     
     */
    public void setDepositType(LayawayPlanDepositType value) {
        this.depositType = value;
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
     * Gets the value of the durationType property.
     * 
     * @return
     *     possible object is
     *     {@link LayawayPlanDurationType }
     *     
     */
    public LayawayPlanDurationType getDurationType() {
        return durationType;
    }

    /**
     * Sets the value of the durationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayawayPlanDurationType }
     *     
     */
    public void setDurationType(LayawayPlanDurationType value) {
        this.durationType = value;
    }

    /**
     * Gets the value of the firstInstallmentDue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstInstallmentDue() {
        return firstInstallmentDue;
    }

    /**
     * Sets the value of the firstInstallmentDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstInstallmentDue(Integer value) {
        this.firstInstallmentDue = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the installmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstallmentCount() {
        return installmentCount;
    }

    /**
     * Sets the value of the installmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstallmentCount(Integer value) {
        this.installmentCount = value;
    }

    /**
     * Gets the value of the installmentDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstallmentDuration() {
        return installmentDuration;
    }

    /**
     * Sets the value of the installmentDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstallmentDuration(Integer value) {
        this.installmentDuration = value;
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
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the layawayPlanSurchargeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLayawayPlanSurcharge }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLayawayPlanSurcharge> getLayawayPlanSurchargeList() {
        return layawayPlanSurchargeList;
    }

    /**
     * Sets the value of the layawayPlanSurchargeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLayawayPlanSurcharge }{@code >}
     *     
     */
    public void setLayawayPlanSurchargeList(JAXBElement<ArrayOfLayawayPlanSurcharge> value) {
        this.layawayPlanSurchargeList = value;
    }

    /**
     * Gets the value of the maxInstallmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxInstallmentCount() {
        return maxInstallmentCount;
    }

    /**
     * Sets the value of the maxInstallmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxInstallmentCount(Integer value) {
        this.maxInstallmentCount = value;
    }

    /**
     * Gets the value of the minInstallmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinInstallmentCount() {
        return minInstallmentCount;
    }

    /**
     * Sets the value of the minInstallmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinInstallmentCount(Integer value) {
        this.minInstallmentCount = value;
    }

    /**
     * Gets the value of the minimumDeliveryPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumDeliveryPercentage() {
        return minimumDeliveryPercentage;
    }

    /**
     * Sets the value of the minimumDeliveryPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumDeliveryPercentage(BigDecimal value) {
        this.minimumDeliveryPercentage = value;
    }

    /**
     * Gets the value of the surchargeId1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurchargeId1() {
        return surchargeId1;
    }

    /**
     * Sets the value of the surchargeId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurchargeId1(JAXBElement<String> value) {
        this.surchargeId1 = value;
    }

    /**
     * Gets the value of the surchargeId2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurchargeId2() {
        return surchargeId2;
    }

    /**
     * Sets the value of the surchargeId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurchargeId2(JAXBElement<String> value) {
        this.surchargeId2 = value;
    }

    /**
     * Gets the value of the surchargeId3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurchargeId3() {
        return surchargeId3;
    }

    /**
     * Sets the value of the surchargeId3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurchargeId3(JAXBElement<String> value) {
        this.surchargeId3 = value;
    }

}
