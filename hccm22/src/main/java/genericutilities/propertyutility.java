package genericutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyutility {
	public  String readingDataFromPropertyFile(String Key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/");
		Properties property=new Properties();
		property.load(fis);
		String value = property.getProperty(Key);
		return value;
		
	}
	}