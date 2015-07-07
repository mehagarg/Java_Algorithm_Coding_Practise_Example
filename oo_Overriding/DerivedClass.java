package oo_Overriding;

public class DerivedClass extends Base {
	// Hidden static method - Same signature but bonded at compile time.
	public static String name(){
		return "Derived";
	}
	
	//Hidden private method - same signature but resolved at compile time
	private void where(){
		System.out.println("Inside Derived class");
	}
	
	//Compilation Error: final method cant be overridden in Java
//	public final String version(){
//		where();
//		return "2.0.0";
//	}

}
