package com.reacsa.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.datacontract.schemas._2004._07.cxs_platform.DiscountType;
import org.datacontract.schemas._2004._07.cxs_subsystem.PaymentDetailType;
import org.datacontract.schemas._2004._07.cxs_subsystem.TenderType;

import com.ivend.iintegrationservice._2010._12.ObjectFactory;
import com.ivend.iintegrationservice._2010._12.PostTransaction;
import com.ivend.iintegrationservice._2010._12.SaveTransaction;
import com.reacsa.client.ws.Config;
import com.reacsa.constants.WsConstants;

import static com.reacsa.constants.WsConstants.*;

public class Utils {

	Config cfg = new Config();

	public Utils() {
	}

	public SimpleDateFormat formatDate(String date) {

		Calendar calendario = GregorianCalendar.getInstance();
		Date fecha = calendario.getTime();
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
		formatoDeFecha.format(fecha);

		return formatoDeFecha;
	}

	
	
	public JAXBElement<String> createJaxbElementString(String nombreNodo, String texto) {
		
		if (texto != null){
		QName fooQName = new QName(QNAME, nombreNodo);
		JAXBElement<String> jaxbElementString = new JAXBElement<String>(fooQName, String.class, texto);
		return jaxbElementString;
		}else{	
			return null;
		}
		
	}
	
	
	public JAXBElement<String> createJaxbElementArrayUserFiels(String nombreNodo, String texto) {

		QName fooQName = new QName(QNAME, nombreNodo);
		JAXBElement<String> jaxbElementString = new JAXBElement<String>(fooQName, String.class, texto);

		return jaxbElementString;
	}
	
	public JAXBElement<String> createJaxbElementArrayUserFieldList(String nombreNodo, String texto) {

		QName fooQName = new QName(QNAME, nombreNodo);
		JAXBElement<String> jaxbElementString = new JAXBElement<String>(fooQName, String.class, texto);

		return jaxbElementString;
	}

	public XMLGregorianCalendar createXmlGregorianCalendar(String fecha, String formatoFecha) {

		
			SimpleDateFormat formatter = new SimpleDateFormat(formatoFecha);
			GregorianCalendar gc = new GregorianCalendar();
	
			XMLGregorianCalendar xmlGregorianCalendarDate = null;
			try {
	
				Date date = formatter.parse(fecha);
				gc.setTime(date);
				xmlGregorianCalendarDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
	
			} catch (DatatypeConfigurationException e) {
				e.printStackTrace();
	
			} catch (ParseException e) {
	
				e.printStackTrace();
			}
			return xmlGregorianCalendarDate;
			
		}
	
	public JAXBElement<XMLGregorianCalendar> createJaxbXmlGregorianCalendar(String nombreNodo, String fecha, String formatoFecha) {
	
			if (fecha != null && fecha.length() > 0){	
				SimpleDateFormat formatter = new SimpleDateFormat(formatoFecha);
				GregorianCalendar gc = new GregorianCalendar();
		
				XMLGregorianCalendar xmlGregorianCalendarDate = null;
				JAXBElement<XMLGregorianCalendar> jaxbElementGregorianCalendar = null;
				try {
		
					Date date = formatter.parse(fecha);
					gc.setTime(date);
					xmlGregorianCalendarDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
					
					QName fooQName = new QName(QNAME, nombreNodo);
					jaxbElementGregorianCalendar = new JAXBElement<XMLGregorianCalendar>(fooQName,XMLGregorianCalendar.class, xmlGregorianCalendarDate);		
									
				} catch (DatatypeConfigurationException e) {
					e.printStackTrace();
		
				} catch (ParseException e) {
		
					e.printStackTrace();
				}
					
				return jaxbElementGregorianCalendar;
			}else{
				return null;
			}
	
	}

	public List<String> getFile(String fileName) throws Exception {

		List<String> result = new ArrayList<String>();
		final String  filePath = getStringProperty(WsConstants.FILE_PATH) + getStringProperty(fileName);
		FileReader inputFile = new FileReader(filePath);
		BufferedReader bufferReader = new BufferedReader(inputFile);
		String line;
		 while ((line = bufferReader.readLine()) != null)   {
	            result.add(line);
	    }
		 /*Close*/
		 bufferReader.close();
		 
		 return result;
		 
	}

