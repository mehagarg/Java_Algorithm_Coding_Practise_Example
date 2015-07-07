package oo_BlankFinalClass;

import java.io.ObjectInputStream.GetField;

public class BlankFinalClass {
	private final int blankfinalvariable;
	
	public BlankFinalClass(){
		this(6);
	}
	
	public BlankFinalClass(int number) {
		this.blankfinalvariable = number;
	}
	
	public static void main(String[] args){
		BlankFinalClass clazz = new BlankFinalClass(10);
		System.err.println("Value of blank variable " + clazz.blankfinalvariable);
	}
}
