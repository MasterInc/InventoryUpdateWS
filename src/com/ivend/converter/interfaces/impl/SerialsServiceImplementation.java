package com.ivend.converter.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.ivend.client.objects.Serials;
import com.ivend.client.objects.SerialsItem;
import com.ivend.converter.interfaces.SerialsService;
import com.reacsa.constants.WsConstants;
import com.reacsa.utils.Utils;

public class SerialsServiceImplementation implements SerialsService {

	Utils util = new Utils();
	
	final static String TYPE_SER = "SER"; 
	

	public Serials getAllSerialsFromFile(String key) throws Exception {
		
	
		Serials allSerials = new Serials();
		List<SerialsItem> serialsList = new ArrayList<SerialsItem>();
		
		

		List<String> serialsLines = util.getFile(WsConstants.SERIALS_FILENAME);
		for (String serialLine : serialsLines) {

			String[] itemSerials = null;

			if (StringUtils.isNotBlank(serialLine)) {
				itemSerials = serialLine.split("\\" + util.getStringProperty(WsConstants.SEPARATOR), -1);
			}
			
			/* Si no es un item de tipo Serials, se descarta la linea */
			if (!itemSerials[WsConstants.IVU_ROWTYPE].equalsIgnoreCase(WsConstants.SERIALS_ROW)) {
				continue;
			}

			/*
			 * Si trae valor, entonces se busca un batch asociado a un
			 * material en especifico, dado por KEY
			 */
			if (StringUtils.isNotBlank(key) && !itemSerials[WsConstants.IVU_UID].equalsIgnoreCase(key)) {
				continue;
			}

			SerialsItem serialsItem = new SerialsItem();
			serialsItem.setUID(itemSerials[WsConstants.SDL_IVU_UID]);
			serialsItem.setMessage(itemSerials[WsConstants.SDL_MESSAGE]);
			
			boolean generateEnterpriseEvent =itemSerials[WsConstants.SDL_GENERATEINTEGRATIONEVENT] != null && 
											 itemSerials[WsConstants.SDL_GENERATEINTEGRATIONEVENT].equalsIgnoreCase("true")  ? true: false;
			serialsItem.setGenerateEnterpriseEvent(generateEnterpriseEvent);
			
			serialsItem.setEnterpriseName(itemSerials[WsConstants.SDL_ENTERPRISENAME]);
			serialsItem.setUserFieldList(itemSerials[WsConstants.SDL_USERFIELDSLIST]);
			serialsItem.setSerialNumber(itemSerials[WsConstants.SDL_SERIALNUMBER]);
			serialsItem.setBaseType(itemSerials[WsConstants.SDL_BASETYPE]);
			serialsItem.setBaseEntry(itemSerials[WsConstants.SDL_BASEENTRY]);
			serialsItem.setLineNumber(itemSerials[WsConstants.SDL_LINENUMBER]);
			serialsItem.setSystemSerial(itemSerials[WsConstants.SDL_SYSTEMSERIAL]);
			serialsItem.setSupplierSerialNumber(itemSerials[WsConstants.SDL_SUPPLIERSERIALNUMBER]);
			serialsItem.setIntrernalSerialNumber(itemSerials[WsConstants.SDL_INTERNALSERIALNUMBER]);
			serialsItem.setBatchId(itemSerials[WsConstants.SDL_BATCHID]);
			serialsItem.setExpiryDate(itemSerials[WsConstants.SDL_EXPIRYDATE]);
			serialsItem.setProductionDate(itemSerials[WsConstants.SDL_PRODUCTIONDATE]);
			serialsItem.setInDate(itemSerials[WsConstants.SDL_INDATE]);
			serialsItem.setPrice(itemSerials[WsConstants.SDL_PRICE]);
			
			serialsList.add(serialsItem);
		}

		allSerials.setItems(serialsList);

		return allSerials;
	}
	
	
	public Serials getAllSerialsFromFile(String[] serialRow,String rowType) throws Exception {
		
		
		Serials allSerials = new Serials();
		List<SerialsItem> serialsList = new ArrayList<SerialsItem>();
		
		String[] itemSerials = serialRow;
		rowType = itemSerials[1];
		
		
		if (itemSerials.length > 0 ) {
		
			if(rowType != null && rowType.equals(TYPE_SER)){
				
				for(int i=6;   i < itemSerials.length; i++){
					
				SerialsItem serialsItem = new SerialsItem();	
					if (itemSerials[i] != "" && !itemSerials[i].isEmpty()){
					serialsItem.setSerialNumber(itemSerials[i]);		
					serialsList.add(serialsItem);
					}
				}
			 }
		}
		

		allSerials.setItems(serialsList);

		return allSerials;
	}	
	

		@Override
		public Serials getSerialsByInventory(String key) throws Exception {
			return getAllSerialsFromFile(key);
		}
		
		@Override
		public Serials getSerialsByInventory(String[] serials, String rowType) throws Exception {
			return getAllSerialsFromFile(serials,rowType);
		}
			
		@Override
		public Serials getAllSerials() throws Exception {
			return getAllSerialsFromFile(null,null);
		}

}
