
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.cxs_subsystem.StockTransferRequestSourceType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TransferRequestStatus;


/**
 * <p>Java class for StockTransferRequisition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockTransferRequisition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromWarehouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}StockTransferRequestSourceType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Inventory}TransferRequestStatus" minOccurs="0"/>
 *         &lt;element name="StockTransferRequestDetails" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfStockTransferRequisitionDetail" minOccurs="0"/>
 *         &lt;element name="ToWarehouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockTransferRequisition", propOrder = {
    "businessDate",
    "comment",
    "fromWarehouseId",
    "referenceNumber1",
    "referenceNumber2",
    "requestNumber",
    "requestedDate",
    "sourceType",
    "status",
    "stockTransferRequestDetails",
    "toWarehouseId"
})
public class StockTransferRequisition
    extends BaseWrapper
{

    @XmlElement(name = "BusinessDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessDate;
    @XmlElementRef(name = "Comment", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "FromWarehouseId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromWarehouseId;
    @XmlElementRef(name = "ReferenceNumber1", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNumber1;
    @XmlElementRef(name = "ReferenceNumber2", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNumber2;
    @XmlElementRef(name = "RequestNumber", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestNumber;
    @XmlElement(name = "RequestedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedDate;
    @XmlElement(name = "SourceType")
    protected StockTransferRequestSourceType sourceType;
    @XmlElement(name = "Status")
    protected TransferRequestStatus status;
    @XmlElementRef(name = "StockTransferRequestDetails", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStockTransferRequisitionDetail> stockTransferRequestDetails;
    @XmlElementRef(name = "ToWarehouseId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toWarehouseId;

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
     * Gets the value of the fromWarehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromWarehouseId() {
        return fromWarehouseId;
    }

    /**
     * Sets the value of the fromWarehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromWarehouseId(JAXBElement<String> value) {
        this.fromWarehouseId = value;
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
     * Gets the value of the requestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets the value of the requestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDate(XMLGregorianCalendar value) {
        this.requestedDate = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link StockTransferRequestSourceType }
     *     
     */
    public StockTransferRequestSourceType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockTransferRequestSourceType }
     *     
     */
    public void setSourceType(StockTransferRequestSourceType value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TransferRequestStatus }
     *     
     */
    public TransferRequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferRequestStatus }
     *     
     */
    public void setStatus(TransferRequestStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the stockTransferRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockTransferRequisitionDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStockTransferRequisitionDetail> getStockTransferRequestDetails() {
        return stockTransferRequestDetails;
    }

    /**
     * Sets the value of the stockTransferRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockTransferRequisitionDetail }{@code >}
     *     
     */
    public void setStockTransferRequestDetails(JAXBElement<ArrayOfStockTransferRequisitionDetail> value) {
        this.stockTransferRequestDetails = value;
    }

    /**
     * Gets the value of the toWarehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToWarehouseId() {
        return toWarehouseId;
    }

    /**
     * Sets the value of the toWarehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToWarehouseId(JAXBElement<String> value) {
        this.toWarehouseId = value;
    }

}
