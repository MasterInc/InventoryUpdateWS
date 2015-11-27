
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIntegrationQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIntegrationQueue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntegrationQueue" type="{http://www.iVend.com/IIntegrationService/2010/12}IntegrationQueue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIntegrationQueue", propOrder = {
    "integrationQueues"
})
public class ArrayOfIntegrationQueue {

    @XmlElement(name = "IntegrationQueue", nillable = true)
    protected List<IntegrationQueue> integrationQueues;

    /**
     * Gets the value of the integrationQueues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationQueues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationQueues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegrationQueue }
     * 
     * 
     */
    public List<IntegrationQueue> getIntegrationQueues() {
        if (integrationQueues == null) {
            integrationQueues = new ArrayList<IntegrationQueue>();
        }
        return this.integrationQueues;
    }

}
