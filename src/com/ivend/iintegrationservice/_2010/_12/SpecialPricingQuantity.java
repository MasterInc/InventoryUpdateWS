
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_platform.DiscountType;


/**
 * <p>Java class for SpecialPricingQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialPricingQuantity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DiscountType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}DiscountType"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AutoUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UoMId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialPricingQuantity", propOrder = {
    "quantity",
    "price",
    "discountType",
    "discount",
    "priceListId",
    "autoUpdate",
    "uoMId"
})
public class SpecialPricingQuantity
    extends BaseWrapper
{

    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;
    @XmlElement(name = "DiscountType", required = true)
    protected DiscountType discountType;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "PriceListId", required = true, nillable = true)
    protected String priceListId;
    @XmlElement(name = "AutoUpdate")
    protected boolean autoUpdate;
    @XmlElement(name = "UoMId", required = true, nillable = true)
    protected String uoMId;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setDiscountType(DiscountType value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListId(String value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the autoUpdate property.
     * 
     */
    public boolean isAutoUpdate() {
        return autoUpdate;
    }

    /**
     * Sets the value of the autoUpdate property.
     * 
     */
    public void setAutoUpdate(boolean value) {
        this.autoUpdate = value;
    }

    /**
     * Gets the value of the uoMId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUoMId() {
        return uoMId;
    }

    /**
     * Sets the value of the uoMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUoMId(String value) {
        this.uoMId = value;
    }

}
