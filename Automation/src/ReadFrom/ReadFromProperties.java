package ReadFrom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
	public static void main(String[]args) throws IOException
	{
		//createing object for FIS orFr
		
		FileInputStream fis=new FileInputStream("./resources/data.properties");
		//step 2:creating object for respective file type
		Properties properties=new Properties();
		
		//call the read methods
		properties.load(fis);
		System.out.println(properties.get("name"));
		
	}

}
