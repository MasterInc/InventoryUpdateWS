
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUPCTranslation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUPCTranslation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UPCTranslation" type="{http://www.iVend.com/IIntegrationService/2010/12}UPCTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUPCTranslation", propOrder = {
    "upcTranslations"
})
public class ArrayOfUPCTranslation {

    @XmlElement(name = "UPCTranslation", nillable = true)
    protected List<UPCTranslation> upcTranslations;

    /**
     * Gets the value of the upcTranslations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upcTranslations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUPCTranslations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UPCTranslation }
     * 
     * 
     */
    public List<UPCTranslation> getUPCTranslations() {
        if (upcTranslations == null) {
            upcTranslations = new ArrayList<UPCTranslation>();
        }
        return this.upcTranslations;
    }

}
