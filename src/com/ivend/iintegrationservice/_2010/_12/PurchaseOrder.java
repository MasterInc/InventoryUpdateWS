
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
import org.datacontract.schemas._2004._07.cxs_subsystem.OrderStatus;


/**
 * <p>Java class for PurchaseOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DiscountType" type="{http://schemas.datacontract.org/2004/07/CXS.Platform.DomainObjects}DiscountType" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderStatus" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Purchasing}OrderStatus"/>
 *         &lt;element name="SurchargeTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://www.iVend.com/IIntegrationService/2010/12}Vendor" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderDetails" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPurchaseOrderDetail" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderSurcharges" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPurchaseOrderSurchargeDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrder", propOrder = {
    "storeId",
    "vendorId",
    "deliveryDate",
    "discountType",
    "discount",
    "subTotal",
    "tax",
    "total",
    "purchaseOrderId",
    "orderStatus",
    "surchargeTotal",
    "taxableAmount",
    "comment",
    "vendor",
    "purchaseOrderDetails",
    "purchaseOrderSurcharges"
})
public class PurchaseOrder
    extends BaseWrapper
{

    @XmlElement(name = "StoreId", required = true, nillable = true)
    protected String storeId;
    @XmlElement(name = "VendorId", required = true, nillable = true)
    protected String vendorId;
    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "DiscountType")
    protected DiscountType discountType;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "SubTotal")
    protected BigDecimal subTotal;
    @XmlElement(name = "Tax")
    protected BigDecimal tax;
    @XmlElement(name = "Total")
    protected BigDecimal total;
    @XmlElement(name = "PurchaseOrderId", required = true, nillable = true)
    protected String purchaseOrderId;
    @XmlElement(name = "OrderStatus", required = true)
    protected OrderStatus orderStatus;
    @XmlElement(name = "SurchargeTotal")
    protected BigDecimal surchargeTotal;
    @XmlElement(name = "TaxableAmount")
    protected BigDecimal taxableAmount;
    @XmlElementRef(name = "Comment", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "Vendor", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<Vendor> vendor;
    @XmlElementRef(name = "PurchaseOrderDetails", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPurchaseOrderDetail> purchaseOrderDetails;
    @XmlElementRef(name = "PurchaseOrderSurcharges", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPurchaseOrderSurchargeDTO> purchaseOrderSurcharges;

    /**
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreId(String value) {
        this.storeId = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorId(String value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
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
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubTotal(BigDecimal value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the purchaseOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    /**
     * Sets the value of the purchaseOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderId(String value) {
        this.purchaseOrderId = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setOrderStatus(OrderStatus value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the surchargeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurchargeTotal() {
        return surchargeTotal;
    }

    /**
     * Sets the value of the surchargeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurchargeTotal(BigDecimal value) {
        this.surchargeTotal = value;
    }

    /**
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableAmount(BigDecimal value) {
        this.taxableAmount = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     
     */
    public JAXBElement<Vendor> getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     
     */
    public void setVendor(JAXBElement<Vendor> value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the purchaseOrderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPurchaseOrderDetail> getPurchaseOrderDetails() {
        return purchaseOrderDetails;
    }

    /**
     * Sets the value of the purchaseOrderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderDetail }{@code >}
     *     
     */
    public void setPurchaseOrderDetails(JAXBElement<ArrayOfPurchaseOrderDetail> value) {
        this.purchaseOrderDetails = value;
    }

    /**
     * Gets the value of the purchaseOrderSurcharges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderSurchargeDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPurchaseOrderSurchargeDTO> getPurchaseOrderSurcharges() {
        return purchaseOrderSurcharges;
    }

    /**
     * Sets the value of the purchaseOrderSurcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPurchaseOrderSurchargeDTO }{@code >}
     *     
     */
    public void setPurchaseOrderSurcharges(JAXBElement<ArrayOfPurchaseOrderSurchargeDTO> value) {
        this.purchaseOrderSurcharges = value;
    }

}