	public String getStringProperty(String key) {
		return cfg.getStringProperty(key);

	}
	
	
	public void generateXML(ObjectFactory factory,PostTransaction pt, String xmlName ){
		
		System.out.println("Generating XML...");
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(SaveTransaction.class);
		
		
		SaveTransaction ts = factory.createSaveTransaction();
		QName fooQNameTransaction = new QName("http://www.iVend.com/IIntegrationService/2010/12", "Transaction");
		JAXBElement<PostTransaction> postTrans = new JAXBElement<PostTransaction>(fooQNameTransaction,PostTransaction.class,pt);
		ts.setTransaction(postTrans);
		
		final String fileName = getStringProperty(WsConstants.FILE_PATH_SAVE_XML) + xmlName;
		 Marshaller m = context.createMarshaller();
		 m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 m.marshal(ts, new File(fileName));
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public DiscountType createDiscountType(String discountType){
				
		
		if(!discountType.equals("") && !discountType.isEmpty()){
		
			switch (discountType.toUpperCase()){
			
			case "NONE" : return DiscountType.NONE;
			
			case "AMOUNT" : return DiscountType.AMOUNT;
			
			case "PERCENT" : return DiscountType.PERCENT;
			
			//default : return null;
			}
			
		}
		
	    return null;
		
	}
	
	
	public PaymentDetailType createPaymentDetailType(String paymentDetailType){
				
		
		if(!paymentDetailType.equals("") && !paymentDetailType.isEmpty() ){
		
			switch (paymentDetailType.toUpperCase()){
			
			case "NONE" : return PaymentDetailType.NONE;
			
			case "GIFT_CERTIFICATE" : return PaymentDetailType.GIFT_CERTIFICATE;
			
			//default : return null;
			}
			
		}
		
	    return null;
		
	}
	
	
	public TenderType createTenderType(String tenderType){
				
		
		if(tenderType != null && tenderType.length() > 0){
		
			switch (tenderType.toUpperCase()){
			
			case "CASH" : return TenderType.CASH;
			
			case "CHECK" : return TenderType.CHECK;
			
			//case "CLUB_MEMBERSHIP_PAYMENT" : return TenderType.CLUB_MEMBERSHIP_PAYMENT;
			
			//case "CLUB_MEMBERSHIP_REDEEM" : return TenderType.CLUB_MEMBERSHIP_REDEEM;
			
			case "CREDIT_CARD" : return TenderType.CREDIT_CARD;
			
			case "CUSTOM" : return TenderType.CUSTOM;
			
			case "DEBIT_CARD" : return TenderType.DEBIT_CARD;
			
			//case "EBT" : return TenderType.EBT;
			
			case "FOREIGN_CURRENCY" : return TenderType.FOREIGN_CURRENCY;
			
			case "GIFT_CERTIFICATE" : return TenderType.GIFT_CERTIFICATE;
			
			case "LOYALTY" : return TenderType.LOYALTY;
			
			case "ON_ACCOUNT" : return TenderType.ON_ACCOUNT;
			
			case "STORE_CREDIT" : return TenderType.STORE_CREDIT;
			
			//case "TRAVELLERS_CHECK" : return TenderType.TRAVELLERS_CHECK;
				
			default : return null;
			}
			
		}
		
	    return null;
		
	}
	
	
	
	public BigDecimal convertToBigDecimal(String bigDecimal){
		
		if(bigDecimal != null && bigDecimal.length() > 0){
		
			return new BigDecimal(bigDecimal);
		
		}else{	
		
			return new BigDecimal("0");
		
		}

	}
	
	
	
	public Long convertToLong(String longValue){
		
		
		if(longValue != null && longValue.length() > 0){

			Long l = Long.parseLong(longValue);
			return l;
			
		}else{	
		
			Long l = Long.parseLong("0");
			return l;
		
		}

	}	
	

	public Integer convertToInteger(String integerValue){
		
		if(!integerValue.isEmpty() && integerValue != null ){
			Integer integer = Integer.parseInt(integerValue);
			return integer;
		}else{		
			Integer integer = Integer.parseInt("0");
			return integer;
		}

	}
	
	
	 public String getDateTime() {
	        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.ms");
	        Date date = new Date();
	        System.out.println(dateFormat.format(date));
	        
	        return dateFormat.format(date);
	    }
}
