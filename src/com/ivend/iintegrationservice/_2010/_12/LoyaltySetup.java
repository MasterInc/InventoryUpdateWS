
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_subsystem.LoyaltyCardManagement;
import org.datacontract.schemas._2004._07.cxs_subsystem.LoyaltyRegistrationMethod;


/**
 * <p>Java class for LoyaltySetup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltySetup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="RegistrationMethod" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Loyalty}LoyaltyRegistrationMethod" minOccurs="0"/>
 *         &lt;element name="CardManagement" type="{http://schemas.datacontract.org/2004/07/CXS.SubSystem.Loyalty}LoyaltyCardManagement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltySetup", propOrder = {
    "registrationMethod",
    "cardManagement"
})
public class LoyaltySetup
    extends BaseWrapper
{

    @XmlElement(name = "RegistrationMethod")
    protected LoyaltyRegistrationMethod registrationMethod;
    @XmlElement(name = "CardManagement")
    protected LoyaltyCardManagement cardManagement;

    /**
     * Gets the value of the registrationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRegistrationMethod }
     *     
     */
    public LoyaltyRegistrationMethod getRegistrationMethod() {
        return registrationMethod;
    }

    /**
     * Sets the value of the registrationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRegistrationMethod }
     *     
     */
    public void setRegistrationMethod(LoyaltyRegistrationMethod value) {
        this.registrationMethod = value;
    }

    /**
     * Gets the value of the cardManagement property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyCardManagement }
     *     
     */
    public LoyaltyCardManagement getCardManagement() {
        return cardManagement;
    }

    /**
     * Sets the value of the cardManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyCardManagement }
     *     
     */
    public void setCardManagement(LoyaltyCardManagement value) {
        this.cardManagement = value;
    }

}
