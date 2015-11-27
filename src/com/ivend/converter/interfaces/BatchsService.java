package com.ivend.converter.interfaces;


import com.ivend.client.objects.Batchs;

public interface BatchsService {

	Batchs getAllBatchs() throws Exception;

	Batchs getBatchsByInventory(String key) throws Exception;
	
	Batchs getBatchsByInventory(String[] batchRow, String rowType) throws Exception;
}
