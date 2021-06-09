package configReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;


	public Properties initalz_Prop()  
	{
		prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream("E:\\SelenuimWorkSpace\\Cucumber_POM_1\\src\\test\\resources\\config\\config.properties");
			 prop.load(ip);
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return prop;
	}

	
	}


