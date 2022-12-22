
public class DemoString {
	
	
	public static void main(String[] args) {
		System.out.println(args.toString());
		String str = "Geeks for Geeks";
		
		//string length
		System.out.println("Length of string : "+str.length());
		
		//substrings
		System.out.println("\n*** substrings ***");
		System.out.println(str.substring(2, 8));
		
		//string split method
		System.out.println("\n*** string split method ***");
		String[] arr = str.split("s");
		for(String s: arr) {
			System.out.print(s);
		}
		
		System.out.println(str.replace('G', 'g'));
	}

}
