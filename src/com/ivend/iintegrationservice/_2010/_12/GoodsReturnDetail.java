
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsReturnDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsReturnDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GoodsReturnSerialDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGoodsReturnSerialDetail" minOccurs="0"/>
 *         &lt;element name="GoodsReturnBatchDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGoodsReturnBatchDetail" minOccurs="0"/>
 *         &lt;element name="UOMId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOMQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SourceKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SourceDetailKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsReturnDetail", propOrder = {
    "productId",
    "description",
    "quantity",
    "goodsReturnSerialDetailList",
    "goodsReturnBatchDetailList",
    "uomId",
    "uomQuantity",
    "sourceKey",
    "sourceDetailKey"
})
public class GoodsReturnDetail
    extends BaseWrapper
{

    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElementRef(name = "GoodsReturnSerialDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGoodsReturnSerialDetail> goodsReturnSerialDetailList;
    @XmlElementRef(name = "GoodsReturnBatchDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGoodsReturnBatchDetail> goodsReturnBatchDetailList;
    @XmlElementRef(name = "UOMId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uomId;
    @XmlElement(name = "UOMQuantity", required = true)
    protected BigDecimal uomQuantity;
    @XmlElement(name = "SourceKey")
    protected long sourceKey;
    @XmlElement(name = "SourceDetailKey")
    protected long sourceDetailKey;

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
     * Gets the value of the goodsReturnSerialDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturnSerialDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGoodsReturnSerialDetail> getGoodsReturnSerialDetailList() {
        return goodsReturnSerialDetailList;
    }

    /**
     * Sets the value of the goodsReturnSerialDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturnSerialDetail }{@code >}
     *     
     */
    public void setGoodsReturnSerialDetailList(JAXBElement<ArrayOfGoodsReturnSerialDetail> value) {
        this.goodsReturnSerialDetailList = value;
    }

    /**
     * Gets the value of the goodsReturnBatchDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturnBatchDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGoodsReturnBatchDetail> getGoodsReturnBatchDetailList() {
        return goodsReturnBatchDetailList;
    }

    /**
     * Sets the value of the goodsReturnBatchDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsReturnBatchDetail }{@code >}
     *     
     */
    public void setGoodsReturnBatchDetailList(JAXBElement<ArrayOfGoodsReturnBatchDetail> value) {
        this.goodsReturnBatchDetailList = value;
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

    /**
     * Gets the value of the sourceKey property.
     * 
     */
    public long getSourceKey() {
        return sourceKey;
    }

    /**
     * Sets the value of the sourceKey property.
     * 
     */
    public void setSourceKey(long value) {
        this.sourceKey = value;
    }

    /**
     * Gets the value of the sourceDetailKey property.
     * 
     */
    public long getSourceDetailKey() {
        return sourceDetailKey;
    }

    /**
     * Sets the value of the sourceDetailKey property.
     * 
     */
    public void setSourceDetailKey(long value) {
        this.sourceDetailKey = value;
    }

}
