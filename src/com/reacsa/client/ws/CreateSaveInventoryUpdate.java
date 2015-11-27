package com.reacsa.client.ws;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import com.ivend.client.objects.Inventory;
import com.ivend.client.objects.InventoryItem;
import com.ivend.client.objects.Serials;
import com.ivend.client.objects.SerialsItem;
import com.ivend.client.objects.Batchs;
import com.ivend.client.objects.BatchsItem;


import com.ivend.iintegrationservice._2010._12.ArrayOfInventoryUpdate;
import com.ivend.iintegrationservice._2010._12.ArrayOfInventoryUpdateBatch;
import com.ivend.iintegrationservice._2010._12.ArrayOfInventoryUpdateSerial;
import com.ivend.iintegrationservice._2010._12.IIntegrationService;
import com.ivend.iintegrationservice._2010._12.IntegrationService;
import com.ivend.iintegrationservice._2010._12.InventoryUpdate;
import com.ivend.iintegrationservice._2010._12.InventoryUpdateBatch;
import com.ivend.iintegrationservice._2010._12.SaveInventoryUpdates;
import com.ivend.iintegrationservice._2010._12.InventoryUpdateSerial;
import com.ivend.iintegrationservice._2010._12.ObjectFactory;
import com.reacsa.constants.WsConstants;
import com.reacsa.utils.Utils;

/*
import com.ivend.iintegrationservice._2010._12.ArrayOfPostTransactionItem;
import com.ivend.iintegrationservice._2010._12.ArrayOfTransactionPayment;
import com.ivend.iintegrationservice._2010._12.PostTransaction;
import com.ivend.iintegrationservice._2010._12.PostTransactionItem;
import com.ivend.iintegrationservice._2010._12.TransactionPayment;
import com.reacsa.utils.Utils;
*/


public class CreateSaveInventoryUpdate {
	
	//@WebServiceRef(wsdlLocation = "http://10.0.1.8:8642/iVendAPI/iVendAPI.svc?wsdl")
	//@WebServiceRef(wsdlLocation = "http://10.0.1.18:8642/iVendAPI/iVendAPI.svc?wsdl")
	//@WebServiceRef(wsdlLocation = "http://10.0.1.49:8642/iVendAPI/iVendAPI.svc?wsdl")
	
	
	//@WebServiceRef
	//private static IntegrationService is;
	
	//static private String fileName;
	
	static String GENERATE_XMLFILES = "generate.xml.files";
	static String WSDL_URL = "url.webservice";
	static String inventoryType;
	static String inventoryUid;
	
