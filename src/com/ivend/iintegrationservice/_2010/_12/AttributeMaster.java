
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeMaster">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="AttributeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttributeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttributeIsTwoDimensional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AttributeIsIsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AttributeDetailId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttributeDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttributeDetailIsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeMaster", propOrder = {
    "attributeId",
    "attributeDescription",
    "attributeIsTwoDimensional",
    "attributeIsIsActive",
    "attributeDetailId",
    "attributeDetailDescription",
    "attributeDetailIsActive"
})
public class AttributeMaster
    extends BaseWrapper
{

    @XmlElement(name = "AttributeId", required = true, nillable = true)
    protected String attributeId;
    @XmlElement(name = "AttributeDescription", required = true, nillable = true)
    protected String attributeDescription;
    @XmlElement(name = "AttributeIsTwoDimensional")
    protected Boolean attributeIsTwoDimensional;
    @XmlElement(name = "AttributeIsIsActive")
    protected Boolean attributeIsIsActive;
    @XmlElement(name = "AttributeDetailId", required = true, nillable = true)
    protected String attributeDetailId;
    @XmlElement(name = "AttributeDetailDescription", required = true, nillable = true)
    protected String attributeDetailDescription;
    @XmlElement(name = "AttributeDetailIsActive")
    protected Boolean attributeDetailIsActive;

    /**
     * Gets the value of the attributeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeId() {
        return attributeId;
    }

    /**
     * Sets the value of the attributeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeId(String value) {
        this.attributeId = value;
    }

    /**
     * Gets the value of the attributeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /**
     * Sets the value of the attributeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeDescription(String value) {
        this.attributeDescription = value;
    }

    /**
     * Gets the value of the attributeIsTwoDimensional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttributeIsTwoDimensional() {
        return attributeIsTwoDimensional;
    }

    /**
     * Sets the value of the attributeIsTwoDimensional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttributeIsTwoDimensional(Boolean value) {
        this.attributeIsTwoDimensional = value;
    }

    /**
     * Gets the value of the attributeIsIsActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttributeIsIsActive() {
        return attributeIsIsActive;
    }

    /**
     * Sets the value of the attributeIsIsActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttributeIsIsActive(Boolean value) {
        this.attributeIsIsActive = value;
    }

    /**
     * Gets the value of the attributeDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeDetailId() {
        return attributeDetailId;
    }

    /**
     * Sets the value of the attributeDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeDetailId(String value) {
        this.attributeDetailId = value;
    }

    /**
     * Gets the value of the attributeDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeDetailDescription() {
        return attributeDetailDescription;
    }

    /**
     * Sets the value of the attributeDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeDetailDescription(String value) {
        this.attributeDetailDescription = value;
    }

    /**
     * Gets the value of the attributeDetailIsActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttributeDetailIsActive() {
        return attributeDetailIsActive;
    }

    /**
     * Sets the value of the attributeDetailIsActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttributeDetailIsActive(Boolean value) {
        this.attributeDetailIsActive = value;
    }

}
