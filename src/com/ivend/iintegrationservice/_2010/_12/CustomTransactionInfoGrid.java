
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TransactionInfoGridSectionType;


/**
 * <p>Java class for CustomTransactionInfoGrid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomTransactionInfoGrid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectionType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}TransactionInfoGridSectionType" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomTransactionInfoGridDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfCustomTransactionInfoGridDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomTransactionInfoGrid", propOrder = {
    "id",
    "sectionType",
    "sequence",
    "caption",
    "description",
    "isDefault",
    "customTransactionInfoGridDetailList"
})
public class CustomTransactionInfoGrid {

    @XmlElementRef(name = "Id", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElement(name = "SectionType")
    protected TransactionInfoGridSectionType sectionType;
    @XmlElementRef(name = "Sequence", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sequence;
    @XmlElementRef(name = "Caption", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caption;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "IsDefault")
    protected Boolean isDefault;
    @XmlElementRef(name = "CustomTransactionInfoGridDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomTransactionInfoGridDetail> customTransactionInfoGridDetailList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the sectionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInfoGridSectionType }
     *     
     */
    public TransactionInfoGridSectionType getSectionType() {
        return sectionType;
    }

    /**
     * Sets the value of the sectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInfoGridSectionType }
     *     
     */
    public void setSectionType(TransactionInfoGridSectionType value) {
        this.sectionType = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSequence(JAXBElement<String> value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaption(JAXBElement<String> value) {
        this.caption = value;
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
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the customTransactionInfoGridDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomTransactionInfoGridDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomTransactionInfoGridDetail> getCustomTransactionInfoGridDetailList() {
        return customTransactionInfoGridDetailList;
    }

    /**
     * Sets the value of the customTransactionInfoGridDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomTransactionInfoGridDetail }{@code >}
     *     
     */
    public void setCustomTransactionInfoGridDetailList(JAXBElement<ArrayOfCustomTransactionInfoGridDetail> value) {
        this.customTransactionInfoGridDetailList = value;
    }

}
