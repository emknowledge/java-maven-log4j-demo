package com.projekt.file;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.projekt.logger.Logging2;
import com.projekt.logger.util.Logging3;

public class Logging {
	
	public static void main(String[] args) {
		
		Logger logger = LogManager.getLogger();
		logger.info("Hallo Welt");
		
	    Logging2 logging2 = new Logging2();
	    logging2.logging2Methode();
	    
	    Logging3 logging3 = new Logging3();
	    logging3.logging3Methode(); 
		
	}

}
