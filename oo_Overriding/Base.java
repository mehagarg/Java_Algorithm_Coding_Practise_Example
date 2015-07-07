package oo_Overriding;

public class Base {
	public final String version(){
		where();
		return "1.0.0";
	}
	public static String name(){
		return "Base";
	}
	private void where(){
		System.out.println("Inside Base Class");
	}
}
