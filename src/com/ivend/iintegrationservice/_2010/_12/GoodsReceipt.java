
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_subsystem.BusinessPartnerType;
import org.datacontract.schemas._2004._07.cxs_subsystem.GoodReceiptSourceType;


/**
 * <p>Java class for GoodsReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsReceipt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="FromWarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToWarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GoodsReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoodsReceiptDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGoodsReceiptDetail"/>
 *         &lt;element name="ReferenceNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}GoodReceiptSourceType"/>
 *         &lt;element name="InTransitWarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BusinessPartnerType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}BusinessPartnerType" minOccurs="0"/>
 *         &lt;element name="BusinessPartnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintLabels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocumentUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HandheldDeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsReceipt", propOrder = {
    "fromWarehouseId",
    "toWarehouseId",
    "receiptDate",
    "goodsReceiptNumber",
    "comment",
    "branchCode",
    "goodsReceiptDetailList",
    "referenceNumber1",
    "referenceNumber2",
    "sourceType",
    "inTransitWarehouseId",
    "businessDate",
    "businessPartnerType",
    "businessPartnerCode",
    "printLabels",
    "documentUserId",
    "handheldDeviceId"
})
public class GoodsReceipt
    extends BaseWrapper
{

    @XmlElement(name = "FromWarehouseId", required = true, nillable = true)
    protected String fromWarehouseId;
    @XmlElement(name = "ToWarehouseId", required = true, nillable = true)
    protected String toWarehouseId;
    @XmlElement(name = "ReceiptDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    @XmlElementRef(name = "GoodsReceiptNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsReceiptNumber;
    @XmlElementRef(name = "Comment", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "BranchCode", required = true, nillable = true)
    protected String branchCode;
    @XmlElement(name = "GoodsReceiptDetailList", required = true, nillable = true)
    protected ArrayOfGoodsReceiptDetail goodsReceiptDetailList;
    @XmlElementRef(name = "ReferenceNumber1", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNumber1;
    @XmlElementRef(name = "ReferenceNumber2", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNumber2;
    @XmlElement(name = "SourceType", required = true)
    protected GoodReceiptSourceType sourceType;
    @XmlElement(name = "InTransitWarehouseId", required = true, nillable = true)
    protected String inTransitWarehouseId;
    @XmlElement(name = "BusinessDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessDate;
    @XmlElement(name = "BusinessPartnerType")
    protected BusinessPartnerType businessPartnerType;
    @XmlElementRef(name = "BusinessPartnerCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessPartnerCode;
    @XmlElement(name = "PrintLabels")
    protected Boolean printLabels;
    @XmlElement(name = "DocumentUserId", required = true, nillable = true)
    protected String documentUserId;
    @XmlElementRef(name = "HandheldDeviceId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> handheldDeviceId;

    /**
     * Gets the value of the fromWarehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromWarehouseId() {
        return fromWarehouseId;
    }

    /**
     * Sets the value of the fromWarehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromWarehouseId(String value) {
        this.fromWarehouseId = value;
    }

    /**
     * Gets the value of the toWarehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToWarehouseId() {
        return toWarehouseId;
    }

    /**
     * Sets the value of the toWarehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToWarehouseId(String value) {
        this.toWarehouseId = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the goodsReceiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsReceiptNumber() {
        return goodsReceiptNumber;
    }

    /**
     * Sets the value of the goodsReceiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsReceiptNumber(JAXBElement<String> value) {
        this.goodsReceiptNumber = value;
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
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the goodsReceiptDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoodsReceiptDetail }
     *     
     */
    public ArrayOfGoodsReceiptDetail getGoodsReceiptDetailList() {
        return goodsReceiptDetailList;
    }

    /**
     * Sets the value of the goodsReceiptDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoodsReceiptDetail }
     *     
     */
    public void setGoodsReceiptDetailList(ArrayOfGoodsReceiptDetail value) {
        this.goodsReceiptDetailList = value;
    }

    /**
     * Gets the value of the referenceNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceNumber1() {
        return referenceNumber1;
    }

    /**
     * Sets the value of the referenceNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceNumber1(JAXBElement<String> value) {
        this.referenceNumber1 = value;
    }

    /**
     * Gets the value of the referenceNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceNumber2() {
        return referenceNumber2;
    }

    /**
     * Sets the value of the referenceNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceNumber2(JAXBElement<String> value) {
        this.referenceNumber2 = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link GoodReceiptSourceType }
     *     
     */
    public GoodReceiptSourceType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodReceiptSourceType }
     *     
     */
    public void setSourceType(GoodReceiptSourceType value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the inTransitWarehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTransitWarehouseId() {
        return inTransitWarehouseId;
    }

    /**
     * Sets the value of the inTransitWarehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTransitWarehouseId(String value) {
        this.inTransitWarehouseId = value;
    }

    /**
     * Gets the value of the businessDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBusinessDate() {
        return businessDate;
    }

    /**
     * Sets the value of the businessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBusinessDate(XMLGregorianCalendar value) {
        this.businessDate = value;
    }

    /**
     * Gets the value of the businessPartnerType property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerType }
     *     
     */
    public BusinessPartnerType getBusinessPartnerType() {
        return businessPartnerType;
    }

    /**
     * Sets the value of the businessPartnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerType }
     *     
     */
    public void setBusinessPartnerType(BusinessPartnerType value) {
        this.businessPartnerType = value;
    }

    /**
     * Gets the value of the businessPartnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessPartnerCode() {
        return businessPartnerCode;
    }

    /**
     * Sets the value of the businessPartnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessPartnerCode(JAXBElement<String> value) {
        this.businessPartnerCode = value;
    }

    /**
     * Gets the value of the printLabels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintLabels() {
        return printLabels;
    }

    /**
     * Sets the value of the printLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintLabels(Boolean value) {
        this.printLabels = value;
    }

    /**
     * Gets the value of the documentUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentUserId() {
        return documentUserId;
    }

    /**
     * Sets the value of the documentUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentUserId(String value) {
        this.documentUserId = value;
    }

    /**
     * Gets the value of the handheldDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHandheldDeviceId() {
        return handheldDeviceId;
    }

    /**
     * Sets the value of the handheldDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHandheldDeviceId(JAXBElement<String> value) {
        this.handheldDeviceId = value;
    }

}
