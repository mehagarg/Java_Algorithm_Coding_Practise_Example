package test;

import java.util.Random;

public class RandomGeneratorDemo {
	public static void main(String args[]){
		Random no = new Random();
		for(int i=0; i<665566; i++){
			System.out.println(no.nextInt(100));
		}
		
		
	}

}
