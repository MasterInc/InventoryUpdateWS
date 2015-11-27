
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionPrinting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionPrinting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="CompanyRegisterationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCFNumberOfRefund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCFNumberOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrinterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ZReportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionPrinting", propOrder = {
    "companyRegisterationId",
    "ncfNumberOfRefund",
    "ncfNumberOfSale",
    "printerNumber",
    "receiptNumber",
    "transactionKey",
    "zReportNumber"
})
public class TransactionPrinting
    extends BaseWrapper
{

    @XmlElementRef(name = "CompanyRegisterationId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyRegisterationId;
    @XmlElementRef(name = "NCFNumberOfRefund", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ncfNumberOfRefund;
    @XmlElementRef(name = "NCFNumberOfSale", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ncfNumberOfSale;
    @XmlElementRef(name = "PrinterNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> printerNumber;
    @XmlElementRef(name = "ReceiptNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptNumber;
    @XmlElement(name = "TransactionKey")
    protected Long transactionKey;
    @XmlElementRef(name = "ZReportNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zReportNumber;

    /**
     * Gets the value of the companyRegisterationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyRegisterationId() {
        return companyRegisterationId;
    }

    /**
     * Sets the value of the companyRegisterationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyRegisterationId(JAXBElement<String> value) {
        this.companyRegisterationId = value;
    }

    /**
     * Gets the value of the ncfNumberOfRefund property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNCFNumberOfRefund() {
        return ncfNumberOfRefund;
    }

    /**
     * Sets the value of the ncfNumberOfRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNCFNumberOfRefund(JAXBElement<String> value) {
        this.ncfNumberOfRefund = value;
    }

    /**
     * Gets the value of the ncfNumberOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNCFNumberOfSale() {
        return ncfNumberOfSale;
    }

    /**
     * Sets the value of the ncfNumberOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNCFNumberOfSale(JAXBElement<String> value) {
        this.ncfNumberOfSale = value;
    }

    /**
     * Gets the value of the printerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrinterNumber() {
        return printerNumber;
    }

    /**
     * Sets the value of the printerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrinterNumber(JAXBElement<String> value) {
        this.printerNumber = value;
    }

    /**
     * Gets the value of the receiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Sets the value of the receiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptNumber(JAXBElement<String> value) {
        this.receiptNumber = value;
    }

    /**
     * Gets the value of the transactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionKey() {
        return transactionKey;
    }

    /**
     * Sets the value of the transactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionKey(Long value) {
        this.transactionKey = value;
    }

    /**
     * Gets the value of the zReportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZReportNumber() {
        return zReportNumber;
    }

    /**
     * Sets the value of the zReportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZReportNumber(JAXBElement<String> value) {
        this.zReportNumber = value;
    }

}
