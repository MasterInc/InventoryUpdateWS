
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.SaleAttributeCaptureType;
import org.datacontract.schemas._2004._07.cxs_subsystem.SaleAttributeValidationType;


/**
 * <p>Java class for SaleAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CaptureType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}SaleAttributeCaptureType" minOccurs="0"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}SaleAttributeValidationType" minOccurs="0"/>
 *         &lt;element name="ValidValueItems" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfAttributeValidValue" minOccurs="0"/>
 *         &lt;element name="Sale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SaleRefund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SaleExchange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SpecialOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Layaway" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Quotation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GiftCertificate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CouponIssue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdvancePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegExPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaleAttributeKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleAttribute", propOrder = {
    "name",
    "sequence",
    "required",
    "isActive",
    "captureType",
    "defaultValue",
    "validationType",
    "validValueItems",
    "sale",
    "saleRefund",
    "saleExchange",
    "specialOrder",
    "layaway",
    "quotation",
    "giftCertificate",
    "couponIssue",
    "advancePayment",
    "regExPattern",
    "saleAttributeKey"
})
public class SaleAttribute
    extends BaseWrapper
{

    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "Sequence")
    protected Integer sequence;
    @XmlElement(name = "Required")
    protected Boolean required;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "CaptureType")
    protected SaleAttributeCaptureType captureType;
    @XmlElementRef(name = "DefaultValue", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultValue;
    @XmlElement(name = "ValidationType")
    protected SaleAttributeValidationType validationType;
    @XmlElementRef(name = "ValidValueItems", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAttributeValidValue> validValueItems;
    @XmlElement(name = "Sale")
    protected Boolean sale;
    @XmlElement(name = "SaleRefund")
    protected Boolean saleRefund;
    @XmlElement(name = "SaleExchange")
    protected Boolean saleExchange;
    @XmlElement(name = "SpecialOrder")
    protected Boolean specialOrder;
    @XmlElement(name = "Layaway")
    protected Boolean layaway;
    @XmlElement(name = "Quotation")
    protected Boolean quotation;
    @XmlElement(name = "GiftCertificate")
    protected Boolean giftCertificate;
    @XmlElement(name = "CouponIssue")
    protected Boolean couponIssue;
    @XmlElement(name = "AdvancePayment")
    protected Boolean advancePayment;
    @XmlElementRef(name = "RegExPattern", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regExPattern;
    @XmlElement(name = "SaleAttributeKey")
    protected Long saleAttributeKey;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
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
     * Gets the value of the captureType property.
     * 
     * @return
     *     possible object is
     *     {@link SaleAttributeCaptureType }
     *     
     */
    public SaleAttributeCaptureType getCaptureType() {
        return captureType;
    }

    /**
     * Sets the value of the captureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleAttributeCaptureType }
     *     
     */
    public void setCaptureType(SaleAttributeCaptureType value) {
        this.captureType = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultValue(JAXBElement<String> value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link SaleAttributeValidationType }
     *     
     */
    public SaleAttributeValidationType getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleAttributeValidationType }
     *     
     */
    public void setValidationType(SaleAttributeValidationType value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the validValueItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttributeValidValue }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttributeValidValue> getValidValueItems() {
        return validValueItems;
    }

    /**
     * Sets the value of the validValueItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttributeValidValue }{@code >}
     *     
     */
    public void setValidValueItems(JAXBElement<ArrayOfAttributeValidValue> value) {
        this.validValueItems = value;
    }

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSale(Boolean value) {
        this.sale = value;
    }

    /**
     * Gets the value of the saleRefund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaleRefund() {
        return saleRefund;
    }

    /**
     * Sets the value of the saleRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaleRefund(Boolean value) {
        this.saleRefund = value;
    }

    /**
     * Gets the value of the saleExchange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaleExchange() {
        return saleExchange;
    }

    /**
     * Sets the value of the saleExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaleExchange(Boolean value) {
        this.saleExchange = value;
    }

    /**
     * Gets the value of the specialOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialOrder() {
        return specialOrder;
    }

    /**
     * Sets the value of the specialOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialOrder(Boolean value) {
        this.specialOrder = value;
    }

    /**
     * Gets the value of the layaway property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayaway() {
        return layaway;
    }

    /**
     * Sets the value of the layaway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayaway(Boolean value) {
        this.layaway = value;
    }

    /**
     * Gets the value of the quotation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuotation() {
        return quotation;
    }

    /**
     * Sets the value of the quotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuotation(Boolean value) {
        this.quotation = value;
    }

    /**
     * Gets the value of the giftCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGiftCertificate() {
        return giftCertificate;
    }

    /**
     * Sets the value of the giftCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGiftCertificate(Boolean value) {
        this.giftCertificate = value;
    }

    /**
     * Gets the value of the couponIssue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCouponIssue() {
        return couponIssue;
    }

    /**
     * Sets the value of the couponIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCouponIssue(Boolean value) {
        this.couponIssue = value;
    }

    /**
     * Gets the value of the advancePayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvancePayment() {
        return advancePayment;
    }

    /**
     * Sets the value of the advancePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvancePayment(Boolean value) {
        this.advancePayment = value;
    }

    /**
     * Gets the value of the regExPattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegExPattern() {
        return regExPattern;
    }

    /**
     * Sets the value of the regExPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegExPattern(JAXBElement<String> value) {
        this.regExPattern = value;
    }

    /**
     * Gets the value of the saleAttributeKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleAttributeKey() {
        return saleAttributeKey;
    }

    /**
     * Sets the value of the saleAttributeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleAttributeKey(Long value) {
        this.saleAttributeKey = value;
    }

}
