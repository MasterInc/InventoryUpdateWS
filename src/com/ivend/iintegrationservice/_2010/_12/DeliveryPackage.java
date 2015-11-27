
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeliveryPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryPackage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="DeliveryPackageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="POSId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PackageAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DeliveryAddress" type="{http://www.iVend.com/IIntegrationService/2010/12}DeliveryPackageAddress"/>
 *         &lt;element name="DeliveryPackageKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryPackage", propOrder = {
    "deliveryPackageId",
    "transactionId",
    "transactionKey",
    "posId",
    "customerId",
    "packageAmount",
    "status",
    "deliveryDate",
    "deliveryAddress",
    "deliveryPackageKey"
})
public class DeliveryPackage
    extends BaseWrapper
{

    @XmlElement(name = "DeliveryPackageId", required = true, nillable = true)
    protected String deliveryPackageId;
    @XmlElement(name = "TransactionId", required = true, nillable = true)
    protected String transactionId;
    @XmlElement(name = "TransactionKey")
    protected long transactionKey;
    @XmlElement(name = "POSId", required = true, nillable = true)
    protected String posId;
    @XmlElement(name = "CustomerId", required = true, nillable = true)
    protected String customerId;
    @XmlElement(name = "PackageAmount", required = true)
    protected BigDecimal packageAmount;
    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "DeliveryAddress", required = true, nillable = true)
    protected DeliveryPackageAddress deliveryAddress;
    @XmlElement(name = "DeliveryPackageKey")
    protected long deliveryPackageKey;

    /**
     * Gets the value of the deliveryPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPackageId() {
        return deliveryPackageId;
    }

    /**
     * Sets the value of the deliveryPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPackageId(String value) {
        this.deliveryPackageId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

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
     * Gets the value of the posId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSId() {
        return posId;
    }

    /**
     * Sets the value of the posId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSId(String value) {
        this.posId = value;
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

    /**
     * Gets the value of the packageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPackageAmount() {
        return packageAmount;
    }

    /**
     * Sets the value of the packageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPackageAmount(BigDecimal value) {
        this.packageAmount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPackageAddress }
     *     
     */
    public DeliveryPackageAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPackageAddress }
     *     
     */
    public void setDeliveryAddress(DeliveryPackageAddress value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryPackageKey property.
     * 
     */
    public long getDeliveryPackageKey() {
        return deliveryPackageKey;
    }

    /**
     * Sets the value of the deliveryPackageKey property.
     * 
     */
    public void setDeliveryPackageKey(long value) {
        this.deliveryPackageKey = value;
    }

}
