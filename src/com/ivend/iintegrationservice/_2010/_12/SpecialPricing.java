
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_platform.DiscountType;
import org.datacontract.schemas._2004._07.cxs_subsystem.PricingType;


/**
 * <p>Java class for SpecialPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialPricing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PricingType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Pricing}PricingType"/>
 *         &lt;element name="BaseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BasePriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DiscountType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}DiscountType"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AutoUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SpecialPriceListDate" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfSpecialPricingDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialPricing", propOrder = {
    "productId",
    "pricingType",
    "baseId",
    "basePriceListId",
    "price",
    "discountType",
    "discount",
    "autoUpdate",
    "specialPriceListDate"
})
public class SpecialPricing
    extends BaseWrapper
{

    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElement(name = "PricingType", required = true)
    protected PricingType pricingType;
    @XmlElement(name = "BaseId", required = true, nillable = true)
    protected String baseId;
    @XmlElementRef(name = "BasePriceListId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> basePriceListId;
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;
    @XmlElement(name = "DiscountType", required = true)
    protected DiscountType discountType;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "AutoUpdate")
    protected boolean autoUpdate;
    @XmlElementRef(name = "SpecialPriceListDate", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSpecialPricingDate> specialPriceListDate;

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
     * Gets the value of the pricingType property.
     * 
     * @return
     *     possible object is
     *     {@link PricingType }
     *     
     */
    public PricingType getPricingType() {
        return pricingType;
    }

    /**
     * Sets the value of the pricingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingType }
     *     
     */
    public void setPricingType(PricingType value) {
        this.pricingType = value;
    }

    /**
     * Gets the value of the baseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseId() {
        return baseId;
    }

    /**
     * Sets the value of the baseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseId(String value) {
        this.baseId = value;
    }

    /**
     * Gets the value of the basePriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBasePriceListId() {
        return basePriceListId;
    }

    /**
     * Sets the value of the basePriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBasePriceListId(JAXBElement<String> value) {
        this.basePriceListId = value;
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
     * Gets the value of the specialPriceListDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSpecialPricingDate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSpecialPricingDate> getSpecialPriceListDate() {
        return specialPriceListDate;
    }

    /**
     * Sets the value of the specialPriceListDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSpecialPricingDate }{@code >}
     *     
     */
    public void setSpecialPriceListDate(JAXBElement<ArrayOfSpecialPricingDate> value) {
        this.specialPriceListDate = value;
    }

}
