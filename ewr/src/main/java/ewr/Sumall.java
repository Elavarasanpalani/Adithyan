package ewr;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Sumall {
	static Logger logger=Logger.getLogger(Sumall.class);

	public static void main(String[] args) {
String str="welcome to sonar";
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("this isd a message....:"+str);
		logger.warn("warning message...:"+str);
		logger.error("error message...:"+str);

	}

}
