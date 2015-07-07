package oo_Overriding;

/*
 * In the code above, you can see that in Base.java we have three methods, 
 * final method version(), static method name() and private method where().
 *  
 * In the sub class Derived.java, we tried to override final method but compiler gave us error, 
 * forcing us to comment that code. Though we are able to create private and static method 
 * of same name and syntax in the sub class, but this is not overriding. 
 * 
 * To verify that we ran the program and program called methods of derived object with type 
 * of base class. In this case any overridden method will be execute code defined in derive 
 * class but you can see from output that code defined in Base class is executed. In short, 
 * its not possible to override private and static method in Java.
 * */

public class PrivateStaticFinalMethods {
	public static void main(String[] args) {
		Base b = new DerivedClass();
		
		System.out.println(b.version());
		System.out.println(b.name());
		
		DerivedClass d = new DerivedClass();
		System.out.println(d.version());
		System.out.println(d.name());
	}
}
