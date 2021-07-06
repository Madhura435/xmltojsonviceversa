package com.ja.madhura.xmltojson;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Xmltojson
{
    public static void main(String[] args)
    {
    	
        String data="<?xml version='1.0' encoding='UTF-8'?>"+"<ness>"+
        "<employee>"+
        "<id>1</id>"+
        "<name>Madhura</name>"+
        "<age>45</age>"+
        "<city>Banglore</city>"+
        "</employee>"+
        "<employee>"+
        "<id>2</id>"+
        "<name>priya</name>"+
        "<age>23</age>"+
        "<city>Banglore</city>"+
        "</employee>"+"<friends>"+"<name>Madhavi</name>"+"</friends>"+
        "</ness>";
        
        try
        {
        	XmlMapper x=new XmlMapper();
        	JsonNode jn=x.readTree(data.getBytes());
        	ObjectMapper om=new ObjectMapper();
        	String jdata=om.writeValueAsString(jn);
        	System.out.println("Please find below converting XML string to JSON Data");
        	System.out.println(jdata);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        String data1="";
        try
        {
        	data1=FileUtils.readFileToString(new File("target/book.xml"),"UTF-8");
        	XmlMapper x1=new XmlMapper();
        	JsonNode jn1=x1.readTree(data1.getBytes());
        	ObjectMapper om1=new ObjectMapper();
        	String jdata1=om1.writeValueAsString(jn1);
        	System.out.println("Please find below converting XML FIle to JSON Data");
        	System.out.println(jdata1);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}