
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTaxPeriodDefination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTaxPeriodDefination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxPeriodDefination" type="{http://www.iVend.com/IIntegrationService/2010/12}TaxPeriodDefination" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTaxPeriodDefination", propOrder = {
    "taxPeriodDefinations"
})
public class ArrayOfTaxPeriodDefination {

    @XmlElement(name = "TaxPeriodDefination", nillable = true)
    protected List<TaxPeriodDefination> taxPeriodDefinations;

    /**
     * Gets the value of the taxPeriodDefinations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxPeriodDefinations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxPeriodDefinations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxPeriodDefination }
     * 
     * 
     */
    public List<TaxPeriodDefination> getTaxPeriodDefinations() {
        if (taxPeriodDefinations == null) {
            taxPeriodDefinations = new ArrayList<TaxPeriodDefination>();
        }
        return this.taxPeriodDefinations;
    }

}
