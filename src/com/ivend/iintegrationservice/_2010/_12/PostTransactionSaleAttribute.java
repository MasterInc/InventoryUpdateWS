
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostTransactionSaleAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostTransactionSaleAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="AttributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaleAttributeKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaleAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostTransactionSaleAttribute", propOrder = {
    "attributeValue",
    "saleAttributeKey",
    "saleAttributeName"
})
public class PostTransactionSaleAttribute
    extends BaseWrapper
{

    @XmlElementRef(name = "AttributeValue", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeValue;
    @XmlElement(name = "SaleAttributeKey")
    protected Long saleAttributeKey;
    @XmlElementRef(name = "SaleAttributeName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saleAttributeName;

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
     * Gets the value of the saleAttributeKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleAttributeKey() {
        return saleAttributeKey;
    }

    /**
     * Sets the value of the saleAttributeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleAttributeKey(Long value) {
        this.saleAttributeKey = value;
    }

    /**
     * Gets the value of the saleAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaleAttributeName() {
        return saleAttributeName;
    }

    /**
     * Sets the value of the saleAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaleAttributeName(JAXBElement<String> value) {
        this.saleAttributeName = value;
    }

}
