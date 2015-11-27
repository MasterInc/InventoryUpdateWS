
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityRights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityRights">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SecurityFunctionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SecurityFunctionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SecurityRoleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityRights", propOrder = {
    "key",
    "securityFunctionKey",
    "securityFunctionId",
    "description",
    "accessLevel",
    "securityRoleId"
})
public class SecurityRights
    extends BaseWrapper
{

    @XmlElement(name = "Key")
    protected long key;
    @XmlElement(name = "SecurityFunctionKey")
    protected long securityFunctionKey;
    @XmlElement(name = "SecurityFunctionId", required = true, nillable = true)
    protected String securityFunctionId;
    @XmlElementRef(name = "Description", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "AccessLevel")
    protected int accessLevel;
    @XmlElement(name = "SecurityRoleId", required = true, nillable = true)
    protected String securityRoleId;

    /**
     * Gets the value of the key property.
     * 
     */
    public long getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     */
    public void setKey(long value) {
        this.key = value;
    }

    /**
     * Gets the value of the securityFunctionKey property.
     * 
     */
    public long getSecurityFunctionKey() {
        return securityFunctionKey;
    }

    /**
     * Sets the value of the securityFunctionKey property.
     * 
     */
    public void setSecurityFunctionKey(long value) {
        this.securityFunctionKey = value;
    }

    /**
     * Gets the value of the securityFunctionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityFunctionId() {
        return securityFunctionId;
    }

    /**
     * Sets the value of the securityFunctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityFunctionId(String value) {
        this.securityFunctionId = value;
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
     * Gets the value of the accessLevel property.
     * 
     */
    public int getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     */
    public void setAccessLevel(int value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the securityRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityRoleId() {
        return securityRoleId;
    }

    /**
     * Sets the value of the securityRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityRoleId(String value) {
        this.securityRoleId = value;
    }

}
