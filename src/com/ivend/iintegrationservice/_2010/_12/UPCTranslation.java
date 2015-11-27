
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UPCTranslation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UPCTranslation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UPCTranslationQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPCTranslation", propOrder = {
    "productId",
    "upc",
    "upcTranslationQuantity",
    "uoM",
    "isDefault"
})
public class UPCTranslation
    extends BaseWrapper
{

    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElement(name = "UPC", required = true, nillable = true)
    protected String upc;
    @XmlElement(name = "UPCTranslationQuantity")
    protected BigDecimal upcTranslationQuantity;
    @XmlElementRef(name = "UoM", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uoM;
    @XmlElement(name = "IsDefault")
    protected Boolean isDefault;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the upcTranslationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUPCTranslationQuantity() {
        return upcTranslationQuantity;
    }

    /**
     * Sets the value of the upcTranslationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUPCTranslationQuantity(BigDecimal value) {
        this.upcTranslationQuantity = value;
    }

    /**
     * Gets the value of the uoM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUoM() {
        return uoM;
    }

    /**
     * Sets the value of the uoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUoM(JAXBElement<String> value) {
        this.uoM = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

}
