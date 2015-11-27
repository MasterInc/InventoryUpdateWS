
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTopNRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clientTimeOut" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTopNRecords",
    "clientTimeOut"
})
@XmlRootElement(name = "GetQueueOfEnterprise")
public class GetQueueOfEnterprise {

    protected Integer getTopNRecords;
    protected Integer clientTimeOut;

    /**
     * Gets the value of the getTopNRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetTopNRecords() {
        return getTopNRecords;
    }

    /**
     * Sets the value of the getTopNRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetTopNRecords(Integer value) {
        this.getTopNRecords = value;
    }

    /**
     * Gets the value of the clientTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientTimeOut() {
        return clientTimeOut;
    }

    /**
     * Sets the value of the clientTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientTimeOut(Integer value) {
        this.clientTimeOut = value;
    }

}
