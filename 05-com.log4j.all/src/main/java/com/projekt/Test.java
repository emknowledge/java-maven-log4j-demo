package com.projekt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	public static void main(String[] args) {

		Logger logger = LogManager.getLogger();

		for (int i = 0; i < 100; i++) {
			logger.info("Guten Tag" + i);

		}
	}

}
