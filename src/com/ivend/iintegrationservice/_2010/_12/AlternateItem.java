
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternateItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ParentProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MatchFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateItem", propOrder = {
    "parentProductId",
    "productId",
    "matchFactor"
})
public class AlternateItem
    extends BaseWrapper
{

    @XmlElement(name = "ParentProductId", required = true, nillable = true)
    protected String parentProductId;
    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElement(name = "MatchFactor", required = true)
    protected BigDecimal matchFactor;

    /**
     * Gets the value of the parentProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProductId() {
        return parentProductId;
    }

    /**
     * Sets the value of the parentProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProductId(String value) {
        this.parentProductId = value;
    }

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
     * Gets the value of the matchFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchFactor() {
        return matchFactor;
    }

    /**
     * Sets the value of the matchFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchFactor(BigDecimal value) {
        this.matchFactor = value;
    }

}
