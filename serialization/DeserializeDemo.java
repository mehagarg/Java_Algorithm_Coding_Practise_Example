package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	public static void main(String args[]) {
		Employee e = null;
		
		
		try {
			FileInputStream fis = new FileInputStream("/tmp/employee.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			e = (Employee) ois.readObject();
			ois.close();
			fis.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	     System.out.println("SSN: " + e.SSN);
	      System.out.println("Number: " + e.number);
		
	}

}
