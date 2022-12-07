package utilis;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class TestDataReader {
	private static Properties property;

	static {
			
			try {
				File file = new File("./src/test/resources/testData/testData.properties");

				FileInputStream input = new FileInputStream(file);
				property = new Properties();
				property.load(input);
				input.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public static String getProperty(String key) {
			return property.getProperty(key);
		}
	
	}
