
package com.ivend.iintegrationservice._2010._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplicationSendDump complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplicationSendDump">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iVend.com/IIntegrationService/2010/12}BaseWrapper">
 *       &lt;sequence>
 *         &lt;element name="ReplicationSendDumpKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SourceKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BatchKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Flag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromSBO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Receiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsertQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeleteQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReceivingSiteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TablePrimaryColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TableType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationSendDump", propOrder = {
    "replicationSendDumpKey",
    "sourceType",
    "sourceKey",
    "batchKey",
    "operationType",
    "flag",
    "storeId",
    "fromSBO",
    "sender",
    "receiver",
    "insertQuery",
    "updateQuery",
    "deleteQuery",
    "sequenceNo",
    "receivingSiteID",
    "tableName",
    "tablePrimaryColumn",
    "tableType"
})
public class ReplicationSendDump
    extends BaseWrapper
{

    @XmlElement(name = "ReplicationSendDumpKey")
    protected long replicationSendDumpKey;
    @XmlElement(name = "SourceType")
    protected int sourceType;
    @XmlElement(name = "SourceKey")
    protected long sourceKey;
    @XmlElement(name = "BatchKey")
    protected long batchKey;
    @XmlElement(name = "OperationType")
    protected int operationType;
    @XmlElement(name = "Flag")
    protected boolean flag;
    @XmlElementRef(name = "StoreId", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> storeId;
    @XmlElement(name = "FromSBO")
    protected Boolean fromSBO;
    @XmlElementRef(name = "Sender", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sender;
    @XmlElementRef(name = "Receiver", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiver;
    @XmlElementRef(name = "InsertQuery", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insertQuery;
    @XmlElementRef(name = "UpdateQuery", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updateQuery;
    @XmlElementRef(name = "DeleteQuery", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deleteQuery;
    @XmlElement(name = "SequenceNo")
    protected Long sequenceNo;
    @XmlElementRef(name = "ReceivingSiteID", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receivingSiteID;
    @XmlElementRef(name = "TableName", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tableName;
    @XmlElementRef(name = "TablePrimaryColumn", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tablePrimaryColumn;
    @XmlElementRef(name = "TableType", namespace = "http://www.iVend.com/IIntegrationService/2010/12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tableType;

    /**
     * Gets the value of the replicationSendDumpKey property.
     * 
     */
    public long getReplicationSendDumpKey() {
        return replicationSendDumpKey;
    }

    /**
     * Sets the value of the replicationSendDumpKey property.
     * 
     */
    public void setReplicationSendDumpKey(long value) {
        this.replicationSendDumpKey = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     */
    public int getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     */
    public void setSourceType(int value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the sourceKey property.
     * 
     */
    public long getSourceKey() {
        return sourceKey;
    }

    /**
     * Sets the value of the sourceKey property.
     * 
     */
    public void setSourceKey(long value) {
        this.sourceKey = value;
    }

    /**
     * Gets the value of the batchKey property.
     * 
     */
    public long getBatchKey() {
        return batchKey;
    }

    /**
     * Sets the value of the batchKey property.
     * 
     */
    public void setBatchKey(long value) {
        this.batchKey = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     */
    public int getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     */
    public void setOperationType(int value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     */
    public void setFlag(boolean value) {
        this.flag = value;
    }

    /**
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStoreId(JAXBElement<String> value) {
        this.storeId = value;
    }

    /**
     * Gets the value of the fromSBO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFromSBO() {
        return fromSBO;
    }

    /**
     * Sets the value of the fromSBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromSBO(Boolean value) {
        this.fromSBO = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSender(JAXBElement<String> value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiver(JAXBElement<String> value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the insertQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsertQuery() {
        return insertQuery;
    }

    /**
     * Sets the value of the insertQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsertQuery(JAXBElement<String> value) {
        this.insertQuery = value;
    }

    /**
     * Gets the value of the updateQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdateQuery() {
        return updateQuery;
    }

    /**
     * Sets the value of the updateQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdateQuery(JAXBElement<String> value) {
        this.updateQuery = value;
    }

    /**
     * Gets the value of the deleteQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeleteQuery() {
        return deleteQuery;
    }

    /**
     * Sets the value of the deleteQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeleteQuery(JAXBElement<String> value) {
        this.deleteQuery = value;
    }

    /**
     * Gets the value of the sequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNo() {
        return sequenceNo;
    }

    /**
     * Sets the value of the sequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNo(Long value) {
        this.sequenceNo = value;
    }

    /**
     * Gets the value of the receivingSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceivingSiteID() {
        return receivingSiteID;
    }

    /**
     * Sets the value of the receivingSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceivingSiteID(JAXBElement<String> value) {
        this.receivingSiteID = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTableName(JAXBElement<String> value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the tablePrimaryColumn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTablePrimaryColumn() {
        return tablePrimaryColumn;
    }

    /**
     * Sets the value of the tablePrimaryColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTablePrimaryColumn(JAXBElement<String> value) {
        this.tablePrimaryColumn = value;
    }

    /**
     * Gets the value of the tableType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTableType() {
        return tableType;
    }

    /**
     * Sets the value of the tableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTableType(JAXBElement<String> value) {
        this.tableType = value;
    }

}
