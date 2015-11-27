package com.reacsa.client.ws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {

	public String getStringProperty(final String key) {


		try {

			/** Creamos un Objeto de tipo Properties */
			Properties prop = new Properties();
			FileInputStream is = null;

			is = new FileInputStream("conf.properties");

			/** Cargamos el archivo desde la ruta especificada */
			prop.load(is);

			return prop.getProperty(key);

		} catch (FileNotFoundException e) {
			System.out.println("Error, El archivo de propiedades no exite");
		} catch (IOException e) {
			System.out.println("Error, No se puede leer el archivo de propiedades");
		}

		return null;
	}

}
