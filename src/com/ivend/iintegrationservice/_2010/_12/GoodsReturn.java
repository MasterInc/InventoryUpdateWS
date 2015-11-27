
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_subsystem.GoodsReturnSource;


/**
 * <p>Java class for GoodsReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsReturn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoodsReturnDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGoodsReturnDetail"/>
 *         &lt;element name="SourceType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Purchasing}GoodsReturnSource"/>
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
@XmlType(name = "GoodsReturn", propOrder = {
    "warehouseId",
    "businessDate",
    "vendorId",
    "referenceNumber",
    "comment",
    "branchCode",
    "goodsReturnDetailList",
    "sourceType",
    "documentUserId"
})
public class GoodsReturn
    extends BaseWrapper
{

    @XmlElement(name = "WarehouseId", required = true, nillable = true)
    protected String warehouseId;
    @XmlElement(name = "BusinessDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessDate;
    @XmlElement(name = "VendorId", required = true, nillable = true)
    protected String vendorId;
    @XmlElementRef(name = "ReferenceNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNumber;
    @XmlElementRef(name = "Comment", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "BranchCode", required = true, nillable = true)
    protected String branchCode;
    @XmlElement(name = "GoodsReturnDetailList", required = true, nillable = true)
    protected ArrayOfGoodsReturnDetail goodsReturnDetailList;
    @XmlElement(name = "SourceType", required = true)
    protected GoodsReturnSource sourceType;
    @XmlElement(name = "DocumentUserId", required = true, nillable = true)
    protected String documentUserId;

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
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceNumber(JAXBElement<String> value) {
        this.referenceNumber = value;
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
     * Gets the value of the goodsReturnDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoodsReturnDetail }
     *     
     */
    public ArrayOfGoodsReturnDetail getGoodsReturnDetailList() {
        return goodsReturnDetailList;
    }

    /**
     * Sets the value of the goodsReturnDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoodsReturnDetail }
     *     
     */
    public void setGoodsReturnDetailList(ArrayOfGoodsReturnDetail value) {
        this.goodsReturnDetailList = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsReturnSource }
     *     
     */
    public GoodsReturnSource getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsReturnSource }
     *     
     */
    public void setSourceType(GoodsReturnSource value) {
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
