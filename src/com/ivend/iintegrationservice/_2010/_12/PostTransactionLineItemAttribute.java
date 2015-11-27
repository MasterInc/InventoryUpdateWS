
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostTransactionLineItemAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostTransactionLineItemAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="AttributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemAttributeKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ItemAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostTransactionLineItemAttribute", propOrder = {
    "attributeValue",
    "itemAttributeKey",
    "itemAttributeName",
    "source",
    "sourceKey"
})
public class PostTransactionLineItemAttribute
    extends BaseWrapper
{

    @XmlElementRef(name = "AttributeValue", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeValue;
    @XmlElement(name = "ItemAttributeKey")
    protected Long itemAttributeKey;
    @XmlElementRef(name = "ItemAttributeName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemAttributeName;
    @XmlElement(name = "Source")
    protected Integer source;
    @XmlElement(name = "SourceKey")
    protected Long sourceKey;

    /**
     * Gets the value of the attributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeValue() {
        return attributeValue;
    }

    /**
     * Sets the value of the attributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeValue(JAXBElement<String> value) {
        this.attributeValue = value;
    }

    /**
     * Gets the value of the itemAttributeKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemAttributeKey() {
        return itemAttributeKey;
    }

    /**
     * Sets the value of the itemAttributeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemAttributeKey(Long value) {
        this.itemAttributeKey = value;
    }

    /**
     * Gets the value of the itemAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemAttributeName() {
        return itemAttributeName;
    }

    /**
     * Sets the value of the itemAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemAttributeName(JAXBElement<String> value) {
        this.itemAttributeName = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSource(Integer value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourceKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceKey() {
        return sourceKey;
    }

    /**
     * Sets the value of the sourceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceKey(Long value) {
        this.sourceKey = value;
    }

}
