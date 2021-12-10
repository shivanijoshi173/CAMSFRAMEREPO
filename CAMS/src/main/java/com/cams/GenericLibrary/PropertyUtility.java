package com.cams.GenericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility 
{
	/**
	 * this  method reads data from propertyfile
	 * @return 
	 * @throws Throwable 
	 */
    public String getPropertyFileData(String key) throws Throwable {
    	FileInputStream fis=new FileInputStream(IPathConstants.ProprtyFilePath);
    	Properties p=new Properties();
    	p.load(fis);
    	String value=p.getProperty(key);
    	return value;
    }

}
