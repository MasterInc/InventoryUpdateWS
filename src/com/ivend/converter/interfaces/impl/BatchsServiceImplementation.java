package com.ivend.converter.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.ivend.client.objects.Batchs;
import com.ivend.client.objects.BatchsItem;
import com.ivend.converter.interfaces.BatchsService;
import com.reacsa.constants.WsConstants;
import com.reacsa.utils.Utils;

public class BatchsServiceImplementation implements BatchsService {

	Utils util = new Utils();
	final static String TYPE_LOT = "LOT"; 

	public Batchs getAllBatchsFromFile(String key) throws Exception {
		
		Batchs allBatchs = new Batchs();
		List<BatchsItem> batchsList = new ArrayList<BatchsItem>();
		
		List<String> batchsLines = util.getFile(WsConstants.BATCH_FILENAME);
		for (String batchsLine : batchsLines) {

			String[] itemBatchs = null;

			if (StringUtils.isNotBlank(batchsLine)) {
				itemBatchs = batchsLine.split("\\" + util.getStringProperty(WsConstants.SEPARATOR), -1);
			}
			
			
			/* Si no es un item de tipo Serials, se descarta la linea */
			if (!itemBatchs[WsConstants.IVU_ROWTYPE].equalsIgnoreCase(WsConstants.BATCHS_ROW)) {
				continue;
			}

			/*
			 * Si trae valor, entonces se busca un batch asociado a un
			 * material en especifico, dado por KEY
			 */
			if (StringUtils.isNotBlank(key) && !itemBatchs[WsConstants.IVU_UID].equalsIgnoreCase(key)) {
				continue;
			}
			
			

			BatchsItem batchsItem = new BatchsItem();
			batchsItem.setUID(itemBatchs[WsConstants.BDL_IVU_UID]);
			batchsItem.setMessage(itemBatchs[WsConstants.BDL_MESSAGE]);
			
			boolean generateEnterpriseEvent =itemBatchs[WsConstants.BDL_GENERATEINTEGRATIONEVENT] != null && 
											 itemBatchs[WsConstants.BDL_GENERATEINTEGRATIONEVENT].equalsIgnoreCase("true")  ? true: false;
			
			batchsItem.setGenerateEnterpriseEvent(generateEnterpriseEvent);
			
			batchsItem.setEnterpriseName(itemBatchs[WsConstants.BDL_ENTERPRISENAME]);
			batchsItem.setUserFieldList(itemBatchs[WsConstants.BDL_USERFIELDSLIST]);
			batchsItem.setBatchNumber(itemBatchs[WsConstants.BDL_BATCHNUMBER]);
			batchsItem.setQuantity(itemBatchs[WsConstants.BDL_QUANTITY]);
			batchsItem.setBaseType(itemBatchs[WsConstants.BDL_BASETYPE]);
			batchsItem.setBaseEntry(itemBatchs[WsConstants.BDL_BASEENTRY]);
			batchsItem.setLineNumber(itemBatchs[WsConstants.BDL_LINENUMBER]);
			batchsItem.setExpiryDate(itemBatchs[WsConstants.BDL_EXPIRYDATE]);
			batchsItem.setProductionDate(itemBatchs[WsConstants.BDL_PRODUCTIONDATE]);
			batchsItem.setInDate(itemBatchs[WsConstants.BDL_INDATE]);
			batchsItem.setPrice(itemBatchs[WsConstants.BDL_PRICE]);
			
			
			batchsList.add(batchsItem);
		}

		allBatchs.setItems(batchsList);

		return allBatchs;
	}
	
	
public Batchs getAllBatchsFromFile(String[] batchRow, String rowType) throws Exception {
		
		Batchs allBatchs = new Batchs();
		List<BatchsItem> batchsList = new ArrayList<BatchsItem>();
		
	
		String[] itemBatchs = batchRow;
		rowType = itemBatchs[1];
		
		
		if (itemBatchs.length > 0 ) {
		
			if(rowType != null && rowType.equals(TYPE_LOT)){
			 BatchsItem batchsItem = new BatchsItem();
			 
			 batchsItem.setQuantity(itemBatchs[3]);	
			 batchsItem.setBatchNumber(itemBatchs[5]);
			 
			 batchsList.add(batchsItem);
			}
		}	

		allBatchs.setItems(batchsList);

		return allBatchs;
	}


	@Override
	public Batchs getBatchsByInventory(String key) throws Exception {
		return getAllBatchsFromFile(key);
	}
	
	@Override
	public Batchs getBatchsByInventory(String[] batchRow, String rowType) throws Exception {
		return getAllBatchsFromFile(batchRow,rowType);
	}

	@Override
	public Batchs getAllBatchs() throws Exception {
		return getAllBatchsFromFile(null,null);
	}

}
