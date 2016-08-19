package cn.wuyl.frame.core.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;

public class PropertiesUtil {
	
	private static Properties properties = new Properties();
	
	public static Properties getProperties() {
		return properties;
	}

	public static void setProperties(Properties properties) {
		PropertiesUtil.properties = properties;
	}

	public static void loadProperties(String name) throws IOException {
		InputStream in = ClassLoader.getSystemResourceAsStream(name);        
		properties.load(in);
	}

	public static void loadProperties(FileInputStream in) throws IOException {
		properties.load(in);
	}

	public static String getValue(String key) throws IOException{
		String value = "";
        if(properties != null && properties.containsKey(key)){
        	value = properties.getProperty(key);
        }
		return value;
	}
	
	public static String getString(String key) throws IOException{
		String value = "";
        if(properties != null && properties.containsKey(key)){
        	value = properties.getProperty(key);
        }
		return value;
	}
	
	public static BigDecimal getBigDecimal(String key) throws IOException{
		BigDecimal value = null;
        if(properties != null && properties.containsKey(key)){
        	String val = properties.getProperty(key);
        	if(val != null && !val.equals("")){
        		try{
        			value = new BigDecimal(val);
        		}catch(NumberFormatException e){
        			//e.printStackTrace();
        		}
        	}
        }
        return value;
	}
	
	public static String getValue(FileInputStream in, String key) throws IOException{
		String value = "";
        properties.load(in);
        if(properties != null && properties.containsKey(key)){
        	value = properties.getProperty(key);
        }
		return value;
	}
}
