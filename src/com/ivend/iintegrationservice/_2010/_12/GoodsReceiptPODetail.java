
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsReceiptPODetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsReceiptPODetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityReceived" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GoodsReceiptPOSerialDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGoodsReceiptPOSerialDetail" minOccurs="0"/>
 *         &lt;element name="GoodsReceiptPOBatchDetailList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfGoodsReceiptPOBatchDetail" minOccurs="0"/>
 *         &lt;element name="UOMId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOMQuantityReceived" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "GoodsReceiptPODetail", propOrder = {
    "productId",
    "productDescription",
    "quantityReceived",
    "goodsReceiptPOSerialDetailList",
    "goodsReceiptPOBatchDetailList",
    "uomId",
    "uomQuantityReceived",
    "sourceKey",
    "sourceDetailKey"
})
public class GoodsReceiptPODetail
    extends BaseWrapper
{

    @XmlElement(name = "ProductId", required = true, nillable = true)
    protected String productId;
    @XmlElementRef(name = "ProductDescription", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productDescription;
    @XmlElement(name = "QuantityReceived", required = true)
    protected BigDecimal quantityReceived;
    @XmlElementRef(name = "GoodsReceiptPOSerialDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGoodsReceiptPOSerialDetail> goodsReceiptPOSerialDetailList;
    @XmlElementRef(name = "GoodsReceiptPOBatchDetailList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGoodsReceiptPOBatchDetail> goodsReceiptPOBatchDetailList;
    @XmlElementRef(name = "UOMId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uomId;
    @XmlElement(name = "UOMQuantityReceived", required = true)
    protected BigDecimal uomQuantityReceived;
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
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductDescription(JAXBElement<String> value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the quantityReceived property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Sets the value of the quantityReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityReceived(BigDecimal value) {
        this.quantityReceived = value;
    }

    /**
     * Gets the value of the goodsReceiptPOSerialDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPOSerialDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGoodsReceiptPOSerialDetail> getGoodsReceiptPOSerialDetailList() {
        return goodsReceiptPOSerialDetailList;
    }

    /**
     * Sets the value of the goodsReceiptPOSerialDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPOSerialDetail }{@code >}
     *     
     */
    public void setGoodsReceiptPOSerialDetailList(JAXBElement<ArrayOfGoodsReceiptPOSerialDetail> value) {
        this.goodsReceiptPOSerialDetailList = value;
    }

    /**
     * Gets the value of the goodsReceiptPOBatchDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPOBatchDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGoodsReceiptPOBatchDetail> getGoodsReceiptPOBatchDetailList() {
        return goodsReceiptPOBatchDetailList;
    }

    /**
     * Sets the value of the goodsReceiptPOBatchDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoodsReceiptPOBatchDetail }{@code >}
     *     
     */
    public void setGoodsReceiptPOBatchDetailList(JAXBElement<ArrayOfGoodsReceiptPOBatchDetail> value) {
        this.goodsReceiptPOBatchDetailList = value;
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
     * Gets the value of the uomQuantityReceived property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUOMQuantityReceived() {
        return uomQuantityReceived;
    }

    /**
     * Sets the value of the uomQuantityReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUOMQuantityReceived(BigDecimal value) {
        this.uomQuantityReceived = value;
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
