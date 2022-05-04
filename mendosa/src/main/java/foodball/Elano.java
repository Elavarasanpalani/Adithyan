package foodball;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Elano {
	static Logger logger=Logger.getLogger(Elano.class);

	public static void main(String[] args) {
		String str="welcome to sonar";
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("this is a message....:"+str);
		logger.warn("warning message..dfyrt.:"+str);
		logger.error("error message...fjjjjjjjjettshfgwshfgjdfjgfchjdfghjdfgjdfgjsrsrtuyrtu......:"+str);

	}

}
