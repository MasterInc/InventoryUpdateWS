package com.ivend.converter.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.ivend.client.objects.Batchs;
import com.ivend.client.objects.Serials;
import com.ivend.client.objects.InventoryItem;
import com.ivend.client.objects.Inventory;
import com.ivend.converter.interfaces.InventoryService;
import com.reacsa.constants.WsConstants;
import com.reacsa.utils.Utils;


public class InventoryServiceImplementation implements InventoryService {


	Utils util = new Utils();


	@Override
	public Inventory getAllInventory() throws Exception {

		Inventory allInventory = new Inventory();
		
		List<InventoryItem> inventoryList = new ArrayList<InventoryItem>();

		List<String> inventoryLines = util.getFile(WsConstants.INVENTORY_FILENAME);
		
		
		
		for (String fileLine : inventoryLines) {
		
			String[] itemInventory = null;
			
			
			if (StringUtils.isNotBlank(fileLine)) {
				itemInventory = fileLine.split("\\" + util.getStringProperty(WsConstants.SEPARATOR), -1);
			}
			
					
			/* Si no es un row de tipo transaccion (TSR), omitirlo */
	
//			if (!itemInventory[WsConstants.IVU_ROWTYPE].equalsIgnoreCase(WsConstants.INVENTORY_ROW)){
//				continue;
//			}
/*
			
			inventory.setUID(itemInventory[WsConstants.IVU_UID]);
			inventory.setMessage(itemInventory[WsConstants.IVU_MESSAGE]);
			
			boolean generateEnterpriseEvent =itemInventory[WsConstants.IVU_GENERATEINTEGRATIONEVENT] != null && 
											 itemInventory[WsConstants.IVU_GENERATEINTEGRATIONEVENT].equalsIgnoreCase("true")  ? true: false;
			
			inventory.setGenerateEnterpriseEvent(generateEnterpriseEvent);
			inventory.setEnterpriseName(itemInventory[WsConstants.IVU_ENTERPRISENAME]);
			inventory.setUserFieldList(itemInventory[WsConstants.IVU_USERFIELDSLIST]);
			inventory.setProductId(itemInventory[WsConstants.IVU_PRODUCTID]);
			inventory.setInQuantity(itemInventory[WsConstants.IVU_INQUANTITY]);
			inventory.setOutQuantity(itemInventory[WsConstants.IVU_OUTQUANTITY]);
			inventory.setWarehouseCode(itemInventory[WsConstants.IVU_WAREHOUSECODE]);
			inventory.setBranchCode(itemInventory[WsConstants.IVU_BRANCHCODE]);
			inventory.setTransactionNumber(itemInventory[WsConstants.IVU_TRANSACTIONNUMBER]);
			inventory.setTransactionType(itemInventory[WsConstants.IVU_TRANSACTIONTYPE]);
			inventory.setBaseReference(itemInventory[WsConstants.IVU_BASEREFERENCE]);
			inventory.setLocation(itemInventory[WsConstants.IVU_LOCATION]);
*/			
			
			InventoryItem inventory = new InventoryItem();
			inventory.setUID(itemInventory[WsConstants.IVU_UID]);
			inventory.setType(itemInventory[WsConstants.IVU_ROWTYPE]);
			inventory.setProductId(itemInventory[WsConstants.IVU_PRODUCTID]);
			inventory.setInQuantity(itemInventory[WsConstants.IVU_INQUANTITY]);
			inventory.setWarehouseCode(itemInventory[WsConstants.IVU_WAREHOUSECODE]);
			
			
			SerialsServiceImplementation serialsService = new SerialsServiceImplementation();
			Serials serials = serialsService.getSerialsByInventory(itemInventory,null);
			inventory.setSerialsItems(serials);
			
			BatchsServiceImplementation batchsService = new BatchsServiceImplementation();
			Batchs batchs = batchsService.getBatchsByInventory(itemInventory,null);
			inventory.setBatchsItems(batchs);
						
			inventoryList.add(inventory);
			
		}

		allInventory.setItems(inventoryList);
		return allInventory;
	}




}