	public CreateSaveInventoryUpdate(){
	
	}
	
	
	public void createInventoryUpdateStructure(Inventory transCollection){
	
		Utils util = new Utils();
		Config cfg = new Config();
		
		 /*SaveInventoryUpdates*/
		SaveInventoryUpdates siuXML = new SaveInventoryUpdates();
		ArrayOfInventoryUpdate arrayOfInventoryUpdateXML = new ArrayOfInventoryUpdate();
		
		String newAdress =  cfg.getStringProperty(WSDL_URL);
		
		//ObjectFactory factory = new ObjectFactory();	
		
		 try{
			 
//			IntegrationService is = new IntegrationService();	
			IntegrationService is = new IntegrationService(new URL(newAdress),
					 										new QName("http://www.iVend.com/IIntegrationService/2010/12","IntegrationService"));	
			IIntegrationService port = is.getPort(IIntegrationService.class);
				 
			 List<InventoryItem> inventoryUpdateCollection = transCollection.getItems();
			 
					 
			 for (InventoryItem inventory : inventoryUpdateCollection) {
				 
				SaveInventoryUpdates siu = new SaveInventoryUpdates();
				ArrayOfInventoryUpdate arrayOfInventoryUpdate = new ArrayOfInventoryUpdate();
			
			   /*InventoryUpdatesList*/	
				InventoryUpdate iu = new InventoryUpdate();
				
				
				/*
				iu.setMessage(null);
				iu.setGenerateIntegrationEvent(true);
				iu.setEnterpriseName(null);
				iu.setUserFieldsList(null);
				iu.setProductId(inventory.getProductId());
				System.out.println("->" + inventory.getProductId() );
				//productId = inventory.getProductId();
				iu.setInQuantity(util.convertToBigDecimal(inventory.getInQuantity()));
				iu.setOutQuantity(util.convertToBigDecimal(inventory.getOutQuantity()));
				iu.setWarehouseCode(inventory.getWarehouseCode());
				System.out.println("Warehouse :" + inventory.getWarehouseCode() );
				iu.setBranchCode(null);
				iu.setTransactionNumber(null);
				iu.setTransactionType(null);
				iu.setBaseReference(null);
				iu.setLocation(null);
				*/
				
				
				iu.setMessage(util.createJaxbElementString("Message", ""));
				iu.setGenerateIntegrationEvent(inventory.isGenerateEnterpriseEvent());
				iu.setEnterpriseName(util.createJaxbElementString("EnterpriseName", ""));
				iu.setUserFieldsList(null);
				iu.setProductId(inventory.getProductId());
				inventoryUid = inventory.getUID();
				inventoryType = inventory.getType();
				iu.setInQuantity(util.convertToBigDecimal(inventory.getInQuantity()));
				iu.setOutQuantity(util.convertToBigDecimal(inventory.getOutQuantity()));
				iu.setWarehouseCode(inventory.getWarehouseCode());
				iu.setBranchCode("");
				iu.setTransactionNumber(util.createJaxbElementString("TransactionNumber", ""));
				iu.setTransactionType(util.createJaxbElementString("TransactionType", inventory.getTransactionType()));
				iu.setBaseReference(util.createJaxbElementString("BaseReference", inventory.getBaseReference()));
				iu.setLocation(util.createJaxbElementString("Location", ""));
				
				
				/*Inventory Serials*/
				Serials SerialsItemLists = inventory.getSerialsItems();
				ArrayOfInventoryUpdateSerial arrayOfInventoryUpdateSerial = new ArrayOfInventoryUpdateSerial();
				
				if(SerialsItemLists.getItems().size() > 0) {
					
					for (SerialsItem serialItem : SerialsItemLists.getItems()) {
					
						InventoryUpdateSerial ius = new InventoryUpdateSerial();
						
						ius.setMessage(null);
						ius.setGenerateIntegrationEvent(true);
						ius.setEnterpriseName(null);						
						ius.setUserFieldsList(null);
						ius.setSerialNumber(serialItem.getSerialNumber());
						//System.out.println("->" + serialItem.getSerialNumber());
						ius.setBaseType(null);
						ius.setBaseEntry(null);
						ius.setLineNumber(null);
						ius.setSystemSerial(null);
						ius.setSupplierSerialNumber(null);
						ius.setIntrernalSerialNumber(null);
						ius.setBatchId(null);
						ius.setExpiryDate(null);
						ius.setProductionDate(null);
						ius.setInDate(null);
						//ius.setExpiryDate(util.createJaxbXmlGregorianCalendar("ExpiryDate", serialItem.getExpiryDate(), "dd/MM/yyyy"));
						//ius.setProductionDate(util.createJaxbXmlGregorianCalendar("ProductionDate", serialItem.getProductionDate(), "dd/MM/yyyy"));
						//ius.setInDate(util.createJaxbXmlGregorianCalendar("InDate", serialItem.getInDate(), "dd/MM/yyyy"));
				
						ius.setPrice(null);
						
						arrayOfInventoryUpdateSerial.getInventoryUpdateSerials().add(ius);
				
						}
					
					
						QName fooQNameSerials = new QName("http://www.iVend.com/IIntegrationService/2010/12", "SerialDetailList");
						JAXBElement<ArrayOfInventoryUpdateSerial> serials = 
								new JAXBElement<ArrayOfInventoryUpdateSerial>(fooQNameSerials,ArrayOfInventoryUpdateSerial.class,arrayOfInventoryUpdateSerial) ;
						iu.setSerialDetailList(serials);
					}

					/*Inventory Batchs*/
					
					Batchs BatchsItemList = inventory.getBatchsItems();
					ArrayOfInventoryUpdateBatch arrayOfInventoryUpdateBatch = new ArrayOfInventoryUpdateBatch();
					
					if(BatchsItemList.getItems().size() > 0){
						
						for(BatchsItem batchItem : BatchsItemList.getItems()){
							
							InventoryUpdateBatch iub = new InventoryUpdateBatch();
							
							iub.setMessage(null);
							iub.setGenerateIntegrationEvent(true);
							iub.setEnterpriseName(null);						
							iub.setUserFieldsList(null);
							iub.setBatchNumber(batchItem.getBatchNumber());
							//System.out.println("->" + batchItem.getBatchNumber() );
							iub.setQuantity(util.convertToBigDecimal(batchItem.getQuantity()));
							iub.setBaseType(null);
							iub.setBaseEntry(null);
							iub.setLineNumber(null);
							iub.setExpiryDate(null);
							iub.setProductionDate(null);
							iub.setInDate(null);
							
//							iub.setExpiryDate(util.createJaxbXmlGregorianCalendar("ExpiryDate", batchItem.getExpiryDate(), "dd/MM/yyyy"));
//							iub.setProductionDate(util.createJaxbXmlGregorianCalendar("ProductionDate", batchItem.getProductionDate(), "dd/MM/yyyy"));
//							iub.setInDate(util.createJaxbXmlGregorianCalendar("InDate", batchItem.getInDate(), "dd/MM/yyyy"));
							iub.setPrice(null);
							
							
							arrayOfInventoryUpdateBatch.getInventoryUpdateBatches().add(iub);
							
						}
					
					QName fooQNameBatchs = new QName("http://www.iVend.com/IIntegrationService/2010/12", "BatchDetailList");
					JAXBElement<ArrayOfInventoryUpdateBatch> batchs = 
							new JAXBElement<ArrayOfInventoryUpdateBatch>(fooQNameBatchs,ArrayOfInventoryUpdateBatch.class,arrayOfInventoryUpdateBatch);
					iu.setBatchDetailList(batchs);
					}
				
				
					arrayOfInventoryUpdate.getInventoryUpdates().add(iu);
					
					/*Objeto Solo para crear XML*/
					arrayOfInventoryUpdateXML.getInventoryUpdates().add(iu);
					
					
					/*Crear Objeto final y lo envía al servicio*/
					
					QName fooQNameSI = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryUpdateList");
					JAXBElement<ArrayOfInventoryUpdate> saveInventory = new JAXBElement<ArrayOfInventoryUpdate>(fooQNameSI,ArrayOfInventoryUpdate.class,arrayOfInventoryUpdate);
					siu.setInventoryUpdateList(saveInventory);
				
	
					/*Save Inventory Update*/
					ArrayOfInventoryUpdate result = port.saveInventoryUpdates(arrayOfInventoryUpdate);
														
					for(int i=0; i < result.getInventoryUpdates().size(); i++){
					
						System.out.println("UID : " + inventoryUid +
										   " Type: " +  inventoryType + 
										   " Centro :" + result.getInventoryUpdates().get(i).getWarehouseCode() + 
								           " Product :" +result.getInventoryUpdates().get(i).getProductId() +
								           " Message: " + result.getInventoryUpdates().get(i).getMessage().getValue());
					}
					
					
			 	}
			 
			 
			 /*Crear Objeto final XML*/
				
				QName fooQNameSI = new QName("http://www.iVend.com/IIntegrationService/2010/12", "InventoryUpdateList");
				JAXBElement<ArrayOfInventoryUpdate> saveInventory = new JAXBElement<ArrayOfInventoryUpdate>(fooQNameSI,ArrayOfInventoryUpdate.class,arrayOfInventoryUpdateXML);
				siuXML.setInventoryUpdateList(saveInventory);
			 
			 /*Generate XML*/
				String generateXML = cfg.getStringProperty(GENERATE_XMLFILES);
				
				//System.out.println("Message : " + message);
				
				if(generateXML != "" && generateXML.equals("true")){
										
					System.out.println("Generando XML...");
					
					final String xmlName =  "SaveInventoryUpdate_file.xml";
					final String fileName = cfg.getStringProperty(WsConstants.FILE_PATH_SAVE_XML) + xmlName;
								
					JAXBContext context = JAXBContext.newInstance(SaveInventoryUpdates.class);
								
					 Marshaller m = context.createMarshaller();
					 m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
					 m.marshal(siuXML, new File(fileName));			
				}
				
				
			 
			 
		  }catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
	}
	
	
	
}
