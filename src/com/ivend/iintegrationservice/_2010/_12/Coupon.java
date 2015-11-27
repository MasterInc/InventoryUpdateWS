
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
import org.datacontract.schemas._2004._07.cxs_subsystem.CouponSerialOption;


/**
 * <p>Java class for Coupon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coupon">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TriggerMultiple" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DiscountType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}DiscountType"/>
 *         &lt;element name="DiscountValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TriggerQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ApplicableQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MultiplyValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumOrderValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RedemptionNumberPerStore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RedemptionOncePerCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UPCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanIssueAtPOS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanPrintAtPOS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSerialControlled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SerialOption" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Promotion}CouponSerialOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coupon", propOrder = {
    "id",
    "description",
    "startDate",
    "endDate",
    "triggerMultiple",
    "discountType",
    "discountValue",
    "triggerQuantity",
    "applicableQuantity",
    "multiplyValue",
    "minimumOrderValue",
    "redemptionNumberPerStore",
    "redemptionOncePerCustomer",
    "upcCode",
    "canIssueAtPOS",
    "canPrintAtPOS",
    "isSerialControlled",
    "serialOption"
})
public class Coupon
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "TriggerMultiple")
    protected Boolean triggerMultiple;
    @XmlElement(name = "DiscountType", required = true)
    protected DiscountType discountType;
    @XmlElement(name = "DiscountValue", required = true)
    protected BigDecimal discountValue;
    @XmlElement(name = "TriggerQuantity")
    protected Integer triggerQuantity;
    @XmlElement(name = "ApplicableQuantity")
    protected Integer applicableQuantity;
    @XmlElement(name = "MultiplyValue")
    protected Integer multiplyValue;
    @XmlElement(name = "MinimumOrderValue")
    protected BigDecimal minimumOrderValue;
    @XmlElement(name = "RedemptionNumberPerStore")
    protected Integer redemptionNumberPerStore;
    @XmlElement(name = "RedemptionOncePerCustomer")
    protected Boolean redemptionOncePerCustomer;
    @XmlElementRef(name = "UPCCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> upcCode;
    @XmlElement(name = "CanIssueAtPOS")
    protected Boolean canIssueAtPOS;
    @XmlElement(name = "CanPrintAtPOS")
    protected Boolean canPrintAtPOS;
    @XmlElement(name = "IsSerialControlled")
    protected Boolean isSerialControlled;
    @XmlElement(name = "SerialOption")
    protected CouponSerialOption serialOption;

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
     * Gets the value of the triggerMultiple property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTriggerMultiple() {
        return triggerMultiple;
    }

    /**
     * Sets the value of the triggerMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTriggerMultiple(Boolean value) {
        this.triggerMultiple = value;
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
     * Gets the value of the discountValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountValue() {
        return discountValue;
    }

    /**
     * Sets the value of the discountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountValue(BigDecimal value) {
        this.discountValue = value;
    }

    /**
     * Gets the value of the triggerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTriggerQuantity() {
        return triggerQuantity;
    }

    /**
     * Sets the value of the triggerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTriggerQuantity(Integer value) {
        this.triggerQuantity = value;
    }

    /**
     * Gets the value of the applicableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicableQuantity() {
        return applicableQuantity;
    }

    /**
     * Sets the value of the applicableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicableQuantity(Integer value) {
        this.applicableQuantity = value;
    }

    /**
     * Gets the value of the multiplyValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultiplyValue() {
        return multiplyValue;
    }

    /**
     * Sets the value of the multiplyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultiplyValue(Integer value) {
        this.multiplyValue = value;
    }

    /**
     * Gets the value of the minimumOrderValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumOrderValue() {
        return minimumOrderValue;
    }

    /**
     * Sets the value of the minimumOrderValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumOrderValue(BigDecimal value) {
        this.minimumOrderValue = value;
    }

    /**
     * Gets the value of the redemptionNumberPerStore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRedemptionNumberPerStore() {
        return redemptionNumberPerStore;
    }

    /**
     * Sets the value of the redemptionNumberPerStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRedemptionNumberPerStore(Integer value) {
        this.redemptionNumberPerStore = value;
    }

    /**
     * Gets the value of the redemptionOncePerCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedemptionOncePerCustomer() {
        return redemptionOncePerCustomer;
    }

    /**
     * Sets the value of the redemptionOncePerCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedemptionOncePerCustomer(Boolean value) {
        this.redemptionOncePerCustomer = value;
    }

    /**
     * Gets the value of the upcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUPCCode() {
        return upcCode;
    }

    /**
     * Sets the value of the upcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUPCCode(JAXBElement<String> value) {
        this.upcCode = value;
    }

    /**
     * Gets the value of the canIssueAtPOS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanIssueAtPOS() {
        return canIssueAtPOS;
    }

    /**
     * Sets the value of the canIssueAtPOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanIssueAtPOS(Boolean value) {
        this.canIssueAtPOS = value;
    }

    /**
     * Gets the value of the canPrintAtPOS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanPrintAtPOS() {
        return canPrintAtPOS;
    }

    /**
     * Sets the value of the canPrintAtPOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanPrintAtPOS(Boolean value) {
        this.canPrintAtPOS = value;
    }

    /**
     * Gets the value of the isSerialControlled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSerialControlled() {
        return isSerialControlled;
    }

    /**
     * Sets the value of the isSerialControlled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSerialControlled(Boolean value) {
        this.isSerialControlled = value;
    }

    /**
     * Gets the value of the serialOption property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSerialOption }
     *     
     */
    public CouponSerialOption getSerialOption() {
        return serialOption;
    }

    /**
     * Sets the value of the serialOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSerialOption }
     *     
     */
    public void setSerialOption(CouponSerialOption value) {
        this.serialOption = value;
    }

}
