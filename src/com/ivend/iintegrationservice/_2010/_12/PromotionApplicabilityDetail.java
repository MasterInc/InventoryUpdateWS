
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.PromotionApplicableDetailType;


/**
 * <p>Java class for PromotionApplicabilityDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionApplicabilityDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="SourceType" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Promotion}PromotionApplicableDetailType"/>
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionApplicabilityDetail", propOrder = {
    "sourceType",
    "sourceId"
})
public class PromotionApplicabilityDetail
    extends BaseWrapper
{

    @XmlElement(name = "SourceType", required = true)
    protected PromotionApplicableDetailType sourceType;
    @XmlElement(name = "SourceId", required = true, nillable = true)
    protected String sourceId;

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionApplicableDetailType }
     *     
     */
    public PromotionApplicableDetailType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionApplicableDetailType }
     *     
     */
    public void setSourceType(PromotionApplicableDetailType value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

}
