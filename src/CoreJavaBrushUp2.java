import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {

		int[] arr2 = {1,2,3,4,5};
		//System.out.println(arr[0]);
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i] % 2 ==0)
				System.out.println(arr2[i]);
			else
				System.out.println(arr2[i] + " is not 2");
		}

		ArrayList<String> a = new ArrayList<String>();
			a.add("Kim");
			a.add("Maxim");
			a.add("L");
			
		for(int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("______________");
		
		for(String val: a)
		{
			System.out.println(val);
		}
		
		System.out.println(a.contains("Kim"));
	}

}
