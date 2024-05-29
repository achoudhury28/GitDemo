import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 122 };

		// print the value which are multiplied by 2.output should be 2,4,6,8,122

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				break;// (check if array has multiple of 2

			}

		}

		ArrayList<String> a = new ArrayList<String>();

		a.add("Abdul");
		a.add("Choudhury");
		a.add("Ahkam");
		a.add("Jubair");
		a.add("Choudhury");

		System.out.println(a.get(3));

		for (int i = 0; i < a.size(); i++) {

			System.out.println(a.get(i));
		}

		System.out.println("*****************");

		for (String val : a) {
			System.out.println(val);
		}

		System.out.println("*****************");
		
		System.out.println(a.contains("Choudhury"));

		String[] name = { "Abdul", "Ahkam", "Ahsan", "Jubair" };
		List<String> arrayList = Arrays.asList(name);
		
		arrayList.contains("jubair");

		
		
		
		
	}

}
