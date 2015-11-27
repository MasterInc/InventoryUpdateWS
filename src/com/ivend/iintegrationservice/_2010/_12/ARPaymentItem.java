
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.ARPaymentType;


/**
 * <p>Java class for ARPaymentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARPaymentItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DetailKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OriginalDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Core}ARPaymentType" minOccurs="0"/>
 *         &lt;element name="SalesPersons" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfTransactionSalesPerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARPaymentItem", propOrder = {
    "amount",
    "detailKey",
    "originalDocumentId",
    "paymentType",
    "salesPersons"
})
public class ARPaymentItem
    extends BaseWrapper
{

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "DetailKey")
    protected Long detailKey;
    @XmlElementRef(name = "OriginalDocumentId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalDocumentId;
    @XmlElement(name = "PaymentType")
    protected ARPaymentType paymentType;
    @XmlElementRef(name = "SalesPersons", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransactionSalesPerson> salesPersons;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the detailKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDetailKey() {
        return detailKey;
    }

    /**
     * Sets the value of the detailKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDetailKey(Long value) {
        this.detailKey = value;
    }

    /**
     * Gets the value of the originalDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalDocumentId() {
        return originalDocumentId;
    }

    /**
     * Sets the value of the originalDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalDocumentId(JAXBElement<String> value) {
        this.originalDocumentId = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link ARPaymentType }
     *     
     */
    public ARPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARPaymentType }
     *     
     */
    public void setPaymentType(ARPaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the salesPersons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionSalesPerson }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransactionSalesPerson> getSalesPersons() {
        return salesPersons;
    }

    /**
     * Sets the value of the salesPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransactionSalesPerson }{@code >}
     *     
     */
    public void setSalesPersons(JAXBElement<ArrayOfTransactionSalesPerson> value) {
        this.salesPersons = value;
    }

}
