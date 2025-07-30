package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLibrary implements FrameworkConstant {
  
	 static FileInputStream fis;
	 static FileOutputStream fos;
	 static Properties property;
	 public static String readData(String key) 
		{
			//1.Convert external file into java Readable 
			  try {
				fis=new FileInputStream(propertypath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 //2.Create an object for properties class
			 Properties property=new Properties();
			 //3.Load the Properties
			 try {
				property.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 //4.Read the Data
			 return property.getProperty(key);	 
		}
	 public static void writedata(String newkey,String newvalue)
		{
			//1.Convert external file into java Readable 
			 try {
				fis=new FileInputStream(propertypath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 //2.Create an object for properties class
			 Properties property=new Properties();
			 //3.Load the Properties
			 try {
				property.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 //4.put the new data inside properties file
			 property.put(newkey, newvalue);
			 //5.Convert the java readable into external file
			 try {
				fos=new FileOutputStream(propertypath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 //6.Store the Data
			 try {
				property.store(fos,"Updated the new key and value");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("Writedata successful");
			 	 
		}
}
