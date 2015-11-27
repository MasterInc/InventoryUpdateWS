
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FulfillmentPlanSurcharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FulfillmentPlanSurcharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="FulfillmentPlanKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SurchargeKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PayInAdvance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfillmentPlanSurcharge", propOrder = {
    "fulfillmentPlanKey",
    "surchargeKey",
    "payInAdvance"
})
public class FulfillmentPlanSurcharge
    extends BaseWrapper
{

    @XmlElement(name = "FulfillmentPlanKey")
    protected long fulfillmentPlanKey;
    @XmlElement(name = "SurchargeKey")
    protected Long surchargeKey;
    @XmlElement(name = "PayInAdvance")
    protected Boolean payInAdvance;

    /**
     * Gets the value of the fulfillmentPlanKey property.
     * 
     */
    public long getFulfillmentPlanKey() {
        return fulfillmentPlanKey;
    }

    /**
     * Sets the value of the fulfillmentPlanKey property.
     * 
     */
    public void setFulfillmentPlanKey(long value) {
        this.fulfillmentPlanKey = value;
    }

    /**
     * Gets the value of the surchargeKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSurchargeKey() {
        return surchargeKey;
    }

    /**
     * Sets the value of the surchargeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSurchargeKey(Long value) {
        this.surchargeKey = value;
    }

    /**
     * Gets the value of the payInAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayInAdvance() {
        return payInAdvance;
    }

    /**
     * Sets the value of the payInAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayInAdvance(Boolean value) {
        this.payInAdvance = value;
    }

}
