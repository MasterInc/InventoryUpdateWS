
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBarCodeMaskDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBarCodeMaskDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BarCodeMaskDetail" type="{http://www.iVend.com/IIntegrationService/2010/12}BarCodeMaskDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBarCodeMaskDetail", propOrder = {
    "barCodeMaskDetails"
})
public class ArrayOfBarCodeMaskDetail {

    @XmlElement(name = "BarCodeMaskDetail", nillable = true)
    protected List<BarCodeMaskDetail> barCodeMaskDetails;

    /**
     * Gets the value of the barCodeMaskDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barCodeMaskDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarCodeMaskDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BarCodeMaskDetail }
     * 
     * 
     */
    public List<BarCodeMaskDetail> getBarCodeMaskDetails() {
        if (barCodeMaskDetails == null) {
            barCodeMaskDetails = new ArrayList<BarCodeMaskDetail>();
        }
        return this.barCodeMaskDetails;
    }

}
