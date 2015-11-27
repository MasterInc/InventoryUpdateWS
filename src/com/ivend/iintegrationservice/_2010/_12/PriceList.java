
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PriceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceMatrixList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPriceMatrix" minOccurs="0"/>
 *         &lt;element name="PriceUOMMatrixList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfPriceUOMMatrix" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceList", propOrder = {
    "id",
    "priceListName",
    "priceMatrixList",
    "priceUOMMatrixList"
})
public class PriceList
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "PriceListName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceListName;
    @XmlElementRef(name = "PriceMatrixList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPriceMatrix> priceMatrixList;
    @XmlElementRef(name = "PriceUOMMatrixList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPriceUOMMatrix> priceUOMMatrixList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the priceListName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceListName() {
        return priceListName;
    }

    /**
     * Sets the value of the priceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceListName(JAXBElement<String> value) {
        this.priceListName = value;
    }

    /**
     * Gets the value of the priceMatrixList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceMatrix }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPriceMatrix> getPriceMatrixList() {
        return priceMatrixList;
    }

    /**
     * Sets the value of the priceMatrixList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceMatrix }{@code >}
     *     
     */
    public void setPriceMatrixList(JAXBElement<ArrayOfPriceMatrix> value) {
        this.priceMatrixList = value;
    }

    /**
     * Gets the value of the priceUOMMatrixList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceUOMMatrix }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPriceUOMMatrix> getPriceUOMMatrixList() {
        return priceUOMMatrixList;
    }

    /**
     * Sets the value of the priceUOMMatrixList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceUOMMatrix }{@code >}
     *     
     */
    public void setPriceUOMMatrixList(JAXBElement<ArrayOfPriceUOMMatrix> value) {
        this.priceUOMMatrixList = value;
    }

}
