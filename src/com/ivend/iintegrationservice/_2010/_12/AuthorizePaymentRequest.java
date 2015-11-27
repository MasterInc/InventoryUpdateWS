
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_payments.AuthorizationType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TenderType;


/**
 * <p>Java class for AuthorizePaymentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizePaymentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="PaymentType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Payment}TenderType"/>
 *         &lt;element name="UniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Track1Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Track2Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Track3Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationType" type="{http://schemas.datacontract.org/2004/07/CXS.Payments.Core}AuthorizationType"/>
 *         &lt;element name="OriginalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalTranTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OriginalUniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HasCardSwipe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsToBeVoided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LoyaltyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftCertificateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GiftCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentAttributes" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionPaymentAttribute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizePaymentRequest", propOrder = {
    "paymentType",
    "uniqueIdentifier",
    "cardName",
    "cardNumber",
    "invoiceNumber",
    "customerNumber",
    "securityCode",
    "expirationDate",
    "amount",
    "track1Data",
    "track2Data",
    "state",
    "track3Data",
    "trackInformation",
    "authorizationType",
    "originalReferenceNumber",
    "originalTranTimeStamp",
    "originalUniqueIdentifier",
    "hasCardSwipe",
    "address",
    "city",
    "zipCode",
    "bankCode",
    "isToBeVoided",
    "loyaltyId",
    "giftCertificateId",
    "transactionTotal",
    "giftCertificateNumber",
    "posId",
    "paymentAttributes"
})
public class AuthorizePaymentRequest
    extends BaseWrapper
{

    @XmlElement(name = "PaymentType", required = true)
    protected TenderType paymentType;
    @XmlElement(name = "UniqueIdentifier")
    protected long uniqueIdentifier;
    @XmlElementRef(name = "CardName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardName;
    @XmlElementRef(name = "CardNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardNumber;
    @XmlElement(name = "InvoiceNumber", required = true, nillable = true)
    protected String invoiceNumber;
    @XmlElement(name = "CustomerNumber", required = true, nillable = true)
    protected String customerNumber;
    @XmlElementRef(name = "SecurityCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityCode;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElementRef(name = "Track1Data", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> track1Data;
    @XmlElementRef(name = "Track2Data", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> track2Data;
    @XmlElementRef(name = "State", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "Track3Data", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> track3Data;
    @XmlElementRef(name = "TrackInformation", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trackInformation;
    @XmlElement(name = "AuthorizationType", required = true)
    protected AuthorizationType authorizationType;
    @XmlElementRef(name = "OriginalReferenceNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalReferenceNumber;
    @XmlElement(name = "OriginalTranTimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalTranTimeStamp;
    @XmlElement(name = "OriginalUniqueIdentifier")
    protected Long originalUniqueIdentifier;
    @XmlElement(name = "HasCardSwipe")
    protected Boolean hasCardSwipe;
    @XmlElementRef(name = "Address", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "City", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "ZipCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zipCode;
    @XmlElementRef(name = "BankCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankCode;
    @XmlElement(name = "IsToBeVoided")
    protected Boolean isToBeVoided;
    @XmlElementRef(name = "LoyaltyId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loyaltyId;
    @XmlElementRef(name = "GiftCertificateId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> giftCertificateId;
    @XmlElement(name = "TransactionTotal")
    protected BigDecimal transactionTotal;
    @XmlElementRef(name = "GiftCertificateNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> giftCertificateNumber;
    @XmlElementRef(name = "POSId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posId;
    @XmlElementRef(name = "PaymentAttributes", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionPaymentAttribute> paymentAttributes;

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link TenderType }
     *     
     */
    public TenderType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderType }
     *     
     */
    public void setPaymentType(TenderType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the uniqueIdentifier property.
     * 
     */
    public long getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    /**
     * Sets the value of the uniqueIdentifier property.
     * 
     */
    public void setUniqueIdentifier(long value) {
        this.uniqueIdentifier = value;
    }

    /**
     * Gets the value of the cardName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardName() {
        return cardName;
    }

    /**
     * Sets the value of the cardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardName(JAXBElement<String> value) {
        this.cardName = value;
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
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecurityCode(JAXBElement<String> value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
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
     * Gets the value of the track1Data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrack1Data() {
        return track1Data;
    }

    /**
     * Sets the value of the track1Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrack1Data(JAXBElement<String> value) {
        this.track1Data = value;
    }

    /**
     * Gets the value of the track2Data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrack2Data() {
        return track2Data;
    }

    /**
     * Sets the value of the track2Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrack2Data(JAXBElement<String> value) {
        this.track2Data = value;
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
     * Gets the value of the track3Data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrack3Data() {
        return track3Data;
    }

    /**
     * Sets the value of the track3Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrack3Data(JAXBElement<String> value) {
        this.track3Data = value;
    }

    /**
     * Gets the value of the trackInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackInformation() {
        return trackInformation;
    }

    /**
     * Sets the value of the trackInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackInformation(JAXBElement<String> value) {
        this.trackInformation = value;
    }

    /**
     * Gets the value of the authorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType }
     *     
     */
    public AuthorizationType getAuthorizationType() {
        return authorizationType;
    }

    /**
     * Sets the value of the authorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType }
     *     
     */
    public void setAuthorizationType(AuthorizationType value) {
        this.authorizationType = value;
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
     * Gets the value of the originalTranTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalTranTimeStamp() {
        return originalTranTimeStamp;
    }

    /**
     * Sets the value of the originalTranTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalTranTimeStamp(XMLGregorianCalendar value) {
        this.originalTranTimeStamp = value;
    }

    /**
     * Gets the value of the originalUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalUniqueIdentifier() {
        return originalUniqueIdentifier;
    }

    /**
     * Sets the value of the originalUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalUniqueIdentifier(Long value) {
        this.originalUniqueIdentifier = value;
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
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankCode(JAXBElement<String> value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the isToBeVoided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsToBeVoided() {
        return isToBeVoided;
    }

    /**
     * Sets the value of the isToBeVoided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsToBeVoided(Boolean value) {
        this.isToBeVoided = value;
    }

    /**
     * Gets the value of the loyaltyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoyaltyId() {
        return loyaltyId;
    }

    /**
     * Sets the value of the loyaltyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoyaltyId(JAXBElement<String> value) {
        this.loyaltyId = value;
    }

    /**
     * Gets the value of the giftCertificateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGiftCertificateId() {
        return giftCertificateId;
    }

    /**
     * Sets the value of the giftCertificateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGiftCertificateId(JAXBElement<String> value) {
        this.giftCertificateId = value;
    }

    /**
     * Gets the value of the transactionTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionTotal() {
        return transactionTotal;
    }

    /**
     * Sets the value of the transactionTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionTotal(BigDecimal value) {
        this.transactionTotal = value;
    }

    /**
     * Gets the value of the giftCertificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGiftCertificateNumber() {
        return giftCertificateNumber;
    }

    /**
     * Sets the value of the giftCertificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGiftCertificateNumber(JAXBElement<String> value) {
        this.giftCertificateNumber = value;
    }

    /**
     * Gets the value of the posId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOSId() {
        return posId;
    }

    /**
     * Sets the value of the posId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOSId(JAXBElement<String> value) {
        this.posId = value;
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

}
