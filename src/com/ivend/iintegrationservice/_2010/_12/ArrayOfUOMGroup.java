
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUOMGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUOMGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UOMGroup" type="{http://www.iVend.com/IIntegrationService/2010/12}UOMGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUOMGroup", propOrder = {
    "uomGroups"
})
public class ArrayOfUOMGroup {

    @XmlElement(name = "UOMGroup", nillable = true)
    protected List<UOMGroup> uomGroups;

    /**
     * Gets the value of the uomGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uomGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUOMGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UOMGroup }
     * 
     * 
     */
    public List<UOMGroup> getUOMGroups() {
        if (uomGroups == null) {
            uomGroups = new ArrayList<UOMGroup>();
        }
        return this.uomGroups;
    }

}
