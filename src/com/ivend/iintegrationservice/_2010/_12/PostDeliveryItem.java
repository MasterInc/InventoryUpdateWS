
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PostDeliveryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostDeliveryItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="DeliveryPackageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeliveryPackageKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PackageAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostDeliveryItem", propOrder = {
    "deliveryPackageId",
    "deliveryPackageKey",
    "status",
    "deliveryDate",
    "packageAmount"
})
public class PostDeliveryItem
    extends BaseWrapper
{

    @XmlElement(name = "DeliveryPackageId", required = true, nillable = true)
    protected String deliveryPackageId;
    @XmlElement(name = "DeliveryPackageKey")
    protected long deliveryPackageKey;
    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "PackageAmount")
    protected BigDecimal packageAmount;

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

}
