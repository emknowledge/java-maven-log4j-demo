package com.projekt.logger.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging3 {

	public void logging3Methode() {

		Logger logger = LogManager.getLogger();

		logger.fatal("Logging3 wurde erfolgreich ins Log geschrieben ");

	}

}
