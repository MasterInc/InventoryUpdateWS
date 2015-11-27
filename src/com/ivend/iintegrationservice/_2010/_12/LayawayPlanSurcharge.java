
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayawayPlanSurcharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayawayPlanSurcharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="LayawayPlanKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SurchargeKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayawayPlanSurcharge", propOrder = {
    "layawayPlanKey",
    "surchargeKey"
})
public class LayawayPlanSurcharge
    extends BaseWrapper
{

    @XmlElement(name = "LayawayPlanKey")
    protected long layawayPlanKey;
    @XmlElement(name = "SurchargeKey")
    protected Long surchargeKey;

    /**
     * Gets the value of the layawayPlanKey property.
     * 
     */
    public long getLayawayPlanKey() {
        return layawayPlanKey;
    }

    /**
     * Sets the value of the layawayPlanKey property.
     * 
     */
    public void setLayawayPlanKey(long value) {
        this.layawayPlanKey = value;
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

}
