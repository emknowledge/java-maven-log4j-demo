package com.projekt.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {

	public static void main(String[] args) {
		
		// Der LogManager ist ein Singleton, das verwendet wird, um Logger zu erhalten. 
		// Sie können den LogManager verwenden, um einen Logger für Ihre Anwendung oder für einen bestimmten Bereich Ihrer Anwendung zu erhalten.
		// LogManager = private konstruktor daher können wir indem wir getLogger()-Methode des LogManagers aufrufen. 
		// Der getLogger()-Methode nimmt den Namen der Klasse an, für die wir einen Logger erstellen möchten
		Logger logger = LogManager.getLogger();
		
		// Log-Level ist in der xml festzulegen
		logger.trace("Trace Log ");
		logger.debug("Debug Log ");
		logger.info("Erster Log ");
		logger.warn("Warn Log ");
		logger.error("Error Log ");
		logger.fatal("Fatal Log ");
	}
	

	

}
