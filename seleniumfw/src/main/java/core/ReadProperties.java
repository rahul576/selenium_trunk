package core;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class ReadProperties {
	Properties prop ;
	public ReadProperties(String filepath){
		prop = new Properties();
		File file = new  File (filepath);
		FileInputStream in;
		try {
			in = new FileInputStream(file);
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getProperty(String ourKey){
		return prop.getProperty(ourKey);
	}

	public static void main (String args[]){
		ReadProperties r = new ReadProperties("config.properties");
		System.out.println(r.getProperty("Surname"));
	}
}