
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAttributeMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAttributeMaster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeMaster" type="{http://www.iVend.com/IIntegrationService/2010/12}AttributeMaster" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAttributeMaster", propOrder = {
    "attributeMasters"
})
public class ArrayOfAttributeMaster {

    @XmlElement(name = "AttributeMaster", nillable = true)
    protected List<AttributeMaster> attributeMasters;

    /**
     * Gets the value of the attributeMasters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeMasters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeMasters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeMaster }
     * 
     * 
     */
    public List<AttributeMaster> getAttributeMasters() {
        if (attributeMasters == null) {
            attributeMasters = new ArrayList<AttributeMaster>();
        }
        return this.attributeMasters;
    }

}
