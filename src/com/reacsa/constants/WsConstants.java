package com.reacsa.constants;

public final class WsConstants {
	
	//private WsConstants(){}

	public static String QNAME ="http://www.iVend.com/IIntegrationService/2010/12";
	public static String DATE_FORMAT = "dd/MMM/yyyy";
	
    public static String CONF = "";
  
	public static String INVENTORY_ROW = "IVU";
	public static String SERIALS_ROW = "SDL";
	public static String BATCHS_ROW = "BDL";

    public static String INVENTORY_FILENAME = "inventario.file";
	public static String SERIALS_FILENAME = "seriales.file";
	public static String BATCH_FILENAME = "batchs.file";
	
	public static String FILE_PATH = "file.path.load";
	public static String SEPARATOR = "file.line.separator";
	public static String URL_WEBSERVICE = "url.webservice";
	public static String FILE_PATH_SAVE_XML = "file.path.savexml";
	
	
	public static int IVU_UID = 0;
	public static int IVU_ROWTYPE = 1;
	public static int IVU_MESSAGE = 2;
	public static int IVU_GENERATEINTEGRATIONEVENT = 3;
	public static int IVU_ENTERPRISENAME =4;
	public static int IVU_USERFIELDSLIST =5;
	public static int IVU_PRODUCTID =2;
	public static int IVU_INQUANTITY =3;
	public static int IVU_OUTQUANTITY =8;
	public static int IVU_WAREHOUSECODE =4;
	public static int IVU_BRANCHCODE =10;
	public static int IVU_TRANSACTIONNUMBER =11;
	public static int IVU_TRANSACTIONTYPE =12;
	public static int IVU_BASEREFERENCE =13;
	public static int IVU_LOCATION =14;

	
	public static int SDL_IVU_UID = 0;
    public static int SDL_ROWTYPE = 1;
    public static int SDL_MESSAGE = 2;
    public static int SDL_GENERATEINTEGRATIONEVENT = 3;
    public static int SDL_ENTERPRISENAME =4;
    public static int SDL_USERFIELDSLIST =5;
    public static int SDL_SERIALNUMBER =6;
    public static int SDL_BASETYPE =7;
    public static int SDL_BASEENTRY =8;
    public static int SDL_LINENUMBER =9;
    public static int SDL_SYSTEMSERIAL =10;
    public static int SDL_SUPPLIERSERIALNUMBER =11;
    public static int SDL_INTERNALSERIALNUMBER =12;
    public static int SDL_BATCHID =13;
    public static int SDL_EXPIRYDATE =14;
    public static int SDL_PRODUCTIONDATE =15;
    public static int SDL_INDATE =16;
    public static int SDL_PRICE =17;


    public static int BDL_IVU_UID = 0;
    public static int BDL_ROWTYPE = 1;
    public static int BDL_MESSAGE = 2;
    public static int BDL_GENERATEINTEGRATIONEVENT = 3;
    public static int BDL_ENTERPRISENAME =4;
    public static int BDL_USERFIELDSLIST =5;
    public static int BDL_BATCHNUMBER =6;
    public static int BDL_QUANTITY =7;
    public static int BDL_BASETYPE =8;
    public static int BDL_BASEENTRY =9;
    public static int BDL_LINENUMBER =10;
    public static int BDL_EXPIRYDATE =11;
    public static int BDL_PRODUCTIONDATE =12;
    public static int BDL_INDATE =13;
    public static int BDL_PRICE =14;


  
}
