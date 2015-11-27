
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PurchaseTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesTaxCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InventoryCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InStockQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OnLayawayQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InTransitQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryItem", propOrder = {
    "productId",
    "warehouseId",
    "purchaseTaxCodeId",
    "salesTaxCodeId",
    "locked",
    "inventoryCycleId",
    "inStockQuantity",
    "onLayawayQuantity",
    "availableQuantity",
    "inTransitQuantity",
    "price"
})
public class InventoryItem
    extends BaseWrapper
{

    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElement(name = "WarehouseId", required = true, nillable = true)
    protected String warehouseId;
    @XmlElementRef(name = "PurchaseTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseTaxCodeId;
    @XmlElementRef(name = "SalesTaxCodeId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesTaxCodeId;
    @XmlElement(name = "Locked")
    protected Boolean locked;
    @XmlElementRef(name = "InventoryCycleId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventoryCycleId;
    @XmlElement(name = "InStockQuantity")
    protected BigDecimal inStockQuantity;
    @XmlElement(name = "OnLayawayQuantity")
    protected BigDecimal onLayawayQuantity;
    @XmlElement(name = "AvailableQuantity")
    protected BigDecimal availableQuantity;
    @XmlElement(name = "InTransitQuantity")
    protected BigDecimal inTransitQuantity;
    @XmlElement(name = "Price")
    protected BigDecimal price;

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
     * Gets the value of the warehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseId() {
        return warehouseId;
    }

    /**
     * Sets the value of the warehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseId(String value) {
        this.warehouseId = value;
    }

    /**
     * Gets the value of the purchaseTaxCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchaseTaxCodeId() {
        return purchaseTaxCodeId;
    }

    /**
     * Sets the value of the purchaseTaxCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchaseTaxCodeId(JAXBElement<String> value) {
        this.purchaseTaxCodeId = value;
    }

    /**
     * Gets the value of the salesTaxCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesTaxCodeId() {
        return salesTaxCodeId;
    }

    /**
     * Sets the value of the salesTaxCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesTaxCodeId(JAXBElement<String> value) {
        this.salesTaxCodeId = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the inventoryCycleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventoryCycleId() {
        return inventoryCycleId;
    }

    /**
     * Sets the value of the inventoryCycleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventoryCycleId(JAXBElement<String> value) {
        this.inventoryCycleId = value;
    }

    /**
     * Gets the value of the inStockQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInStockQuantity() {
        return inStockQuantity;
    }

    /**
     * Sets the value of the inStockQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInStockQuantity(BigDecimal value) {
        this.inStockQuantity = value;
    }

    /**
     * Gets the value of the onLayawayQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnLayawayQuantity() {
        return onLayawayQuantity;
    }

    /**
     * Sets the value of the onLayawayQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnLayawayQuantity(BigDecimal value) {
        this.onLayawayQuantity = value;
    }

    /**
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableQuantity(BigDecimal value) {
        this.availableQuantity = value;
    }

    /**
     * Gets the value of the inTransitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTransitQuantity() {
        return inTransitQuantity;
    }

    /**
     * Sets the value of the inTransitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTransitQuantity(BigDecimal value) {
        this.inTransitQuantity = value;
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

}
