
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarCodeMask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BarCodeMask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaskType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Delimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartSentinel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BarCodeMaskDetailDTOList" type="{http://www.iVend.com/IIntegrationService/2010/12}ArrayOfBarCodeMaskDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarCodeMask", propOrder = {
    "id",
    "description",
    "maskType",
    "delimiter",
    "startSentinel",
    "length",
    "barCodeMaskDetailDTOList"
})
public class BarCodeMask
    extends BaseWrapper
{

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "MaskType", required = true, nillable = true)
    protected String maskType;
    @XmlElement(name = "Delimiter", required = true, nillable = true)
    protected String delimiter;
    @XmlElement(name = "StartSentinel", required = true, nillable = true)
    protected String startSentinel;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElement(name = "BarCodeMaskDetailDTOList", required = true, nillable = true)
    protected ArrayOfBarCodeMaskDetail barCodeMaskDetailDTOList;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the maskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskType() {
        return maskType;
    }

    /**
     * Sets the value of the maskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskType(String value) {
        this.maskType = value;
    }

    /**
     * Gets the value of the delimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the startSentinel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartSentinel() {
        return startSentinel;
    }

    /**
     * Sets the value of the startSentinel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartSentinel(String value) {
        this.startSentinel = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the barCodeMaskDetailDTOList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBarCodeMaskDetail }
     *     
     */
    public ArrayOfBarCodeMaskDetail getBarCodeMaskDetailDTOList() {
        return barCodeMaskDetailDTOList;
    }

    /**
     * Sets the value of the barCodeMaskDetailDTOList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBarCodeMaskDetail }
     *     
     */
    public void setBarCodeMaskDetailDTOList(ArrayOfBarCodeMaskDetail value) {
        this.barCodeMaskDetailDTOList = value;
    }

}
