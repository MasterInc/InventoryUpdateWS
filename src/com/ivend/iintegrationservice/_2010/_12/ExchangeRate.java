
package com.ivend.iintegrationservice._2010._12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="CurrencyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExchangeRateKey" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyKey" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRate", propOrder = {
    "currencyId",
    "effectiveDate",
    "rate",
    "exchangeRateKey",
    "currencyKey"
})
public class ExchangeRate
    extends BaseWrapper
{

    @XmlElement(name = "CurrencyId", required = true, nillable = true)
    protected String currencyId;
    @XmlElement(name = "EffectiveDate", required = true, nillable = true)
    protected String effectiveDate;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "ExchangeRateKey")
    protected BigDecimal exchangeRateKey;
    @XmlElement(name = "CurrencyKey")
    protected BigDecimal currencyKey;

    /**
     * Gets the value of the currencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyId(String value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the exchangeRateKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRateKey() {
        return exchangeRateKey;
    }

    /**
     * Sets the value of the exchangeRateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRateKey(BigDecimal value) {
        this.exchangeRateKey = value;
    }

    /**
     * Gets the value of the currencyKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyKey() {
        return currencyKey;
    }

    /**
     * Sets the value of the currencyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyKey(BigDecimal value) {
        this.currencyKey = value;
    }

}
