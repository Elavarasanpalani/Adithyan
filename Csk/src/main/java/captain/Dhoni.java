package captain;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class Dhoni {
	static Logger logger=Logger.getLogger(Dhoni.class);

	public static void main(String[] args) {
String str="welcome to sonar";
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("this is a message....:"+str);
		logger.warn("warning message...:"+str);
		logger.error("error message......:"+str);

	

	}

}
