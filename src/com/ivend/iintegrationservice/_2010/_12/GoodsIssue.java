
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
import org.datacontract.schemas._2004._07.cxs_subsystem.InventoryTransactionType;


/**
 * <p>Java class for GoodsIssue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsIssue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="BusinessPartnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessPartnerType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}BusinessPartnerType" minOccurs="0"/>
 *         &lt;element name="DocumentUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}InventoryTransactionType"/>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoodsIssueDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGoodsIssueDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsIssue", propOrder = {
    "businessPartnerCode",
    "businessPartnerType",
    "documentUserId",
    "sourceType",
    "warehouseId",
    "businessDate",
    "referenceNumber",
    "comment",
    "branchCode",
    "goodsIssueDetailList"
})
public class GoodsIssue
    extends BaseWrapper
{

    @XmlElementRef(name = "BusinessPartnerCode", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessPartnerCode;
    @XmlElement(name = "BusinessPartnerType")
    protected BusinessPartnerType businessPartnerType;
    @XmlElement(name = "DocumentUserId", required = true, nillable = true)
    protected String documentUserId;
    @XmlElement(name = "SourceType", required = true)
    protected InventoryTransactionType sourceType;
    @XmlElement(name = "WarehouseId", required = true, nillable = true)
    protected String warehouseId;
    @XmlElement(name = "BusinessDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessDate;
    @XmlElementRef(name = "ReferenceNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNumber;
    @XmlElementRef(name = "Comment", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "BranchCode", required = true, nillable = true)
    protected String branchCode;
    @XmlElement(name = "GoodsIssueDetailList", required = true, nillable = true)
    protected ArrayOfGoodsIssueDetail goodsIssueDetailList;

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
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTransactionType }
     *     
     */
    public InventoryTransactionType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTransactionType }
     *     
     */
    public void setSourceType(InventoryTransactionType value) {
        this.sourceType = value;
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
     * Gets the value of the goodsIssueDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGoodsIssueDetail }
     *     
     */
    public ArrayOfGoodsIssueDetail getGoodsIssueDetailList() {
        return goodsIssueDetailList;
    }

    /**
     * Sets the value of the goodsIssueDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGoodsIssueDetail }
     *     
     */
    public void setGoodsIssueDetailList(ArrayOfGoodsIssueDetail value) {
        this.goodsIssueDetailList = value;
    }

}
