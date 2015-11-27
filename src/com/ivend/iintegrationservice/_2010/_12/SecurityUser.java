
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="CanChangePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ElectronicId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HasPasswordExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPasswordHashed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LaborUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "SecurityUser", propOrder = {
    "canChangePassword",
    "electronicId",
    "hasPasswordExpired",
    "id",
    "isActive",
    "isLocked",
    "isPasswordHashed",
    "laborUserId",
    "password",
    "securityRoleId"
})
public class SecurityUser
    extends BaseWrapper
{

    @XmlElement(name = "CanChangePassword")
    protected Boolean canChangePassword;
    @XmlElement(name = "ElectronicId", required = true, nillable = true)
    protected String electronicId;
    @XmlElement(name = "HasPasswordExpired")
    protected Boolean hasPasswordExpired;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IsLocked")
    protected Boolean isLocked;
    @XmlElement(name = "IsPasswordHashed")
    protected Boolean isPasswordHashed;
    @XmlElement(name = "LaborUserId", required = true, nillable = true)
    protected String laborUserId;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "SecurityRoleId", required = true, nillable = true)
    protected String securityRoleId;

    /**
     * Gets the value of the canChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanChangePassword() {
        return canChangePassword;
    }

    /**
     * Sets the value of the canChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanChangePassword(Boolean value) {
        this.canChangePassword = value;
    }

    /**
     * Gets the value of the electronicId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicId() {
        return electronicId;
    }

    /**
     * Sets the value of the electronicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicId(String value) {
        this.electronicId = value;
    }

    /**
     * Gets the value of the hasPasswordExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPasswordExpired() {
        return hasPasswordExpired;
    }

    /**
     * Sets the value of the hasPasswordExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPasswordExpired(Boolean value) {
        this.hasPasswordExpired = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }

    /**
     * Gets the value of the isPasswordHashed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPasswordHashed() {
        return isPasswordHashed;
    }

    /**
     * Sets the value of the isPasswordHashed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPasswordHashed(Boolean value) {
        this.isPasswordHashed = value;
    }

    /**
     * Gets the value of the laborUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaborUserId() {
        return laborUserId;
    }

    /**
     * Sets the value of the laborUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaborUserId(String value) {
        this.laborUserId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
