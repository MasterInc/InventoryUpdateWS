
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_platform.AmountType;
import org.datacontract.schemas._2004._07.cxs_subsystem.SurchargeType;


/**
 * <p>Java class for Surcharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Surcharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AmountType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}AmountType"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IsTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDiscountable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}SurchargeType" minOccurs="0"/>
 *         &lt;element name="SurchargeKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsPaymentDiscountSurcharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Surcharge", propOrder = {
    "id",
    "description",
    "amountType",
    "amount",
    "isTaxable",
    "taxCodeId",
    "purchaseTaxCodeId",
    "isDiscountable",
    "isRefundable",
    "type",
    "surchargeKey",
    "isPaymentDiscountSurcharge"
})
public class Surcharge
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "AmountType", required = true)
    protected AmountType amountType;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "IsTaxable")
    protected Boolean isTaxable;
    @XmlElementRef(name = "TaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxCodeId;
    @XmlElementRef(name = "PurchaseTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseTaxCodeId;
    @XmlElement(name = "IsDiscountable")
    protected Boolean isDiscountable;
    @XmlElement(name = "IsRefundable")
    protected Boolean isRefundable;
    @XmlElement(name = "Type")
    protected SurchargeType type;
    @XmlElement(name = "SurchargeKey")
    protected Long surchargeKey;
    @XmlElement(name = "IsPaymentDiscountSurcharge")
    protected Boolean isPaymentDiscountSurcharge;

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
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountType(AmountType value) {
        this.amountType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the isTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTaxable() {
        return isTaxable;
    }

    /**
     * Sets the value of the isTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTaxable(Boolean value) {
        this.isTaxable = value;
    }

    /**
     * Gets the value of the taxCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxCodeId() {
        return taxCodeId;
    }

    /**
     * Sets the value of the taxCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxCodeId(JAXBElement<String> value) {
        this.taxCodeId = value;
    }

    /**
     * Gets the value of the purchaseTaxCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchaseTaxCodeId() {
        return purchaseTaxCodeId;
    }

    /**
     * Sets the value of the purchaseTaxCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchaseTaxCodeId(JAXBElement<String> value) {
        this.purchaseTaxCodeId = value;
    }

    /**
     * Gets the value of the isDiscountable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDiscountable() {
        return isDiscountable;
    }

    /**
     * Sets the value of the isDiscountable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDiscountable(Boolean value) {
        this.isDiscountable = value;
    }

    /**
     * Gets the value of the isRefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRefundable() {
        return isRefundable;
    }

    /**
     * Sets the value of the isRefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRefundable(Boolean value) {
        this.isRefundable = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeType }
     *     
     */
    public SurchargeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeType }
     *     
     */
    public void setType(SurchargeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the surchargeKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSurchargeKey() {
        return surchargeKey;
    }

    /**
     * Sets the value of the surchargeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSurchargeKey(Long value) {
        this.surchargeKey = value;
    }

    /**
     * Gets the value of the isPaymentDiscountSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaymentDiscountSurcharge() {
        return isPaymentDiscountSurcharge;
    }

    /**
     * Sets the value of the isPaymentDiscountSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaymentDiscountSurcharge(Boolean value) {
        this.isPaymentDiscountSurcharge = value;
    }

}
