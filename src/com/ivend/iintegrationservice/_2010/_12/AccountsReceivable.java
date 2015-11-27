
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


/**
 * <p>Java class for AccountsReceivable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountsReceivable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditWarningLevel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BankCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgingAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AgingAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AgingAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AgingAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LastPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountsReceivable", propOrder = {
    "customerId",
    "balance",
    "creditLimit",
    "creditWarningLevel",
    "bankCountry",
    "bank",
    "bankAccount",
    "bankBranch",
    "agingAmount1",
    "agingAmount2",
    "agingAmount3",
    "agingAmount4",
    "lastPaymentAmount",
    "lastPaymentDate"
})
public class AccountsReceivable
    extends BaseWrapper
{

    @XmlElement(name = "CustomerId", required = true, nillable = true)
    protected String customerId;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "CreditLimit")
    protected BigDecimal creditLimit;
    @XmlElement(name = "CreditWarningLevel")
    protected BigDecimal creditWarningLevel;
    @XmlElementRef(name = "BankCountry", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankCountry;
    @XmlElementRef(name = "Bank", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bank;
    @XmlElementRef(name = "BankAccount", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAccount;
    @XmlElementRef(name = "BankBranch", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankBranch;
    @XmlElement(name = "AgingAmount1")
    protected BigDecimal agingAmount1;
    @XmlElement(name = "AgingAmount2")
    protected BigDecimal agingAmount2;
    @XmlElement(name = "AgingAmount3")
    protected BigDecimal agingAmount3;
    @XmlElement(name = "AgingAmount4")
    protected BigDecimal agingAmount4;
    @XmlElement(name = "LastPaymentAmount")
    protected BigDecimal lastPaymentAmount;
    @XmlElement(name = "LastPaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPaymentDate;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimit(BigDecimal value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the creditWarningLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditWarningLevel() {
        return creditWarningLevel;
    }

    /**
     * Sets the value of the creditWarningLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditWarningLevel(BigDecimal value) {
        this.creditWarningLevel = value;
    }

    /**
     * Gets the value of the bankCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankCountry() {
        return bankCountry;
    }

    /**
     * Sets the value of the bankCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankCountry(JAXBElement<String> value) {
        this.bankCountry = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBank(JAXBElement<String> value) {
        this.bank = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAccount(JAXBElement<String> value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankBranch(JAXBElement<String> value) {
        this.bankBranch = value;
    }

    /**
     * Gets the value of the agingAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgingAmount1() {
        return agingAmount1;
    }

    /**
     * Sets the value of the agingAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgingAmount1(BigDecimal value) {
        this.agingAmount1 = value;
    }

    /**
     * Gets the value of the agingAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgingAmount2() {
        return agingAmount2;
    }

    /**
     * Sets the value of the agingAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgingAmount2(BigDecimal value) {
        this.agingAmount2 = value;
    }

    /**
     * Gets the value of the agingAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgingAmount3() {
        return agingAmount3;
    }

    /**
     * Sets the value of the agingAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgingAmount3(BigDecimal value) {
        this.agingAmount3 = value;
    }

    /**
     * Gets the value of the agingAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgingAmount4() {
        return agingAmount4;
    }

    /**
     * Sets the value of the agingAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgingAmount4(BigDecimal value) {
        this.agingAmount4 = value;
    }

    /**
     * Gets the value of the lastPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    /**
     * Sets the value of the lastPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPaymentAmount(BigDecimal value) {
        this.lastPaymentAmount = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaymentDate(XMLGregorianCalendar value) {
        this.lastPaymentDate = value;
    }

}
