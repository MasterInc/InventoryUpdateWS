
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_payments.AccountType;
import org.datacontract.schemas._2004._07.cxs_platform.DiscountType;


/**
 * <p>Java class for PaymentTypeDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeDiscount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="PaymentTypeKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}DiscountType" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://schemas.datacontract.org/2004/07/CXS.Payments.Core}AccountType" minOccurs="0"/>
 *         &lt;element name="PaymentTypeDiscountKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeDiscount", propOrder = {
    "paymentTypeKey",
    "fromDate",
    "toDate",
    "isEnabled",
    "minValue",
    "discount",
    "discountType",
    "accountType",
    "paymentTypeDiscountKey"
})
public class PaymentTypeDiscount
    extends BaseWrapper
{

    @XmlElement(name = "PaymentTypeKey")
    protected long paymentTypeKey;
    @XmlElement(name = "FromDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElement(name = "MinValue")
    protected BigDecimal minValue;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "DiscountType")
    protected DiscountType discountType;
    @XmlElement(name = "AccountType")
    protected AccountType accountType;
    @XmlElement(name = "PaymentTypeDiscountKey")
    protected Long paymentTypeDiscountKey;

    /**
     * Gets the value of the paymentTypeKey property.
     * 
     */
    public long getPaymentTypeKey() {
        return paymentTypeKey;
    }

    /**
     * Sets the value of the paymentTypeKey property.
     * 
     */
    public void setPaymentTypeKey(long value) {
        this.paymentTypeKey = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the isEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinValue(BigDecimal value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setDiscountType(DiscountType value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the paymentTypeDiscountKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentTypeDiscountKey() {
        return paymentTypeDiscountKey;
    }

    /**
     * Sets the value of the paymentTypeDiscountKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentTypeDiscountKey(Long value) {
        this.paymentTypeDiscountKey = value;
    }

}
