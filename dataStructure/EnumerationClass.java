package dataStructure;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationClass {
	//The Enumeration interface defines the methods by which you can enumerate(obtatin 
	// one at a time)) the elements in a collection of objects.
	
	public static void main(String[] args){
		Enumeration days;
		Vector day = new Vector<String>();
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");
		day.add("Friday");
		day.add("Saturday");
		day.add("Sunday");
		day.add("montag");
		days = day.elements();
		// boolean hasMoreElements() when implemented, it must return true while there
		//are still more elements to extract, and false when all hte elements have been enumerated.
		
		while(days.hasMoreElements()){
			//Object nextElement() .. this returns the next object in the enumerations
			System.out.println(days.nextElement());
		}
		
		
	}

}
