
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
import org.datacontract.schemas._2004._07.cxs_payments.AccountType;
import org.datacontract.schemas._2004._07.cxs_payments.AuthorizationResultType;


/**
 * <p>Java class for PaymentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="AuthorizationResultType" type="{http://schemas.datacontract.org/2004/07/CXS.Payments.Core}AuthorizationResultType" minOccurs="0"/>
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://schemas.datacontract.org/2004/07/CXS.Payments.Core}AccountType" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasCardSwipe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResponse", propOrder = {
    "authorizationResultType",
    "authorizationCode",
    "paymentReferenceNumber",
    "accountType",
    "cardNumber",
    "expirationDate",
    "cardName",
    "hasCardSwipe",
    "additionalInformation",
    "printReceipt",
    "bankCode",
    "authorizedAmount"
})
public class PaymentResponse
    extends BaseWrapper
{

    @XmlElement(name = "AuthorizationResultType")
    protected AuthorizationResultType authorizationResultType;
    @XmlElementRef(name = "AuthorizationCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authorizationCode;
    @XmlElementRef(name = "PaymentReferenceNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentReferenceNumber;
    @XmlElement(name = "AccountType")
    protected AccountType accountType;
    @XmlElementRef(name = "CardNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardNumber;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElementRef(name = "CardName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardName;
    @XmlElement(name = "HasCardSwipe")
    protected Boolean hasCardSwipe;
    @XmlElementRef(name = "AdditionalInformation", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalInformation;
    @XmlElement(name = "PrintReceipt")
    protected Boolean printReceipt;
    @XmlElementRef(name = "BankCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankCode;
    @XmlElement(name = "AuthorizedAmount")
    protected BigDecimal authorizedAmount;

    /**
     * Gets the value of the authorizationResultType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationResultType }
     *     
     */
    public AuthorizationResultType getAuthorizationResultType() {
        return authorizationResultType;
    }

    /**
     * Sets the value of the authorizationResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationResultType }
     *     
     */
    public void setAuthorizationResultType(AuthorizationResultType value) {
        this.authorizationResultType = value;
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
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation(JAXBElement<String> value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the printReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintReceipt() {
        return printReceipt;
    }

    /**
     * Sets the value of the printReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintReceipt(Boolean value) {
        this.printReceipt = value;
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
     * Gets the value of the authorizedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizedAmount() {
        return authorizedAmount;
    }

    /**
     * Sets the value of the authorizedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizedAmount(BigDecimal value) {
        this.authorizedAmount = value;
    }

}
