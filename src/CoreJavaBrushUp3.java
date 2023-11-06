
public class CoreJavaBrushUp3 {
	
	public static void main(String[] args) {
		String s = "Kim";
		String s1 = "Kim M K";
		String s3 = new String("Welcome");
		String[] splittedarray = s1.split(" ");
		
		//System.out.println(splittedarray[0]);
		//System.out.println(splittedarray[1]);
		//System.out.println(splittedarray[2]);
		
		for (int i = s1.length()-1; i >= 0; i--)
		{
			System.out.println(s1.charAt(i));
		}
		
		
		
	}
		
}
