
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TaxType;


/**
 * <p>Java class for TaxCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxCode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Tax}TaxType" minOccurs="0"/>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CanApplyOnExpense" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxPeriodDefinitionList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTaxPeriodDefination" minOccurs="0"/>
 *         &lt;element name="IsExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LoadonItemCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCode", propOrder = {
    "id",
    "description",
    "type",
    "rate",
    "canApplyOnExpense",
    "taxRate",
    "taxPeriodDefinitionList",
    "isExempt",
    "loadonItemCost"
})
public class TaxCode
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "Type")
    protected TaxType type;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "CanApplyOnExpense")
    protected Boolean canApplyOnExpense;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElementRef(name = "TaxPeriodDefinitionList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaxPeriodDefination> taxPeriodDefinitionList;
    @XmlElement(name = "IsExempt")
    protected Boolean isExempt;
    @XmlElement(name = "LoadonItemCost")
    protected Boolean loadonItemCost;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setType(TaxType value) {
        this.type = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the canApplyOnExpense property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanApplyOnExpense() {
        return canApplyOnExpense;
    }

    /**
     * Sets the value of the canApplyOnExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanApplyOnExpense(Boolean value) {
        this.canApplyOnExpense = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxPeriodDefinitionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaxPeriodDefination }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaxPeriodDefination> getTaxPeriodDefinitionList() {
        return taxPeriodDefinitionList;
    }

    /**
     * Sets the value of the taxPeriodDefinitionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaxPeriodDefination }{@code >}
     *     
     */
    public void setTaxPeriodDefinitionList(JAXBElement<ArrayOfTaxPeriodDefination> value) {
        this.taxPeriodDefinitionList = value;
    }

    /**
     * Gets the value of the isExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExempt() {
        return isExempt;
    }

    /**
     * Sets the value of the isExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExempt(Boolean value) {
        this.isExempt = value;
    }

    /**
     * Gets the value of the loadonItemCost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadonItemCost() {
        return loadonItemCost;
    }

    /**
     * Sets the value of the loadonItemCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadonItemCost(Boolean value) {
        this.loadonItemCost = value;
    }

}
