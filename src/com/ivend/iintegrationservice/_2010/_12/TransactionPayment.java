
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_payments.AccountType;
import org.datacontract.schemas._2004._07.cxs_subsystem.PaymentDetailType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TenderType;
import org.datacontract.schemas._2004._07.system.Stream;


/**
 * <p>Java class for TransactionPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionPayment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="TransactionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaymentTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TenderType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Payment}TenderType"/>
 *         &lt;element name="DetailKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DetailType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}PaymentDetailType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ChangeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ForeignCurrencyChangeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CashBackAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RoundingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://schemas.datacontract.org/2004/07/CXS.Payments.Core}AccountType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsVoided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasAuthorization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasCardSwipe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Refunded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForeignCurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsStoreCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GiftCertificateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://schemas.datacontract.org/2004/07/System.IO}Stream" minOccurs="0"/>
 *         &lt;element name="ExchangeRateKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaymentAttributes" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionPaymentAttribute" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SurchargeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HasSurcharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SurchargeKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SurchargeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionPayment", propOrder = {
    "transactionKey",
    "paymentTypeId",
    "tenderType",
    "detailKey",
    "detailType",
    "amount",
    "changeAmount",
    "foreignCurrencyChangeAmount",
    "cashBackAmount",
    "roundingAmount",
    "accountNumber",
    "cardNumber",
    "name",
    "expirationDate",
    "zipCode",
    "accountType",
    "address",
    "city",
    "state",
    "currencyId",
    "isVoided",
    "hasAuthorization",
    "hasCardSwipe",
    "authorizationCode",
    "paymentReferenceNumber",
    "originalReferenceNumber",
    "refunded",
    "foreignCurrencyAmount",
    "exchangeRate",
    "isStoreCredit",
    "giftCertificateType",
    "signature",
    "exchangeRateKey",
    "paymentAttributes",
    "discountAmount",
    "surchargeAmount",
    "netPayableAmount",
    "hasSurcharge",
    "paidAmount",
    "surchargeKey",
    "surchargeId"
})
public class TransactionPayment
    extends BaseWrapper
{

    @XmlElement(name = "TransactionKey")
    protected long transactionKey;
    @XmlElement(name = "PaymentTypeId", required = true, nillable = true)
    protected String paymentTypeId;
    @XmlElement(name = "TenderType", required = true)
    protected TenderType tenderType;
    @XmlElement(name = "DetailKey")
    protected Long detailKey;
    @XmlElement(name = "DetailType")
    protected PaymentDetailType detailType;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "ChangeAmount")
    protected BigDecimal changeAmount;
    @XmlElement(name = "ForeignCurrencyChangeAmount")
    protected BigDecimal foreignCurrencyChangeAmount;
    @XmlElement(name = "CashBackAmount")
    protected BigDecimal cashBackAmount;
    @XmlElement(name = "RoundingAmount")
    protected BigDecimal roundingAmount;
    @XmlElementRef(name = "AccountNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountNumber;
    @XmlElementRef(name = "CardNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardNumber;
    @XmlElementRef(name = "Name", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "ExpirationDate", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expirationDate;
    @XmlElementRef(name = "ZipCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zipCode;
    @XmlElement(name = "AccountType")
    protected AccountType accountType;
    @XmlElementRef(name = "Address", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "City", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "State", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "CurrencyId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyId;
    @XmlElement(name = "IsVoided")
    protected Boolean isVoided;
    @XmlElement(name = "HasAuthorization")
    protected Boolean hasAuthorization;
    @XmlElement(name = "HasCardSwipe")
    protected Boolean hasCardSwipe;
    @XmlElementRef(name = "AuthorizationCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authorizationCode;
    @XmlElementRef(name = "PaymentReferenceNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentReferenceNumber;
    @XmlElementRef(name = "OriginalReferenceNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalReferenceNumber;
    @XmlElement(name = "Refunded")
    protected Boolean refunded;
    @XmlElement(name = "ForeignCurrencyAmount")
    protected BigDecimal foreignCurrencyAmount;
    @XmlElement(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "IsStoreCredit")
    protected Boolean isStoreCredit;
    @XmlElementRef(name = "GiftCertificateType", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> giftCertificateType;
    @XmlElementRef(name = "Signature", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Stream> signature;
    @XmlElement(name = "ExchangeRateKey")
    protected Long exchangeRateKey;
    @XmlElementRef(name = "PaymentAttributes", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionPaymentAttribute> paymentAttributes;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "SurchargeAmount")
    protected BigDecimal surchargeAmount;
    @XmlElement(name = "NetPayableAmount")
    protected BigDecimal netPayableAmount;
    @XmlElement(name = "HasSurcharge")
    protected Boolean hasSurcharge;
    @XmlElement(name = "PaidAmount")
    protected BigDecimal paidAmount;
    @XmlElement(name = "SurchargeKey")
    protected Long surchargeKey;
    @XmlElementRef(name = "SurchargeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surchargeId;

    /**
     * Gets the value of the transactionKey property.
     * 
     */
    public long getTransactionKey() {
        return transactionKey;
    }

    /**
     * Sets the value of the transactionKey property.
     * 
     */
    public void setTransactionKey(long value) {
        this.transactionKey = value;
    }

    /**
     * Gets the value of the paymentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    /**
     * Sets the value of the paymentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeId(String value) {
        this.paymentTypeId = value;
    }

    /**
     * Gets the value of the tenderType property.
     * 
     * @return
     *     possible object is
     *     {@link TenderType }
     *     
     */
    public TenderType getTenderType() {
        return tenderType;
    }

    /**
     * Sets the value of the tenderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderType }
     *     
     */
    public void setTenderType(TenderType value) {
        this.tenderType = value;
    }

    /**
     * Gets the value of the detailKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDetailKey() {
        return detailKey;
    }

    /**
     * Sets the value of the detailKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDetailKey(Long value) {
        this.detailKey = value;
    }

    /**
     * Gets the value of the detailType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailType }
     *     
     */
    public PaymentDetailType getDetailType() {
        return detailType;
    }

    /**
     * Sets the value of the detailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailType }
     *     
     */
    public void setDetailType(PaymentDetailType value) {
        this.detailType = value;
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
     * Gets the value of the changeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeAmount() {
        return changeAmount;
    }

    /**
     * Sets the value of the changeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeAmount(BigDecimal value) {
        this.changeAmount = value;
    }

    /**
     * Gets the value of the foreignCurrencyChangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForeignCurrencyChangeAmount() {
        return foreignCurrencyChangeAmount;
    }

    /**
     * Sets the value of the foreignCurrencyChangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForeignCurrencyChangeAmount(BigDecimal value) {
        this.foreignCurrencyChangeAmount = value;
    }

    /**
     * Gets the value of the cashBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashBackAmount() {
        return cashBackAmount;
    }

    /**
     * Sets the value of the cashBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashBackAmount(BigDecimal value) {
        this.cashBackAmount = value;
    }

    /**
     * Gets the value of the roundingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundingAmount() {
        return roundingAmount;
    }

    /**
     * Sets the value of the roundingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoundingAmount(BigDecimal value) {
        this.roundingAmount = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountNumber(JAXBElement<String> value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardNumber(JAXBElement<String> value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZipCode(JAXBElement<String> value) {
        this.zipCode = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the currencyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyId(JAXBElement<String> value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the isVoided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVoided() {
        return isVoided;
    }

    /**
     * Sets the value of the isVoided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVoided(Boolean value) {
        this.isVoided = value;
    }

    /**
     * Gets the value of the hasAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAuthorization() {
        return hasAuthorization;
    }

    /**
     * Sets the value of the hasAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAuthorization(Boolean value) {
        this.hasAuthorization = value;
    }

    /**
     * Gets the value of the hasCardSwipe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCardSwipe() {
        return hasCardSwipe;
    }

    /**
     * Sets the value of the hasCardSwipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCardSwipe(Boolean value) {
        this.hasCardSwipe = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorizationCode(JAXBElement<String> value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the paymentReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentReferenceNumber() {
        return paymentReferenceNumber;
    }

    /**
     * Sets the value of the paymentReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentReferenceNumber(JAXBElement<String> value) {
        this.paymentReferenceNumber = value;
    }

    /**
     * Gets the value of the originalReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalReferenceNumber() {
        return originalReferenceNumber;
    }

    /**
     * Sets the value of the originalReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalReferenceNumber(JAXBElement<String> value) {
        this.originalReferenceNumber = value;
    }

    /**
     * Gets the value of the refunded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefunded() {
        return refunded;
    }

    /**
     * Sets the value of the refunded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefunded(Boolean value) {
        this.refunded = value;
    }

    /**
     * Gets the value of the foreignCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForeignCurrencyAmount() {
        return foreignCurrencyAmount;
    }

    /**
     * Sets the value of the foreignCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForeignCurrencyAmount(BigDecimal value) {
        this.foreignCurrencyAmount = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the isStoreCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStoreCredit() {
        return isStoreCredit;
    }

    /**
     * Sets the value of the isStoreCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStoreCredit(Boolean value) {
        this.isStoreCredit = value;
    }

    /**
     * Gets the value of the giftCertificateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGiftCertificateType() {
        return giftCertificateType;
    }

    /**
     * Sets the value of the giftCertificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGiftCertificateType(JAXBElement<String> value) {
        this.giftCertificateType = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Stream }{@code >}
     *     
     */
    public JAXBElement<Stream> getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Stream }{@code >}
     *     
     */
    public void setSignature(JAXBElement<Stream> value) {
        this.signature = value;
    }

    /**
     * Gets the value of the exchangeRateKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchangeRateKey() {
        return exchangeRateKey;
    }

    /**
     * Sets the value of the exchangeRateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchangeRateKey(Long value) {
        this.exchangeRateKey = value;
    }

    /**
     * Gets the value of the paymentAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionPaymentAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionPaymentAttribute> getPaymentAttributes() {
        return paymentAttributes;
    }

    /**
     * Sets the value of the paymentAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionPaymentAttribute }{@code >}
     *     
     */
    public void setPaymentAttributes(JAXBElement<ArrayOfTransactionPaymentAttribute> value) {
        this.paymentAttributes = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the surchargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurchargeAmount(BigDecimal value) {
        this.surchargeAmount = value;
    }

    /**
     * Gets the value of the netPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetPayableAmount() {
        return netPayableAmount;
    }

    /**
     * Sets the value of the netPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetPayableAmount(BigDecimal value) {
        this.netPayableAmount = value;
    }

    /**
     * Gets the value of the hasSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSurcharge() {
        return hasSurcharge;
    }

    /**
     * Sets the value of the hasSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSurcharge(Boolean value) {
        this.hasSurcharge = value;
    }

    /**
     * Gets the value of the paidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaidAmount(BigDecimal value) {
        this.paidAmount = value;
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

}
