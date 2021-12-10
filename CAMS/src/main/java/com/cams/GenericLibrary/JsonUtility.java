package com.cams.GenericLibrary;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class JsonUtility 
{
	/**
	 * this method reads the file from jason file
	 * @throws Throwable 
	 *  
	 */

	public String readDataFromJSON(String key) throws Throwable {
		
		//read the dat from json file
		FileReader file=new FileReader(IPathConstants.JSONFilePath);
		
		//convert json file into java object
	
		JSONParser jsonobj=new JSONParser();
		Object jobj=jsonobj.parse(file);
		
		//type cast java obj to hashmap
		HashMap map=(HashMap)jobj;
		String value=map.get(key).toString();
		
		//return the value
		return value;
	}

}
