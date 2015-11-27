
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GiftCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftCertificate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="FinalBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IssueStoreId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RechargeRedeemAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="GiftCertificateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCertificate", propOrder = {
    "finalBalance",
    "issueDate",
    "issueStoreId",
    "rechargeRedeemAmount",
    "serialNumber",
    "transactionDate",
    "validDate",
    "giftCertificateId",
    "customerId"
})
public class GiftCertificate
    extends BaseWrapper
{

    @XmlElement(name = "FinalBalance", required = true)
    protected BigDecimal finalBalance;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "IssueStoreId", required = true, nillable = true)
    protected String issueStoreId;
    @XmlElement(name = "RechargeRedeemAmount")
    protected BigDecimal rechargeRedeemAmount;
    @XmlElement(name = "SerialNumber", required = true, nillable = true)
    protected String serialNumber;
    @XmlElement(name = "TransactionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "ValidDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDate;
    @XmlElement(name = "GiftCertificateId", required = true, nillable = true)
    protected String giftCertificateId;
    @XmlElement(name = "CustomerId", required = true, nillable = true)
    protected String customerId;

    /**
     * Gets the value of the finalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinalBalance() {
        return finalBalance;
    }

    /**
     * Sets the value of the finalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinalBalance(BigDecimal value) {
        this.finalBalance = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issueStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueStoreId() {
        return issueStoreId;
    }

    /**
     * Sets the value of the issueStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueStoreId(String value) {
        this.issueStoreId = value;
    }

    /**
     * Gets the value of the rechargeRedeemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRechargeRedeemAmount() {
        return rechargeRedeemAmount;
    }

    /**
     * Sets the value of the rechargeRedeemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRechargeRedeemAmount(BigDecimal value) {
        this.rechargeRedeemAmount = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDate(XMLGregorianCalendar value) {
        this.validDate = value;
    }

    /**
     * Gets the value of the giftCertificateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateId() {
        return giftCertificateId;
    }

    /**
     * Sets the value of the giftCertificateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateId(String value) {
        this.giftCertificateId = value;
    }

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

}
