
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_platform.DiscountType;
import org.datacontract.schemas._2004._07.cxs_subsystem.PromotionType;


/**
 * <p>Java class for PromotionBonusBuys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionBonusBuys">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PromotionType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Promotion}PromotionType"/>
 *         &lt;element name="HasValidDates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HasValidTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MinimumBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DiscountType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}DiscountType"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumRedemptionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CanRepeatInTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LowestValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExcludeDiscountedItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyOnItemScan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PromotionDaysApplicability" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPromotionDaysApplicability" minOccurs="0"/>
 *         &lt;element name="PromotionApplicabilityDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPromotionApplicabilityDetail" minOccurs="0"/>
 *         &lt;element name="BuyOptionalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GetOptionalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PromotionBuy" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPromotionBuy"/>
 *         &lt;element name="PromotionGet" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPromotionGet"/>
 *         &lt;element name="PromotionExcludedItemDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPromotionExcludedItem" minOccurs="0"/>
 *         &lt;element name="PromotionProductDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPromotionProductDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionBonusBuys", propOrder = {
    "id",
    "description",
    "active",
    "promotionType",
    "hasValidDates",
    "startDate",
    "endDate",
    "hasValidTime",
    "startTime",
    "endTime",
    "minimumBillAmount",
    "minimumQuantity",
    "discountType",
    "discountPercent",
    "maximumRedemptionCount",
    "canRepeatInTransaction",
    "lowestValue",
    "excludeDiscountedItems",
    "applyOnItemScan",
    "promotionDaysApplicability",
    "promotionApplicabilityDetail",
    "buyOptionalCount",
    "getOptionalCount",
    "promotionBuy",
    "promotionGet",
    "promotionExcludedItemDetail",
    "promotionProductDetail"
})
public class PromotionBonusBuys
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "PromotionType", required = true)
    protected PromotionType promotionType;
    @XmlElement(name = "HasValidDates")
    protected Boolean hasValidDates;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "HasValidTime")
    protected Boolean hasValidTime;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "MinimumBillAmount", required = true)
    protected BigDecimal minimumBillAmount;
    @XmlElement(name = "MinimumQuantity")
    protected int minimumQuantity;
    @XmlElement(name = "DiscountType", required = true)
    protected DiscountType discountType;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "MaximumRedemptionCount")
    protected Integer maximumRedemptionCount;
    @XmlElement(name = "CanRepeatInTransaction")
    protected Boolean canRepeatInTransaction;
    @XmlElement(name = "LowestValue")
    protected Boolean lowestValue;
    @XmlElement(name = "ExcludeDiscountedItems")
    protected Boolean excludeDiscountedItems;
    @XmlElement(name = "ApplyOnItemScan")
    protected Boolean applyOnItemScan;
    @XmlElementRef(name = "PromotionDaysApplicability", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPromotionDaysApplicability> promotionDaysApplicability;
    @XmlElementRef(name = "PromotionApplicabilityDetail", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPromotionApplicabilityDetail> promotionApplicabilityDetail;
    @XmlElement(name = "BuyOptionalCount")
    protected Integer buyOptionalCount;
    @XmlElement(name = "GetOptionalCount")
    protected Integer getOptionalCount;
    @XmlElement(name = "PromotionBuy", required = true, nillable = true)
    protected ArrayOfPromotionBuy promotionBuy;
    @XmlElement(name = "PromotionGet", required = true, nillable = true)
    protected ArrayOfPromotionGet promotionGet;
    @XmlElementRef(name = "PromotionExcludedItemDetail", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPromotionExcludedItem> promotionExcludedItemDetail;
    @XmlElementRef(name = "PromotionProductDetail", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPromotionProductDetail> promotionProductDetail;

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
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the promotionType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionType }
     *     
     */
    public PromotionType getPromotionType() {
        return promotionType;
    }

    /**
     * Sets the value of the promotionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType }
     *     
     */
    public void setPromotionType(PromotionType value) {
        this.promotionType = value;
    }

    /**
     * Gets the value of the hasValidDates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasValidDates() {
        return hasValidDates;
    }

    /**
     * Sets the value of the hasValidDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasValidDates(Boolean value) {
        this.hasValidDates = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the hasValidTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasValidTime() {
        return hasValidTime;
    }

    /**
     * Sets the value of the hasValidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasValidTime(Boolean value) {
        this.hasValidTime = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the minimumBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumBillAmount() {
        return minimumBillAmount;
    }

    /**
     * Sets the value of the minimumBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumBillAmount(BigDecimal value) {
        this.minimumBillAmount = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     */
    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     */
    public void setMinimumQuantity(int value) {
        this.minimumQuantity = value;
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
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the maximumRedemptionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumRedemptionCount() {
        return maximumRedemptionCount;
    }

    /**
     * Sets the value of the maximumRedemptionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumRedemptionCount(Integer value) {
        this.maximumRedemptionCount = value;
    }

    /**
     * Gets the value of the canRepeatInTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanRepeatInTransaction() {
        return canRepeatInTransaction;
    }

    /**
     * Sets the value of the canRepeatInTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanRepeatInTransaction(Boolean value) {
        this.canRepeatInTransaction = value;
    }

    /**
     * Gets the value of the lowestValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowestValue() {
        return lowestValue;
    }

    /**
     * Sets the value of the lowestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowestValue(Boolean value) {
        this.lowestValue = value;
    }

    /**
     * Gets the value of the excludeDiscountedItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeDiscountedItems() {
        return excludeDiscountedItems;
    }

    /**
     * Sets the value of the excludeDiscountedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeDiscountedItems(Boolean value) {
        this.excludeDiscountedItems = value;
    }

    /**
     * Gets the value of the applyOnItemScan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyOnItemScan() {
        return applyOnItemScan;
    }

    /**
     * Sets the value of the applyOnItemScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyOnItemScan(Boolean value) {
        this.applyOnItemScan = value;
    }

    /**
     * Gets the value of the promotionDaysApplicability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPromotionDaysApplicability }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPromotionDaysApplicability> getPromotionDaysApplicability() {
        return promotionDaysApplicability;
    }

    /**
     * Sets the value of the promotionDaysApplicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPromotionDaysApplicability }{@code >}
     *     
     */
    public void setPromotionDaysApplicability(JAXBElement<ArrayOfPromotionDaysApplicability> value) {
        this.promotionDaysApplicability = value;
    }

    /**
     * Gets the value of the promotionApplicabilityDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPromotionApplicabilityDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPromotionApplicabilityDetail> getPromotionApplicabilityDetail() {
        return promotionApplicabilityDetail;
    }

    /**
     * Sets the value of the promotionApplicabilityDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPromotionApplicabilityDetail }{@code >}
     *     
     */
    public void setPromotionApplicabilityDetail(JAXBElement<ArrayOfPromotionApplicabilityDetail> value) {
        this.promotionApplicabilityDetail = value;
    }

    /**
     * Gets the value of the buyOptionalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuyOptionalCount() {
        return buyOptionalCount;
    }

    /**
     * Sets the value of the buyOptionalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuyOptionalCount(Integer value) {
        this.buyOptionalCount = value;
    }

    /**
     * Gets the value of the getOptionalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetOptionalCount() {
        return getOptionalCount;
    }

    /**
     * Sets the value of the getOptionalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetOptionalCount(Integer value) {
        this.getOptionalCount = value;
    }

    /**
     * Gets the value of the promotionBuy property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPromotionBuy }
     *     
     */
    public ArrayOfPromotionBuy getPromotionBuy() {
        return promotionBuy;
    }

    /**
     * Sets the value of the promotionBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPromotionBuy }
     *     
     */
    public void setPromotionBuy(ArrayOfPromotionBuy value) {
        this.promotionBuy = value;
    }

    /**
     * Gets the value of the promotionGet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPromotionGet }
     *     
     */
    public ArrayOfPromotionGet getPromotionGet() {
        return promotionGet;
    }

    /**
     * Sets the value of the promotionGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPromotionGet }
     *     
     */
    public void setPromotionGet(ArrayOfPromotionGet value) {
        this.promotionGet = value;
    }

    /**
     * Gets the value of the promotionExcludedItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPromotionExcludedItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPromotionExcludedItem> getPromotionExcludedItemDetail() {
        return promotionExcludedItemDetail;
    }

    /**
     * Sets the value of the promotionExcludedItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPromotionExcludedItem }{@code >}
     *     
     */
    public void setPromotionExcludedItemDetail(JAXBElement<ArrayOfPromotionExcludedItem> value) {
        this.promotionExcludedItemDetail = value;
    }

    /**
     * Gets the value of the promotionProductDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPromotionProductDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPromotionProductDetail> getPromotionProductDetail() {
        return promotionProductDetail;
    }

    /**
     * Sets the value of the promotionProductDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPromotionProductDetail }{@code >}
     *     
     */
    public void setPromotionProductDetail(JAXBElement<ArrayOfPromotionProductDetail> value) {
        this.promotionProductDetail = value;
    }

}
