
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.GiftCertificateType;


/**
 * <p>Java class for GiftCertificateMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftCertificateMaster">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DefaultExpiryPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GiftCertificateType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}GiftCertificateType"/>
 *         &lt;element name="IsCashBackAllowed" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IsOnHold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOpenDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOpenPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsStoreCredit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PriceOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductGroupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCertificateMaster", propOrder = {
    "basePrice",
    "defaultExpiryPeriod",
    "giftCertificateType",
    "isCashBackAllowed",
    "isOnHold",
    "isOpenDescription",
    "isOpenPrice",
    "isStoreCredit",
    "priceOverrideAllowed",
    "upc",
    "id",
    "description",
    "productGroupId",
    "shortDescription",
    "longDescription"
})
public class GiftCertificateMaster
    extends BaseWrapper
{

    @XmlElement(name = "BasePrice", required = true)
    protected BigDecimal basePrice;
    @XmlElement(name = "DefaultExpiryPeriod")
    protected int defaultExpiryPeriod;
    @XmlElement(name = "GiftCertificateType", required = true)
    protected GiftCertificateType giftCertificateType;
    @XmlElement(name = "IsCashBackAllowed", required = true)
    protected BigDecimal isCashBackAllowed;
    @XmlElement(name = "IsOnHold")
    protected Boolean isOnHold;
    @XmlElement(name = "IsOpenDescription")
    protected Boolean isOpenDescription;
    @XmlElement(name = "IsOpenPrice")
    protected Boolean isOpenPrice;
    @XmlElement(name = "IsStoreCredit")
    protected boolean isStoreCredit;
    @XmlElement(name = "PriceOverrideAllowed")
    protected Boolean priceOverrideAllowed;
    @XmlElementRef(name = "UPC", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> upc;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "ProductGroupId", required = true, nillable = true)
    protected String productGroupId;
    @XmlElementRef(name = "ShortDescription", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shortDescription;
    @XmlElementRef(name = "LongDescription", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longDescription;

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasePrice(BigDecimal value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the defaultExpiryPeriod property.
     * 
     */
    public int getDefaultExpiryPeriod() {
        return defaultExpiryPeriod;
    }

    /**
     * Sets the value of the defaultExpiryPeriod property.
     * 
     */
    public void setDefaultExpiryPeriod(int value) {
        this.defaultExpiryPeriod = value;
    }

    /**
     * Gets the value of the giftCertificateType property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCertificateType }
     *     
     */
    public GiftCertificateType getGiftCertificateType() {
        return giftCertificateType;
    }

    /**
     * Sets the value of the giftCertificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCertificateType }
     *     
     */
    public void setGiftCertificateType(GiftCertificateType value) {
        this.giftCertificateType = value;
    }

    /**
     * Gets the value of the isCashBackAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIsCashBackAllowed() {
        return isCashBackAllowed;
    }

    /**
     * Sets the value of the isCashBackAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIsCashBackAllowed(BigDecimal value) {
        this.isCashBackAllowed = value;
    }

    /**
     * Gets the value of the isOnHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnHold() {
        return isOnHold;
    }

    /**
     * Sets the value of the isOnHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnHold(Boolean value) {
        this.isOnHold = value;
    }

    /**
     * Gets the value of the isOpenDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOpenDescription() {
        return isOpenDescription;
    }

    /**
     * Sets the value of the isOpenDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOpenDescription(Boolean value) {
        this.isOpenDescription = value;
    }

    /**
     * Gets the value of the isOpenPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOpenPrice() {
        return isOpenPrice;
    }

    /**
     * Sets the value of the isOpenPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOpenPrice(Boolean value) {
        this.isOpenPrice = value;
    }

    /**
     * Gets the value of the isStoreCredit property.
     * 
     */
    public boolean isIsStoreCredit() {
        return isStoreCredit;
    }

    /**
     * Sets the value of the isStoreCredit property.
     * 
     */
    public void setIsStoreCredit(boolean value) {
        this.isStoreCredit = value;
    }

    /**
     * Gets the value of the priceOverrideAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceOverrideAllowed() {
        return priceOverrideAllowed;
    }

    /**
     * Sets the value of the priceOverrideAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceOverrideAllowed(Boolean value) {
        this.priceOverrideAllowed = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUPC(JAXBElement<String> value) {
        this.upc = value;
    }

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
     * Gets the value of the productGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroupId() {
        return productGroupId;
    }

    /**
     * Sets the value of the productGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroupId(String value) {
        this.productGroupId = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShortDescription(JAXBElement<String> value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongDescription(JAXBElement<String> value) {
        this.longDescription = value;
    }

}
