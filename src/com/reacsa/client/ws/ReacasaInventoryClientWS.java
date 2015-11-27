package com.reacsa.client.ws;

import javax.xml.ws.WebServiceRef;

import com.ivend.client.objects.Inventory;
import com.ivend.converter.interfaces.impl.InventoryServiceImplementation;
import com.ivend.iintegrationservice._2010._12.IntegrationService;

public class ReacasaInventoryClientWS {
	
	Config cfg = new Config();
	final static String INVENTORY_FILENAME = "inventario.file";
	InventoryServiceImplementation service = new InventoryServiceImplementation();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ReacasaInventoryClientWS riws = new ReacasaInventoryClientWS();
		riws.execute();

	}

	public void execute() {

		/* Ejemplo Transacciones */
		final String filename = cfg.getStringProperty(INVENTORY_FILENAME);
		System.out.println("Leyendo Propiedad {" + INVENTORY_FILENAME + "} = " + filename);
		System.out.println("Realizando Parsing de archivo " + filename);

		Inventory inventory = null;
		try {
			inventory = service.getAllInventory();
		} catch (Exception e) {
			System.err.println("Error haciendo parsing de las transacciones, favor de revisar el archivo." + filename+ " " + e);
			return;
	    }
		CreateSaveInventoryUpdate siu = new CreateSaveInventoryUpdate();
		siu.createInventoryUpdateStructure(inventory);
		
		System.out.println("Obj Transactions cuenta con " + inventory.getItems().size() + " Transaction Items");

	}

}
