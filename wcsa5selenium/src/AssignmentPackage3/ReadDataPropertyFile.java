package AssignmentPackage3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class ReadDataPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//read the data from property file
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//create a object for properties file
		Properties prop = new Properties();
		prop.load(fis);
		
		String data = prop.getProperty("Username");
		System.out.println(data);
	
	}

}
