
package com.ivend.iintegrationservice._2010._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBarCodeMask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBarCodeMask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BarCodeMask" type="{http://www.iVend.com/IIntegrationService/2010/12}BarCodeMask" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBarCodeMask", propOrder = {
    "barCodeMasks"
})
public class ArrayOfBarCodeMask {

    @XmlElement(name = "BarCodeMask", nillable = true)
    protected List<BarCodeMask> barCodeMasks;

    /**
     * Gets the value of the barCodeMasks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barCodeMasks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarCodeMasks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BarCodeMask }
     * 
     * 
     */
    public List<BarCodeMask> getBarCodeMasks() {
        if (barCodeMasks == null) {
            barCodeMasks = new ArrayList<BarCodeMask>();
        }
        return this.barCodeMasks;
    }

}
