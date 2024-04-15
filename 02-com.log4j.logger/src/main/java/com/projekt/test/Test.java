package com.projekt.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.projekt.Logging1;
import com.projekt.logger.Logging2;
import com.projekt.logger.util.Logging3;

public class Test {
	
	/* Das Deklarieren eines Loggers als final ist eine gute Praxis, aber es ist nicht unbedingt notwendig. 
	 * Die Verwendung von final für den Logger in Ihrer Klasse hat einige Vorteile:
	 * 
	 * Sicherheit gegenüber versehentlichen Neuzuweisungen: Wenn ein Logger als final deklariert ist, 
	 * kann er nach seiner Initialisierung nicht mehr neu zugewiesen werden. Dies hilft, sicherzustellen, 
	 * dass Sie nicht versehentlich den Logger auf eine andere Instanz ändern, was zu unerwartetem Verhalten in Ihrer Anwendung führen könnte.

	   Verbesserte Lesbarkeit: Das Hinzufügen des final-Schlüsselworts zeigt anderen Entwicklern und Lesern des Codes, 
	   dass dieser Logger nicht beabsichtigt ist, neu zugewiesen zu werden. Dies kann die Lesbarkeit des Codes verbessern, 
	   indem es die Absicht klarer macht.

       Performance-Optimierung: In einigen Fällen könnte die JVM bei einem als final deklarierten Logger eine zusätzliche 
       Performance-Optimierung vornehmen, da sie weiß, dass der Logger nicht neu zugewiesen wird.*/
	
    private static final Logger logger = LogManager.getLogger("com.projekt.test");
	
	public static void main(String[] args) {
		
		Logging1 logging1 = new Logging1();
		
		Logging2 logging2 = new Logging2();
		
		Logging3 logging3 = new Logging3();
		
		
		
		// Die logger müssen noch in dir xml eingetragen werden
		logging1.logging1Methode();
		logging2.logging2Methode();
		logging3.logging3Methode();
		
		logger.info("Test wurde erfolgreich ins Log geschrieben");
		
		// Test test = new Test();
		// test.loggingMethode();
		
	}

	/*
	 * public void loggingMethode() {
	 * 
	 * logger.info("Der Test wurde erfolgreich ins Log geschrieben"); }
	 */

}
