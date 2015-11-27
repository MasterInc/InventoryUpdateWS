
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TransactionInfoGridCaptionType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TransactionInfoGridValueType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TransactionInfoQuickButtonType;


/**
 * <p>Java class for CustomTransactionInfoGridDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomTransactionInfoGridDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomTransactionInfoGridDetailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}TransactionInfoGridValueType" minOccurs="0"/>
 *         &lt;element name="ValueSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaptionType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}TransactionInfoGridCaptionType" minOccurs="0"/>
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayProductImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisplayBlankRow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QuickButtonType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.RetailConfig}TransactionInfoQuickButtonType" minOccurs="0"/>
 *         &lt;element name="QuickButtonGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuickButtonColor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentGridDetailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HeaderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomTransactionInfoGridDetail", propOrder = {
    "customTransactionInfoGridDetailId",
    "valueType",
    "valueSource",
    "captionType",
    "caption",
    "displayProductImage",
    "sequence",
    "productId",
    "quantity",
    "displayBlankRow",
    "quickButtonType",
    "quickButtonGroup",
    "quickButtonColor",
    "parentGridDetailId",
    "isEnabled",
    "headerId"
})
public class CustomTransactionInfoGridDetail {

    @XmlElementRef(name = "CustomTransactionInfoGridDetailId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customTransactionInfoGridDetailId;
    @XmlElement(name = "ValueType")
    protected TransactionInfoGridValueType valueType;
    @XmlElementRef(name = "ValueSource", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valueSource;
    @XmlElement(name = "CaptionType")
    protected TransactionInfoGridCaptionType captionType;
    @XmlElementRef(name = "Caption", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caption;
    @XmlElement(name = "DisplayProductImage")
    protected Boolean displayProductImage;
    @XmlElement(name = "Sequence")
    protected Integer sequence;
    @XmlElementRef(name = "ProductId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productId;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "DisplayBlankRow")
    protected Boolean displayBlankRow;
    @XmlElement(name = "QuickButtonType")
    protected TransactionInfoQuickButtonType quickButtonType;
    @XmlElement(name = "QuickButtonGroup")
    protected Integer quickButtonGroup;
    @XmlElement(name = "QuickButtonColor")
    protected Integer quickButtonColor;
    @XmlElementRef(name = "ParentGridDetailId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentGridDetailId;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElementRef(name = "HeaderId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> headerId;

    /**
     * Gets the value of the customTransactionInfoGridDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomTransactionInfoGridDetailId() {
        return customTransactionInfoGridDetailId;
    }

    /**
     * Sets the value of the customTransactionInfoGridDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomTransactionInfoGridDetailId(JAXBElement<String> value) {
        this.customTransactionInfoGridDetailId = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInfoGridValueType }
     *     
     */
    public TransactionInfoGridValueType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInfoGridValueType }
     *     
     */
    public void setValueType(TransactionInfoGridValueType value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the valueSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValueSource() {
        return valueSource;
    }

    /**
     * Sets the value of the valueSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValueSource(JAXBElement<String> value) {
        this.valueSource = value;
    }

    /**
     * Gets the value of the captionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInfoGridCaptionType }
     *     
     */
    public TransactionInfoGridCaptionType getCaptionType() {
        return captionType;
    }

    /**
     * Sets the value of the captionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInfoGridCaptionType }
     *     
     */
    public void setCaptionType(TransactionInfoGridCaptionType value) {
        this.captionType = value;
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
     * Gets the value of the displayProductImage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayProductImage() {
        return displayProductImage;
    }

    /**
     * Sets the value of the displayProductImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayProductImage(Boolean value) {
        this.displayProductImage = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductId(JAXBElement<String> value) {
        this.productId = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the displayBlankRow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayBlankRow() {
        return displayBlankRow;
    }

    /**
     * Sets the value of the displayBlankRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayBlankRow(Boolean value) {
        this.displayBlankRow = value;
    }

    /**
     * Gets the value of the quickButtonType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInfoQuickButtonType }
     *     
     */
    public TransactionInfoQuickButtonType getQuickButtonType() {
        return quickButtonType;
    }

    /**
     * Sets the value of the quickButtonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInfoQuickButtonType }
     *     
     */
    public void setQuickButtonType(TransactionInfoQuickButtonType value) {
        this.quickButtonType = value;
    }

    /**
     * Gets the value of the quickButtonGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuickButtonGroup() {
        return quickButtonGroup;
    }

    /**
     * Sets the value of the quickButtonGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuickButtonGroup(Integer value) {
        this.quickButtonGroup = value;
    }

    /**
     * Gets the value of the quickButtonColor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuickButtonColor() {
        return quickButtonColor;
    }

    /**
     * Sets the value of the quickButtonColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuickButtonColor(Integer value) {
        this.quickButtonColor = value;
    }

    /**
     * Gets the value of the parentGridDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentGridDetailId() {
        return parentGridDetailId;
    }

    /**
     * Sets the value of the parentGridDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentGridDetailId(JAXBElement<String> value) {
        this.parentGridDetailId = value;
    }

    /**
     * Gets the value of the isEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Gets the value of the headerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeaderId(JAXBElement<String> value) {
        this.headerId = value;
    }

}
