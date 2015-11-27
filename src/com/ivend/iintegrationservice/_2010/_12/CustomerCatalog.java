
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerCatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCatalog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VersionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerCatalogDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfCustomerCatalogDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCatalog", propOrder = {
    "customerId",
    "versionDate",
    "version",
    "customerCatalogDetail"
})
public class CustomerCatalog
    extends BaseWrapper
{

    @XmlElement(name = "CustomerId", required = true, nillable = true)
    protected String customerId;
    @XmlElement(name = "VersionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionDate;
    @XmlElement(name = "Version", required = true, nillable = true)
    protected String version;
    @XmlElement(name = "CustomerCatalogDetail", required = true, nillable = true)
    protected ArrayOfCustomerCatalogDetail customerCatalogDetail;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the versionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionDate() {
        return versionDate;
    }

    /**
     * Sets the value of the versionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionDate(XMLGregorianCalendar value) {
        this.versionDate = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the customerCatalogDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomerCatalogDetail }
     *     
     */
    public ArrayOfCustomerCatalogDetail getCustomerCatalogDetail() {
        return customerCatalogDetail;
    }

    /**
     * Sets the value of the customerCatalogDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomerCatalogDetail }
     *     
     */
    public void setCustomerCatalogDetail(ArrayOfCustomerCatalogDetail value) {
        this.customerCatalogDetail = value;
    }

}
