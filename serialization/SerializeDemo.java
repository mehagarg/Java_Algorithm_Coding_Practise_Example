package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String args[]) {
		Employee e = new Employee();
		e.name = "Meha";
		e.address = "417 Spencer Ter, SUnnyvale, CA";
		e.number = 619;
		e.SSN = 123456;
		
		try {
			FileOutputStream fos = new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
			System.out.println("Serialized data is saved in /tmp/employee.ser");
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}

}
