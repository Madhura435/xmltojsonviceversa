package com.ja.madhura.xmltojson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Jsontoxml{
	
	 public static void main(String[] args) throws JsonMappingException, JsonProcessingException 
	    {
		 String jsonString = "" 
			        + "{\n \"_links\": {\n" 
			        + "    \"individual\": {\n" 
			        + "      \"href\": \"/individuals/matching\",\n" 
			        + "      \"name\": \"GET\",\n" 
			        + "      \"title\": \"Individual Details\"\n" 
			        + "    },\n" 
			        + "    \"self\": {\n" 
			        + "      \"href\": \"/individuals/matching/\"\n" 
			        + "    }\n" //
			        + "  }\n" //
			        + "}";

			ObjectMapper objectMapper = new ObjectMapper();
			ObjectMapper xmlMapper = new XmlMapper();
			JsonNode tree = objectMapper.readTree(jsonString);
			String jsonAsXml = xmlMapper.writer().withRootName("RootTagName").writeValueAsString(tree);
	    System.out.println(tree);
	    }
}
