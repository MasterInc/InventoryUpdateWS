
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarCodeMaskDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BarCodeMaskDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="MaskOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarCodeMaskDetail", propOrder = {
    "maskOrder",
    "valueType",
    "length",
    "factor"
})
public class BarCodeMaskDetail
    extends BaseWrapper
{

    @XmlElement(name = "MaskOrder")
    protected Integer maskOrder;
    @XmlElement(name = "ValueType", required = true, nillable = true)
    protected String valueType;
    @XmlElement(name = "Length")
    protected Integer length;
    @XmlElement(name = "Factor")
    protected BigDecimal factor;

    /**
     * Gets the value of the maskOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaskOrder() {
        return maskOrder;
    }

    /**
     * Sets the value of the maskOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaskOrder(Integer value) {
        this.maskOrder = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueType(String value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the factor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFactor(BigDecimal value) {
        this.factor = value;
    }

}
