package com.ja.madhura.xmltojson;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.json.XML;


public class Jsontoxml{
	
	 public static void main(String[] args) throws IOException 
	    {
		 
		 String jsondata=FileUtils.readFileToString(new File("target/samplejson.json"),"UTF-8");

				JSONObject json = new JSONObject(jsondata);
				System.out.println(XML.toString(json));
	    }
}
