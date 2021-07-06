package com.ja.madhura.xmltojson;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Jsontoxml{
	
	 public static void main(String[] args) throws IOException 
	    {
		 
		 String jsondata=FileUtils.readFileToString(new File("target/empjson.json"),"UTF-8");
ObjectMapper objectMapper = new ObjectMapper();
			ObjectMapper xmlMapper = new XmlMapper();
			JsonNode tree = objectMapper.readTree(jsondata);
			String jsontoXml = xmlMapper.writer().withRootName("RootTagName").writeValueAsString(tree);
			System.out.println("please find below json File to xml");
			 System.out.println(jsontoXml);
	    }
}
