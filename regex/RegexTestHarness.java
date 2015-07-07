package regex;

	import java.io.Console;
	import java.util.regex.Pattern;
	import java.util.regex.Matcher;

	public class RegexTestHarness {

	    public static void main(String[] args){
	    	String input = "";
	    	Matcher matcher = Pattern.compile("a*").matcher(input);
	    	int nr = 0;
	    	while(matcher.find()){
	    		System.out.println("Match no. " +  ++nr + ": " + matcher.group() + "'");
	    	}
	    }
	}
