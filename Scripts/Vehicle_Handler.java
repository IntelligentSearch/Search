//package com.rest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class Vehicle_handler extends DefaultHandler {
	//flags if selected
	boolean vehicle = false;
	boolean key = false;
	boolean name = false;
	boolean gps = false;
	boolean date = false;
	boolean lat = false;
	boolean spd = false;
	boolean dir = false;
	boolean glong = false;
	boolean rsa = false;
	boolean status = false;
	boolean delta = false;
	boolean routeStatus = false;
	boolean work = false;
	boolean route = false;
	boolean trip = false;
	boolean pattern = false;
	public class Vehicle{
		String name = null;
		String gps_date = null;
		String gps_lat = null;
		String gps_long = null;
		String gps_speed = null;
		String gps_dir = null;
		String rsa_status = null;
		String rsa_delta = null;
		String rsa_routestatus = null;
		String work_route_key = null;
		String work_route_name = null;
		String work_trip_key = null;
		String work_trip_name = null;
		String work_pattern_key = null;
		String work_pattern_name = null;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGps_date() {
			return gps_date;
		}
		public void setGps_date(String gps_date) {
			this.gps_date = gps_date;
		}
		public String getGps_lat() {
			return gps_lat;
		}
		public void setGps_lat(String gps_lat) {
			this.gps_lat = gps_lat;
		}
		public String getGps_long() {
			return gps_long;
		}
		public void setGps_long(String gps_long) {
			this.gps_long = gps_long;
		}
		public String getGps_Speed(){
			return this.gps_speed;
		}
		public void setGps_Speed(String gps_speed){
			this.gps_speed = gps_speed;
		}
		public String getGps_Dir(){
			return this.gps_dir;
		}
		public void setGps_Dir(String gps_dir){
			this.gps_dir = gps_dir;
		}
		public String getRsa_status() {
			return rsa_status;
		}
		public void setRsa_status(String rsa_status) {
			this.rsa_status = rsa_status;
		}
		public String getRsa_delta() {
			return rsa_delta;
		}
		public void setRsa_delta(String rsa_delta) {
			this.rsa_delta = rsa_delta;
		}
		public String getRsa_routestatus() {
			return rsa_routestatus;
		}
		public void setRsa_routestatus(String rsa_routestatus) {
			this.rsa_routestatus = rsa_routestatus;
		}
		public String getWork_route_key() {
			return work_route_key;
		}
		public void setWork_route_key(String work_route_key) {
			this.work_route_key = work_route_key;
		}
		public String getWork_route_name() {
			return work_route_name;
		}
		public void setWork_route_name(String work_route_name) {
			this.work_route_name = work_route_name;
		}
		public String getWork_trip_key() {
			return work_trip_key;
		}
		public void setWork_trip_key(String work_trip_key) {
			this.work_trip_key = work_trip_key;
		}
		public String getWork_trip_name() {
			return work_trip_name;
		}
		public void setWork_trip_name(String work_trip_name) {
			this.work_trip_name = work_trip_name;
		}
		public String getWork_pattern_key() {
			return work_pattern_key;
		}
		public void setWork_pattern_key(String work_pattern_key) {
			this.work_pattern_key = work_pattern_key;
		}
		public String getWork_pattern_name() {
			return work_pattern_name;
		}
		public void setWork_pattern_name(String work_pattern_name) {
			this.work_pattern_name = work_pattern_name;
		}
		//TODO change to query
		@Override
		public String toString(){
			return name+","+gps_date+","+gps_lat+","+gps_long+","+gps_speed+","+gps_dir+","+rsa_status+","+rsa_delta
					+","+rsa_routestatus+","+work_route_key+","+work_route_name+","+work_trip_key+","
					+ work_trip_name+","+work_pattern_key+","+work_pattern_name;
		}
	}
	Vehicle v;
	public Vehicle_handler(){
		super();
		this.v = new Vehicle();
	}

    public void startDocument (){
    	System.out.println("Start document");
    }


    public void endDocument (){
	System.out.println("End document");
    }


    public void startElement (String uri, String name,
					String qName, Attributes atts){
    	switch(qName.toLowerCase()){
    		case "vehicle":
    			vehicle = true;
    			break;
    		//check for type vehicle
    		case "key":
    			key = true;
    			break;
    		//check for route vehicle
    		case "name":
    			this.name = true;
    			break;
    		case "gps":
    			gps = true;
    			break;
    		case "datetime":
    			date = true;
    			break;
    		case "lat":
    			lat = true;
    			break;
    		case "long":
    			glong = true;
    			break;
    		case "spd":
    			spd = true;
    			break;
    		case "dir":
    			dir = true;
    			break;
    		case "rsa":
    			rsa = true;
    			break;
    		case "schedstatus":
    			status = true;
    			break;
    		case "scheddelta":
    			delta = true;
    			break;
    		case "routestatus":
    			routeStatus = true;
    				break;
    		case "work":
    			work = true; 
    			break;
    		case "route":
    			route = true;
    			break;
    		case "trip":
    			trip = true;
    			break;
    		case "pattern":
    			pattern = true;
    			break;	
    	}
    }


    public void endElement (String uri, String name, String qName) {
    	switch(qName.toLowerCase()){
	    	case "vehicle":
				vehicle = false;
				System.out.println(v);
				//TODO process data
				v = new Vehicle();
	    	case "gps":
	    		gps = false;
				break;
	    	case "rsa":
	    		rsa = false;
	    		break;
	    	case "work":
	    		work = false;
	    		break;
	    	case "route":
	    		route = false;
	    		break;
	    	case "trip":
	    		trip = false;
	    		break;
	    	case "pattern":
	    		pattern = false;
	    		break;
    	}
    }
	
    

    public void characters (char ch[], int start, int length){
    	//need to put way to store values
    	String value = new String(ch,start,length); 
    	if(name && !(gps || rsa || work || route || trip || pattern)){
    		v.setName(value);
    		name = false;
    	}
    	else if(gps && date){
    		v.setGps_date(value);
    		date = false;
    	}
    	else if(gps && lat){
    		v.setGps_lat(value);
    		lat = false;
    	}
    	else if(gps && glong){
    		v.setGps_long(value);
    		glong = false;
    	}
    	else if(gps && spd){
    		v.setGps_Speed(value);
    		spd = false;
    	}
    	else if(gps && dir){
    		v.setGps_Dir(value);
    		dir = false;
    	}
    	else if(rsa && status){
    		v.setRsa_status(value);
    		status = false;
    	}
    	else if(rsa && delta){
    		v.setRsa_delta(value);
    		delta = false;
    	}
    	else if(rsa && routeStatus){
    		v.setRsa_routestatus(value);
    		routeStatus = false;
    	}
    	else if(work && route && key){
    		v.setWork_route_key(value);
    		key = false;
    	}
    	else if(work && route && name){
    		name = false;
    		v.setWork_route_name(value);
    	}
    	else if(work && trip && key){
    		v.setWork_trip_key(value);
    		key = false;
    	}
    	else if(work && trip && name){
    		v.setWork_trip_name(value);
    		name = false;
    	}
    	else if(work && pattern && key){
    		v.setWork_pattern_key(value);
    		key = false; 
    	}
    	else if(work && pattern && name){
    		v.setWork_pattern_name(value);
    		name = false;
    	}
    	
    }
    public static String getXML(String url){
    	StringBuilder sb = new StringBuilder();
    	try {
    		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
    		conn.setRequestProperty("Accept", "application/xml");
    		BufferedReader in = new BufferedReader(
			        new InputStreamReader(
			        		conn.getInputStream()));
			String input;

	        while ((input = in.readLine()) != null){
	            sb.append(input);
	        }
	        in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	return sb.toString();
    }
    public static void pasreURL(String url){
		try{
			ContentHandler handler = (ContentHandler) new Vehicle_handler();
			XMLReader myReader = XMLReaderFactory.createXMLReader();
			myReader.setContentHandler(handler);
			//String temp = getXML(url);
			//System.out.println(temp);
			//temp = temp.replaceAll("[^\\x20-\\x7e]", "");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
    		conn.setRequestProperty("Accept", "application/xml");
			myReader.parse(new InputSource( conn.getInputStream()));
		}
		catch(SAXException e){
			e.printStackTrace();
		}
		catch(MalformedURLException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

