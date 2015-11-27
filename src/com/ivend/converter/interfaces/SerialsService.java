package com.ivend.converter.interfaces;



import com.ivend.client.objects.Serials;

public interface SerialsService {

	Serials getAllSerials() throws Exception;

	Serials getSerialsByInventory(String key) throws Exception;
	
	Serials getSerialsByInventory(String[] serialsRow, String rowType) throws Exception;
}
 