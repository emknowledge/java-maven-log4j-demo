package com.projekt.file;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
	public static void main(String[] args) {

		Logger logger = LogManager.getLogger();
		
		logger.info("Hallo Welt");

	}

}
