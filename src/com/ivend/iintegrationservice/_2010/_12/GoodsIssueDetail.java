
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsIssueDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsIssueDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GoodsIssueSerialDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGoodsIssueSerialDetail" minOccurs="0"/>
 *         &lt;element name="GoodsIssueBatchDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGoodsIssueBatchDetail" minOccurs="0"/>
 *         &lt;element name="UOMId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOMQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsIssueDetail", propOrder = {
    "productId",
    "description",
    "quantity",
    "goodsIssueSerialDetailList",
    "goodsIssueBatchDetailList",
    "uomId",
    "uomQuantity"
})
public class GoodsIssueDetail
    extends BaseWrapper
{

    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElementRef(name = "GoodsIssueSerialDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGoodsIssueSerialDetail> goodsIssueSerialDetailList;
    @XmlElementRef(name = "GoodsIssueBatchDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGoodsIssueBatchDetail> goodsIssueBatchDetailList;
    @XmlElementRef(name = "UOMId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uomId;
    @XmlElement(name = "UOMQuantity")
    protected BigDecimal uomQuantity;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
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
     * Gets the value of the goodsIssueSerialDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssueSerialDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGoodsIssueSerialDetail> getGoodsIssueSerialDetailList() {
        return goodsIssueSerialDetailList;
    }

    /**
     * Sets the value of the goodsIssueSerialDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssueSerialDetail }{@code >}
     *     
     */
    public void setGoodsIssueSerialDetailList(JAXBElement<ArrayOfGoodsIssueSerialDetail> value) {
        this.goodsIssueSerialDetailList = value;
    }

    /**
     * Gets the value of the goodsIssueBatchDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssueBatchDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGoodsIssueBatchDetail> getGoodsIssueBatchDetailList() {
        return goodsIssueBatchDetailList;
    }

    /**
     * Sets the value of the goodsIssueBatchDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsIssueBatchDetail }{@code >}
     *     
     */
    public void setGoodsIssueBatchDetailList(JAXBElement<ArrayOfGoodsIssueBatchDetail> value) {
        this.goodsIssueBatchDetailList = value;
    }

    /**
     * Gets the value of the uomId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUOMId() {
        return uomId;
    }

    /**
     * Sets the value of the uomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUOMId(JAXBElement<String> value) {
        this.uomId = value;
    }

    /**
     * Gets the value of the uomQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUOMQuantity() {
        return uomQuantity;
    }

    /**
     * Sets the value of the uomQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUOMQuantity(BigDecimal value) {
        this.uomQuantity = value;
    }

}
