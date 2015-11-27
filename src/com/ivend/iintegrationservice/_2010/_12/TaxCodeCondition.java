
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TaxConditionType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TaxCustomerConditionType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TaxProductConditionType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TaxWarehouseConditionType;


/**
 * <p>Java class for TaxCodeCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxCodeCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="BusinessPartnerType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}TaxCustomerConditionType"/>
 *         &lt;element name="BusinessPartnerValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductConditionType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}TaxProductConditionType"/>
 *         &lt;element name="ProductConditionValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseConditionType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}TaxWarehouseConditionType"/>
 *         &lt;element name="WarehouseConditionValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MinimumPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MaximumPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ConditionType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}TaxConditionType"/>
 *         &lt;element name="ConditionTypeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxConditionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AttributeCondition1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeCondition2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeCondition3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeValue3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFCondition1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFCondition2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFCondition3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFValue3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCodeCondition", propOrder = {
    "businessPartnerType",
    "businessPartnerValue",
    "productConditionType",
    "productConditionValue",
    "warehouseConditionType",
    "warehouseConditionValue",
    "minimumPrice",
    "maximumPrice",
    "conditionType",
    "conditionTypeValue",
    "taxCode",
    "taxConditionKey",
    "attributeCondition1",
    "attributeValue1",
    "attributeCondition2",
    "attributeValue2",
    "attributeCondition3",
    "attributeValue3",
    "udfCondition1",
    "udfValue1",
    "udfCondition2",
    "udfValue2",
    "udfCondition3",
    "udfValue3",
    "fromDate",
    "toDate",
    "fromTime",
    "toTime"
})
public class TaxCodeCondition
    extends BaseWrapper
{

    @XmlElement(name = "BusinessPartnerType", required = true)
    protected TaxCustomerConditionType businessPartnerType;
    @XmlElement(name = "BusinessPartnerValue", required = true, nillable = true)
    protected String businessPartnerValue;
    @XmlElement(name = "ProductConditionType", required = true)
    protected TaxProductConditionType productConditionType;
    @XmlElement(name = "ProductConditionValue", required = true, nillable = true)
    protected String productConditionValue;
    @XmlElement(name = "WarehouseConditionType", required = true)
    protected TaxWarehouseConditionType warehouseConditionType;
    @XmlElement(name = "WarehouseConditionValue", required = true, nillable = true)
    protected String warehouseConditionValue;
    @XmlElement(name = "MinimumPrice", required = true)
    protected BigDecimal minimumPrice;
    @XmlElement(name = "MaximumPrice", required = true)
    protected BigDecimal maximumPrice;
    @XmlElement(name = "ConditionType", required = true)
    protected TaxConditionType conditionType;
    @XmlElement(name = "ConditionTypeValue", required = true, nillable = true)
    protected String conditionTypeValue;
    @XmlElement(name = "TaxCode", required = true, nillable = true)
    protected String taxCode;
    @XmlElement(name = "TaxConditionKey")
    protected Long taxConditionKey;
    @XmlElementRef(name = "AttributeCondition1", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeCondition1;
    @XmlElementRef(name = "AttributeValue1", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeValue1;
    @XmlElementRef(name = "AttributeCondition2", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeCondition2;
    @XmlElementRef(name = "AttributeValue2", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeValue2;
    @XmlElementRef(name = "AttributeCondition3", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeCondition3;
    @XmlElementRef(name = "AttributeValue3", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeValue3;
    @XmlElementRef(name = "UDFCondition1", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udfCondition1;
    @XmlElementRef(name = "UDFValue1", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udfValue1;
    @XmlElementRef(name = "UDFCondition2", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udfCondition2;
    @XmlElementRef(name = "UDFValue2", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udfValue2;
    @XmlElementRef(name = "UDFCondition3", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udfCondition3;
    @XmlElementRef(name = "UDFValue3", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udfValue3;
    @XmlElementRef(name = "FromDate", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromDate;
    @XmlElementRef(name = "ToDate", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toDate;
    @XmlElementRef(name = "FromTime", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromTime;
    @XmlElementRef(name = "ToTime", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toTime;

    /**
     * Gets the value of the businessPartnerType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCustomerConditionType }
     *     
     */
    public TaxCustomerConditionType getBusinessPartnerType() {
        return businessPartnerType;
    }

    /**
     * Sets the value of the businessPartnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCustomerConditionType }
     *     
     */
    public void setBusinessPartnerType(TaxCustomerConditionType value) {
        this.businessPartnerType = value;
    }

    /**
     * Gets the value of the businessPartnerValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerValue() {
        return businessPartnerValue;
    }

    /**
     * Sets the value of the businessPartnerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerValue(String value) {
        this.businessPartnerValue = value;
    }

    /**
     * Gets the value of the productConditionType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxProductConditionType }
     *     
     */
    public TaxProductConditionType getProductConditionType() {
        return productConditionType;
    }

    /**
     * Sets the value of the productConditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxProductConditionType }
     *     
     */
    public void setProductConditionType(TaxProductConditionType value) {
        this.productConditionType = value;
    }

    /**
     * Gets the value of the productConditionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductConditionValue() {
        return productConditionValue;
    }

    /**
     * Sets the value of the productConditionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductConditionValue(String value) {
        this.productConditionValue = value;
    }

    /**
     * Gets the value of the warehouseConditionType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxWarehouseConditionType }
     *     
     */
    public TaxWarehouseConditionType getWarehouseConditionType() {
        return warehouseConditionType;
    }

    /**
     * Sets the value of the warehouseConditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxWarehouseConditionType }
     *     
     */
    public void setWarehouseConditionType(TaxWarehouseConditionType value) {
        this.warehouseConditionType = value;
    }

    /**
     * Gets the value of the warehouseConditionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseConditionValue() {
        return warehouseConditionValue;
    }

    /**
     * Sets the value of the warehouseConditionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseConditionValue(String value) {
        this.warehouseConditionValue = value;
    }

    /**
     * Gets the value of the minimumPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Sets the value of the minimumPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPrice(BigDecimal value) {
        this.minimumPrice = value;
    }

    /**
     * Gets the value of the maximumPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPrice() {
        return maximumPrice;
    }

    /**
     * Sets the value of the maximumPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPrice(BigDecimal value) {
        this.maximumPrice = value;
    }

    /**
     * Gets the value of the conditionType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxConditionType }
     *     
     */
    public TaxConditionType getConditionType() {
        return conditionType;
    }

    /**
     * Sets the value of the conditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxConditionType }
     *     
     */
    public void setConditionType(TaxConditionType value) {
        this.conditionType = value;
    }

    /**
     * Gets the value of the conditionTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionTypeValue() {
        return conditionTypeValue;
    }

    /**
     * Sets the value of the conditionTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionTypeValue(String value) {
        this.conditionTypeValue = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxConditionKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxConditionKey() {
        return taxConditionKey;
    }

    /**
     * Sets the value of the taxConditionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxConditionKey(Long value) {
        this.taxConditionKey = value;
    }

    /**
     * Gets the value of the attributeCondition1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeCondition1() {
        return attributeCondition1;
    }

    /**
     * Sets the value of the attributeCondition1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeCondition1(JAXBElement<String> value) {
        this.attributeCondition1 = value;
    }

    /**
     * Gets the value of the attributeValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeValue1() {
        return attributeValue1;
    }

    /**
     * Sets the value of the attributeValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeValue1(JAXBElement<String> value) {
        this.attributeValue1 = value;
    }

    /**
     * Gets the value of the attributeCondition2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeCondition2() {
        return attributeCondition2;
    }

    /**
     * Sets the value of the attributeCondition2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeCondition2(JAXBElement<String> value) {
        this.attributeCondition2 = value;
    }

    /**
     * Gets the value of the attributeValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeValue2() {
        return attributeValue2;
    }

    /**
     * Sets the value of the attributeValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeValue2(JAXBElement<String> value) {
        this.attributeValue2 = value;
    }

    /**
     * Gets the value of the attributeCondition3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeCondition3() {
        return attributeCondition3;
    }

    /**
     * Sets the value of the attributeCondition3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeCondition3(JAXBElement<String> value) {
        this.attributeCondition3 = value;
    }

    /**
     * Gets the value of the attributeValue3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeValue3() {
        return attributeValue3;
    }

    /**
     * Sets the value of the attributeValue3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeValue3(JAXBElement<String> value) {
        this.attributeValue3 = value;
    }

    /**
     * Gets the value of the udfCondition1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUDFCondition1() {
        return udfCondition1;
    }

    /**
     * Sets the value of the udfCondition1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUDFCondition1(JAXBElement<String> value) {
        this.udfCondition1 = value;
    }

    /**
     * Gets the value of the udfValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUDFValue1() {
        return udfValue1;
    }

    /**
     * Sets the value of the udfValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUDFValue1(JAXBElement<String> value) {
        this.udfValue1 = value;
    }

    /**
     * Gets the value of the udfCondition2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUDFCondition2() {
        return udfCondition2;
    }

    /**
     * Sets the value of the udfCondition2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUDFCondition2(JAXBElement<String> value) {
        this.udfCondition2 = value;
    }

    /**
     * Gets the value of the udfValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUDFValue2() {
        return udfValue2;
    }

    /**
     * Sets the value of the udfValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUDFValue2(JAXBElement<String> value) {
        this.udfValue2 = value;
    }

    /**
     * Gets the value of the udfCondition3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUDFCondition3() {
        return udfCondition3;
    }

    /**
     * Sets the value of the udfCondition3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUDFCondition3(JAXBElement<String> value) {
        this.udfCondition3 = value;
    }

    /**
     * Gets the value of the udfValue3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUDFValue3() {
        return udfValue3;
    }

    /**
     * Sets the value of the udfValue3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUDFValue3(JAXBElement<String> value) {
        this.udfValue3 = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromDate(JAXBElement<String> value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToDate(JAXBElement<String> value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the fromTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromTime(JAXBElement<String> value) {
        this.fromTime = value;
    }

    /**
     * Gets the value of the toTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToTime() {
        return toTime;
    }

    /**
     * Sets the value of the toTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToTime(JAXBElement<String> value) {
        this.toTime = value;
    }

}
