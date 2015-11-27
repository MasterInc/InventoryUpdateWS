
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StockTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockTransfer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="FromWarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToWarehouseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RequestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StockTransferDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfStockTransferDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockTransfer", propOrder = {
    "fromWarehouseId",
    "toWarehouseId",
    "businessDate",
    "requestNumber",
    "referenceNumber1",
    "referenceNumber2",
    "comment",
    "branchCode",
    "stockTransferDetailList"
})
public class StockTransfer
    extends BaseWrapper
{

    @XmlElement(name = "FromWarehouseId", required = true, nillable = true)
    protected String fromWarehouseId;
    @XmlElement(name = "ToWarehouseId", required = true, nillable = true)
    protected String toWarehouseId;
    @XmlElement(name = "BusinessDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessDate;
    @XmlElementRef(name = "RequestNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestNumber;
    @XmlElementRef(name = "ReferenceNumber1", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNumber1;
    @XmlElementRef(name = "ReferenceNumber2", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNumber2;
    @XmlElementRef(name = "Comment", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "BranchCode", required = true, nillable = true)
    protected String branchCode;
    @XmlElement(name = "StockTransferDetailList", required = true, nillable = true)
    protected ArrayOfStockTransferDetail stockTransferDetailList;

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
     * Gets the value of the requestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestNumber() {
        return requestNumber;
    }

    /**
     * Sets the value of the requestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestNumber(JAXBElement<String> value) {
        this.requestNumber = value;
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
     * Gets the value of the stockTransferDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStockTransferDetail }
     *     
     */
    public ArrayOfStockTransferDetail getStockTransferDetailList() {
        return stockTransferDetailList;
    }

    /**
     * Sets the value of the stockTransferDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStockTransferDetail }
     *     
     */
    public void setStockTransferDetailList(ArrayOfStockTransferDetail value) {
        this.stockTransferDetailList = value;
    }

}
