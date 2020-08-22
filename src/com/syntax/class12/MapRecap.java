package com.syntax.class12;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRecap {
	// keeps the valuse based on what?? 
	
		// name = Adam
		// lastName = Adam
		// age = 35;
		// Gender = Male
		
		// can we have duplicate keys?? 
		// can we have duplicate values?
		// do we have index values? --> No index values
		
		public static void main(String[] args) {
			
			Map<String, String> employeeMap=new LinkedHashMap<>();
			
			// HashMap  -- LinkedHashMap   -- TreeMap
			
			employeeMap.put("name", "Adam");
			employeeMap.put("lastName", "Adam");
//			employeeMap.put("age", "35");
			employeeMap.put("Gender", "Male");
			employeeMap.put("salary", "120000");
			
			employeeMap.put("age", "45");
			
			
			// what kind of methods to loop through a map?
			// .values()  --> returns all values inside the map --> It returns us a list of all values
			
			Collection<String> values=employeeMap.values();
			
				// enhanced loop
			
			System.out.println("-------------values() + Enhanced Loop---------------");
			
			for(String value:values) {
				System.out.println(value);
			}
			
			// can we get keys by using values method?
			
				// iterator  --> iterate through values
			// declare and intialize iterator
			
			System.out.println("-------------values() + Iterator---------------");
			
			Iterator<String> valIt=values.iterator();
			
			while(valIt.hasNext()) {
				String value=valIt.next();
				System.out.println(value);
			}
			
			
			// .keySet()  --> returns all keys inside the map --> returns us a set of key values
			
			// create a set which contains all keys
			
			Set<String> keys=employeeMap.keySet();
			
			System.out.println(keys);
			
			// we can use enhanced loop 
			
			System.out.println("-------------keySet() + Enhanced Loop---------------");
			
			for(String key:keys) {
//				System.out.println(key);
				
				String value=employeeMap.get(key);
				
				System.out.println(key+" -- "+ value);
			}
			
			
			// can we access values by using these keys

			// we can use iterator
			
			System.out.println("--------------keySet() + Iterator -----------------");
			
			Iterator<String> keyIt=keys.iterator();
			
			while(keyIt.hasNext()) {
				String key=keyIt.next();  // --> What does it returns us?
				
				String value=employeeMap.get(key);
				System.out.println(key+"   " +value);
				
			}
			
			
			
			// .entrySet() --> returns all entries -->returns us a set off all entries
			
			// we need to declare and intialize our entrySet
			
			Set<Entry<String, String>> entries=employeeMap.entrySet();
			
			System.out.println(entries);
			
			// Enhanced for loop
			
			System.out.println("-----------------entrySet() + Enhanced For Loop-----------------");
			
			for(Entry<String, String>  entry:entries) {
				String key=entry.getKey();
				String value=entry.getValue();
				
				System.out.println(key+"  --->  "+value);
			}
			
			
			// Iterator
			
			System.out.println("-----------------entrySet() + Iterator-----------------");
			
			Iterator<Entry<String, String>> entIt=entries.iterator();
			
			while(entIt.hasNext()) {
				Entry<String, String> entry=entIt.next();
				String key=entry.getKey();
				
				String value=entry.getValue();
				
				System.out.println(key+"  ///   "+value);
			}
			
		}



}
