package moon;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Mass {
	static Logger logger=Logger.getLogger(Mass.class);

	public static void main(String[] args) {
String str="welcome to sonar";
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("this is a message..ufyfk..:"+str);
		logger.warn("warning message..yiuguiyg.:"+str);
		logger.error("error messagejhhgvjh....urtfuxf..:"+str);
		

	}

}
