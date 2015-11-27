
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_platform.MoneyRoundingMethodType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TenderType;


/**
 * <p>Java class for PaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Payment}TenderType"/>
 *         &lt;element name="DefaultAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RoundingMethodType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}Money.RoundingMethodType" minOccurs="0"/>
 *         &lt;element name="IsRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentTypeAttributeList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPaymentTypeAttribute" minOccurs="0"/>
 *         &lt;element name="PaymentTypeSurchargeList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPaymentTypeSurcharge" minOccurs="0"/>
 *         &lt;element name="PaymentTypeDiscountList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPaymentTypeDiscount" minOccurs="0"/>
 *         &lt;element name="CurrencyKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaymentTypeKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "id",
    "description",
    "displayOrder",
    "type",
    "defaultAmount",
    "isActive",
    "isAuthorized",
    "roundingMethodType",
    "isRefundable",
    "paymentTypeAttributeList",
    "paymentTypeSurchargeList",
    "paymentTypeDiscountList",
    "currencyKey",
    "paymentTypeKey"
})
public class PaymentType
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "DisplayOrder")
    protected int displayOrder;
    @XmlElement(name = "Type", required = true)
    protected TenderType type;
    @XmlElement(name = "DefaultAmount")
    protected BigDecimal defaultAmount;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "IsAuthorized")
    protected boolean isAuthorized;
    @XmlElement(name = "RoundingMethodType")
    protected MoneyRoundingMethodType roundingMethodType;
    @XmlElement(name = "IsRefundable")
    protected Boolean isRefundable;
    @XmlElementRef(name = "PaymentTypeAttributeList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPaymentTypeAttribute> paymentTypeAttributeList;
    @XmlElementRef(name = "PaymentTypeSurchargeList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPaymentTypeSurcharge> paymentTypeSurchargeList;
    @XmlElementRef(name = "PaymentTypeDiscountList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPaymentTypeDiscount> paymentTypeDiscountList;
    @XmlElement(name = "CurrencyKey")
    protected Long currencyKey;
    @XmlElement(name = "PaymentTypeKey")
    protected Long paymentTypeKey;

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
     * Gets the value of the displayOrder property.
     * 
     */
    public int getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     */
    public void setDisplayOrder(int value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TenderType }
     *     
     */
    public TenderType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderType }
     *     
     */
    public void setType(TenderType value) {
        this.type = value;
    }

    /**
     * Gets the value of the defaultAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultAmount() {
        return defaultAmount;
    }

    /**
     * Sets the value of the defaultAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultAmount(BigDecimal value) {
        this.defaultAmount = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isAuthorized property.
     * 
     */
    public boolean isIsAuthorized() {
        return isAuthorized;
    }

    /**
     * Sets the value of the isAuthorized property.
     * 
     */
    public void setIsAuthorized(boolean value) {
        this.isAuthorized = value;
    }

    /**
     * Gets the value of the roundingMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyRoundingMethodType }
     *     
     */
    public MoneyRoundingMethodType getRoundingMethodType() {
        return roundingMethodType;
    }

    /**
     * Sets the value of the roundingMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyRoundingMethodType }
     *     
     */
    public void setRoundingMethodType(MoneyRoundingMethodType value) {
        this.roundingMethodType = value;
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
     * Gets the value of the paymentTypeAttributeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPaymentTypeAttribute> getPaymentTypeAttributeList() {
        return paymentTypeAttributeList;
    }

    /**
     * Sets the value of the paymentTypeAttributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeAttribute }{@code >}
     *     
     */
    public void setPaymentTypeAttributeList(JAXBElement<ArrayOfPaymentTypeAttribute> value) {
        this.paymentTypeAttributeList = value;
    }

    /**
     * Gets the value of the paymentTypeSurchargeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeSurcharge }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPaymentTypeSurcharge> getPaymentTypeSurchargeList() {
        return paymentTypeSurchargeList;
    }

    /**
     * Sets the value of the paymentTypeSurchargeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeSurcharge }{@code >}
     *     
     */
    public void setPaymentTypeSurchargeList(JAXBElement<ArrayOfPaymentTypeSurcharge> value) {
        this.paymentTypeSurchargeList = value;
    }

    /**
     * Gets the value of the paymentTypeDiscountList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeDiscount }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPaymentTypeDiscount> getPaymentTypeDiscountList() {
        return paymentTypeDiscountList;
    }

    /**
     * Sets the value of the paymentTypeDiscountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaymentTypeDiscount }{@code >}
     *     
     */
    public void setPaymentTypeDiscountList(JAXBElement<ArrayOfPaymentTypeDiscount> value) {
        this.paymentTypeDiscountList = value;
    }

    /**
     * Gets the value of the currencyKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrencyKey() {
        return currencyKey;
    }

    /**
     * Sets the value of the currencyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrencyKey(Long value) {
        this.currencyKey = value;
    }

    /**
     * Gets the value of the paymentTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentTypeKey() {
        return paymentTypeKey;
    }

    /**
     * Sets the value of the paymentTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentTypeKey(Long value) {
        this.paymentTypeKey = value;
    }

}
