package com.projekt.logging2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging2 {
	
	private static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		
		insertPersonal("Björn");
		
		
	}
	
	public static void insertPersonal(String name) {
		
		logger.info("Verbindung wurde mit der Daten Hergestellt. ");
		logger.info("Daten wurden von " + name + " erfolgreich gespeichert. ");  //  Daten wurden von Björn erfolgreich gespeichert.
		
	}

}
