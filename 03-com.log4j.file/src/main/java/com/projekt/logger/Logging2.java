package com.projekt.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging2 {

	public void logging2Methode() {

		Logger logger = LogManager.getLogger();

		logger.warn("Logging2 wurde erfolgreich ins Log geschrieben ");

	}

}
