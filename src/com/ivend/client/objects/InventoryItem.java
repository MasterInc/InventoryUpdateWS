package com.ivend.client.objects;

public class InventoryItem {

	String UID;
	String Type;
	String message;
	boolean generateEnterpriseEvent;
	String enterpriseName;
	String userFieldList;
	String productId ;
	String inQuantity ;
	String outQuantity ;
	String warehouseCode ;
	String branchCode ;
	String transactionNumber ;
	String transactionType ;
	String baseReference ;
	String location ;
	
	Serials serialsItems;
	Batchs batchsItems;
	


	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isGenerateEnterpriseEvent() {
		return generateEnterpriseEvent;
	}

	public void setGenerateEnterpriseEvent(boolean generateEnterpriseEvent) {
		this.generateEnterpriseEvent = generateEnterpriseEvent;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getInQuantity() {
		return inQuantity;
	}

	public void setInQuantity(String inQuantity) {
		this.inQuantity = inQuantity;
	}

	public String getOutQuantity() {
		return outQuantity;
	}

	public void setOutQuantity(String outQuantity) {
		this.outQuantity = outQuantity;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getBaseReference() {
		return baseReference;
	}

	public void setBaseReference(String baseReference) {
		this.baseReference = baseReference;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Serials getSerialsItems() {
		return serialsItems;
	}

	public void setSerialsItems(Serials serialsItems) {
		this.serialsItems = serialsItems;
	}

	public Batchs getBatchsItems() {
		return batchsItems;
	}

	public void setBatchsItems(Batchs batchsItems) {
		this.batchsItems = batchsItems;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getUserFieldList() {
		return userFieldList;
	}

	public void setUserFieldList(String userFieldList) {
		this.userFieldList = userFieldList;
	}
	

}
