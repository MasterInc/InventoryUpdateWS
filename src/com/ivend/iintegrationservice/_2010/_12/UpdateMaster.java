
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cxs_retail.ObjectType;


/**
 * <p>Java class for UpdateMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMaster">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="MasterObjectType" type="{http://schemas.datacontract.org/2004/07/CXS.Retail.DTO}ObjectType"/>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PropertyList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfObjectProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMaster", propOrder = {
    "masterObjectType",
    "objectId",
    "propertyList"
})
public class UpdateMaster
    extends BaseWrapper
{

    @XmlElement(name = "MasterObjectType", required = true)
    protected ObjectType masterObjectType;
    @XmlElement(name = "ObjectId", required = true, nillable = true)
    protected String objectId;
    @XmlElementRef(name = "PropertyList", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfObjectProperty> propertyList;

    /**
     * Gets the value of the masterObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectType }
     *     
     */
    public ObjectType getMasterObjectType() {
        return masterObjectType;
    }

    /**
     * Sets the value of the masterObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectType }
     *     
     */
    public void setMasterObjectType(ObjectType value) {
        this.masterObjectType = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the propertyList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfObjectProperty }{@code >}
     *     
     */
    public JAXBElement<ArrayOfObjectProperty> getPropertyList() {
        return propertyList;
    }

    /**
     * Sets the value of the propertyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfObjectProperty }{@code >}
     *     
     */
    public void setPropertyList(JAXBElement<ArrayOfObjectProperty> value) {
        this.propertyList = value;
    }

}
