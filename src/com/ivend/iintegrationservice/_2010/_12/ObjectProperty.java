
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectProperty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsUserDefinedField" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectProperty", propOrder = {
    "propertyName",
    "isUserDefinedField",
    "propertyValue"
})
public class ObjectProperty
    extends BaseWrapper
{

    @XmlElement(name = "PropertyName", required = true, nillable = true)
    protected String propertyName;
    @XmlElement(name = "IsUserDefinedField")
    protected boolean isUserDefinedField;
    @XmlElement(name = "PropertyValue", required = true, nillable = true)
    protected String propertyValue;

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the isUserDefinedField property.
     * 
     */
    public boolean isIsUserDefinedField() {
        return isUserDefinedField;
    }

    /**
     * Sets the value of the isUserDefinedField property.
     * 
     */
    public void setIsUserDefinedField(boolean value) {
        this.isUserDefinedField = value;
    }

    /**
     * Gets the value of the propertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * Sets the value of the propertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyValue(String value) {
        this.propertyValue = value;
    }

}
