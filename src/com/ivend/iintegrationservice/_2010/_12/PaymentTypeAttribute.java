
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
import org.datacontract.schemas._2004._07.cxs_subsystem.PaymentTypeAttributeType;


/**
 * <p>Java class for PaymentTypeAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Payment}PaymentTypeAttributeType"/>
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MinimumStringLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaximumStringLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MinimumNumericValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MaximumNumericValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MinimumDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MaximumDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BooleanValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentTypeAttributeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeAttribute", propOrder = {
    "id",
    "description",
    "paymentTypeKey",
    "type",
    "isRequired",
    "minimumStringLength",
    "maximumStringLength",
    "minimumNumericValue",
    "maximumNumericValue",
    "minimumDate",
    "maximumDate",
    "booleanValue",
    "isActive",
    "defaultValue",
    "paymentTypeAttributeKey"
})
public class PaymentTypeAttribute
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "PaymentTypeKey", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentTypeKey;
    @XmlElement(name = "Type", required = true)
    protected PaymentTypeAttributeType type;
    @XmlElement(name = "IsRequired")
    protected boolean isRequired;
    @XmlElement(name = "MinimumStringLength")
    protected int minimumStringLength;
    @XmlElement(name = "MaximumStringLength")
    protected int maximumStringLength;
    @XmlElement(name = "MinimumNumericValue", required = true)
    protected BigDecimal minimumNumericValue;
    @XmlElement(name = "MaximumNumericValue", required = true)
    protected BigDecimal maximumNumericValue;
    @XmlElement(name = "MinimumDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minimumDate;
    @XmlElement(name = "MaximumDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maximumDate;
    @XmlElement(name = "BooleanValue")
    protected boolean booleanValue;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "DefaultValue", required = true, nillable = true)
    protected String defaultValue;
    @XmlElementRef(name = "PaymentTypeAttributeKey", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentTypeAttributeKey;

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
     * Gets the value of the paymentTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentTypeKey() {
        return paymentTypeKey;
    }

    /**
     * Sets the value of the paymentTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentTypeKey(JAXBElement<String> value) {
        this.paymentTypeKey = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeAttributeType }
     *     
     */
    public PaymentTypeAttributeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeAttributeType }
     *     
     */
    public void setType(PaymentTypeAttributeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     */
    public void setIsRequired(boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the minimumStringLength property.
     * 
     */
    public int getMinimumStringLength() {
        return minimumStringLength;
    }

    /**
     * Sets the value of the minimumStringLength property.
     * 
     */
    public void setMinimumStringLength(int value) {
        this.minimumStringLength = value;
    }

    /**
     * Gets the value of the maximumStringLength property.
     * 
     */
    public int getMaximumStringLength() {
        return maximumStringLength;
    }

    /**
     * Sets the value of the maximumStringLength property.
     * 
     */
    public void setMaximumStringLength(int value) {
        this.maximumStringLength = value;
    }

    /**
     * Gets the value of the minimumNumericValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumNumericValue() {
        return minimumNumericValue;
    }

    /**
     * Sets the value of the minimumNumericValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumNumericValue(BigDecimal value) {
        this.minimumNumericValue = value;
    }

    /**
     * Gets the value of the maximumNumericValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumNumericValue() {
        return maximumNumericValue;
    }

    /**
     * Sets the value of the maximumNumericValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumNumericValue(BigDecimal value) {
        this.maximumNumericValue = value;
    }

    /**
     * Gets the value of the minimumDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinimumDate() {
        return minimumDate;
    }

    /**
     * Sets the value of the minimumDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinimumDate(XMLGregorianCalendar value) {
        this.minimumDate = value;
    }

    /**
     * Gets the value of the maximumDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaximumDate() {
        return maximumDate;
    }

    /**
     * Sets the value of the maximumDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaximumDate(XMLGregorianCalendar value) {
        this.maximumDate = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     */
    public boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     */
    public void setBooleanValue(boolean value) {
        this.booleanValue = value;
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
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the paymentTypeAttributeKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentTypeAttributeKey() {
        return paymentTypeAttributeKey;
    }

    /**
     * Sets the value of the paymentTypeAttributeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentTypeAttributeKey(JAXBElement<String> value) {
        this.paymentTypeAttributeKey = value;
    }

}
