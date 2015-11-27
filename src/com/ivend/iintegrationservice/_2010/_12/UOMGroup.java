
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UOMGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UOMGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BaseUOMId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BaseUOMDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AlternateUOMId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AlternateUOMDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AlternateQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BaseQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UOMGroup", propOrder = {
    "id",
    "description",
    "baseUOMId",
    "baseUOMDescription",
    "lineNumber",
    "alternateUOMId",
    "alternateUOMDescription",
    "alternateQuantity",
    "baseQuantity"
})
public class UOMGroup
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "BaseUOMId", required = true, nillable = true)
    protected String baseUOMId;
    @XmlElement(name = "BaseUOMDescription", required = true, nillable = true)
    protected String baseUOMDescription;
    @XmlElement(name = "LineNumber")
    protected Integer lineNumber;
    @XmlElement(name = "AlternateUOMId", required = true, nillable = true)
    protected String alternateUOMId;
    @XmlElement(name = "AlternateUOMDescription", required = true, nillable = true)
    protected String alternateUOMDescription;
    @XmlElement(name = "AlternateQuantity", required = true)
    protected BigDecimal alternateQuantity;
    @XmlElement(name = "BaseQuantity", required = true)
    protected BigDecimal baseQuantity;

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
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the baseUOMId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUOMId() {
        return baseUOMId;
    }

    /**
     * Sets the value of the baseUOMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUOMId(String value) {
        this.baseUOMId = value;
    }

    /**
     * Gets the value of the baseUOMDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUOMDescription() {
        return baseUOMDescription;
    }

    /**
     * Sets the value of the baseUOMDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUOMDescription(String value) {
        this.baseUOMDescription = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the alternateUOMId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateUOMId() {
        return alternateUOMId;
    }

    /**
     * Sets the value of the alternateUOMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateUOMId(String value) {
        this.alternateUOMId = value;
    }

    /**
     * Gets the value of the alternateUOMDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateUOMDescription() {
        return alternateUOMDescription;
    }

    /**
     * Sets the value of the alternateUOMDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateUOMDescription(String value) {
        this.alternateUOMDescription = value;
    }

    /**
     * Gets the value of the alternateQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlternateQuantity() {
        return alternateQuantity;
    }

    /**
     * Sets the value of the alternateQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlternateQuantity(BigDecimal value) {
        this.alternateQuantity = value;
    }

    /**
     * Gets the value of the baseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseQuantity() {
        return baseQuantity;
    }

    /**
     * Sets the value of the baseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseQuantity(BigDecimal value) {
        this.baseQuantity = value;
    }

}
