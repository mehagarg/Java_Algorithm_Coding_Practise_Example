package oo_abstractClassDemo;

public class AbstractClassDemo {
	public static void main(String args[]){
//		Tomcat server = new Tomcat("apache");
//		server.start();
	}
	
	public abstract class Server{
		protected final String name;
		public Server(String name){
			this.name = name;
		}
		
		public abstract boolean start();
	}
	
	public class Tomcat extends Server{
		public Tomcat(String name){
			super(name);
		}
		@Override
		public boolean start(){
			System.out.println(this.name + " started succesfully");
			return true;
		}
	}
}
