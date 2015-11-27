
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_subsystem.GoodReceiptSourceType;


/**
 * <p>Java class for GoodsReceiptPO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsReceiptPO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="HandheldDeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintLabels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GoodsReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoodsReceiptPODetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGoodsReceiptPODetail"/>
 *         &lt;element name="SourceType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}GoodReceiptSourceType"/>
 *         &lt;element name="DocumentUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsReceiptPO", propOrder = {
    "handheldDeviceId",
    "printLabels",
    "warehouseId",
    "receiptDate",
    "goodsReceiptNumber",
    "comment",
    "branchCode",
    "goodsReceiptPODetailList",
    "sourceType",
    "documentUserId"
})
public class GoodsReceiptPO
    extends BaseWrapper
{

    @XmlElementRef(name = "HandheldDeviceId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> handheldDeviceId;
    @XmlElement(name = "PrintLabels")
    protected Boolean printLabels;
    @XmlElement(name = "WarehouseId", required = true, nillable = true)
    protected String warehouseId;
    @XmlElement(name = "ReceiptDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    @XmlElementRef(name = "GoodsReceiptNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsReceiptNumber;
    @XmlElementRef(name = "Comment", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "BranchCode", required = true, nillable = true)
    protected String branchCode;
    @XmlElement(name = "GoodsReceiptPODetailList", required = true, nillable = true)
    protected ArrayOfGoodsReceiptPODetail goodsReceiptPODetailList;
    @XmlElement(name = "SourceType", required = true)
    protected GoodReceiptSourceType sourceType;
    @XmlElement(name = "DocumentUserId", required = true, nillable = true)
    protected String documentUserId;

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
     * Gets the value of the goodsReceiptPODetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoodsReceiptPODetail }
     *     
     */
    public ArrayOfGoodsReceiptPODetail getGoodsReceiptPODetailList() {
        return goodsReceiptPODetailList;
    }

    /**
     * Sets the value of the goodsReceiptPODetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoodsReceiptPODetail }
     *     
     */
    public void setGoodsReceiptPODetailList(ArrayOfGoodsReceiptPODetail value) {
        this.goodsReceiptPODetailList = value;
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

}
