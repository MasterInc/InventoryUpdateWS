
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_framework.UserDefinedFieldDataType;


/**
 * <p>Java class for UserDefinedFieldsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefinedFieldsDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://schemas.datacontract.org/2004/07/CXS.Framework.Core}UserDefinedFieldDataType" minOccurs="0"/>
 *         &lt;element name="DataLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsSearchable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowInResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegularExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefinedFieldDetailKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedFieldsDetails", propOrder = {
    "objectName",
    "fieldName",
    "description",
    "dataType",
    "dataLength",
    "isSearchable",
    "showInResults",
    "displayOnly",
    "isMandatory",
    "regularExpression",
    "userDefinedFieldDetailKey"
})
public class UserDefinedFieldsDetails
    extends BaseWrapper
{

    @XmlElement(name = "ObjectName", required = true, nillable = true)
    protected String objectName;
    @XmlElementRef(name = "FieldName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldName;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "DataType")
    protected UserDefinedFieldDataType dataType;
    @XmlElement(name = "DataLength")
    protected Integer dataLength;
    @XmlElement(name = "IsSearchable")
    protected Boolean isSearchable;
    @XmlElement(name = "ShowInResults")
    protected Boolean showInResults;
    @XmlElement(name = "DisplayOnly")
    protected Boolean displayOnly;
    @XmlElement(name = "IsMandatory")
    protected Boolean isMandatory;
    @XmlElementRef(name = "RegularExpression", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regularExpression;
    @XmlElement(name = "UserDefinedFieldDetailKey")
    protected Long userDefinedFieldDetailKey;

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldName(JAXBElement<String> value) {
        this.fieldName = value;
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
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedFieldDataType }
     *     
     */
    public UserDefinedFieldDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedFieldDataType }
     *     
     */
    public void setDataType(UserDefinedFieldDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the dataLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataLength() {
        return dataLength;
    }

    /**
     * Sets the value of the dataLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataLength(Integer value) {
        this.dataLength = value;
    }

    /**
     * Gets the value of the isSearchable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSearchable() {
        return isSearchable;
    }

    /**
     * Sets the value of the isSearchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSearchable(Boolean value) {
        this.isSearchable = value;
    }

    /**
     * Gets the value of the showInResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInResults() {
        return showInResults;
    }

    /**
     * Sets the value of the showInResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInResults(Boolean value) {
        this.showInResults = value;
    }

    /**
     * Gets the value of the displayOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayOnly() {
        return displayOnly;
    }

    /**
     * Sets the value of the displayOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayOnly(Boolean value) {
        this.displayOnly = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the regularExpression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegularExpression() {
        return regularExpression;
    }

    /**
     * Sets the value of the regularExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegularExpression(JAXBElement<String> value) {
        this.regularExpression = value;
    }

    /**
     * Gets the value of the userDefinedFieldDetailKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserDefinedFieldDetailKey() {
        return userDefinedFieldDetailKey;
    }

    /**
     * Sets the value of the userDefinedFieldDetailKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserDefinedFieldDetailKey(Long value) {
        this.userDefinedFieldDetailKey = value;
    }

}
