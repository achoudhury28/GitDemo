
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		//String is an object that represents sequence of char values.
		//String literal
		
		String name = "Abdul Choudhury";
		System.out.println(name );
		//new
		String s2 = new String("Abdul");
		System.out.println(s2);
		String s3 = new String("Abdul");
		System.out.println(s3);
		String s = "Rahul Shetty Academy";
		
		String[] splited = s.split(" ");
		System.out.println(splited[0]);
		System.out.println(splited[1]);
		System.out.println(splited[2]);
		
		System.out.println("*******************");
		
		String[] sp = s.split("Shetty");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		System.out.println(sp[0].trim());
		System.out.println(sp[1].trim());
		
		for(int i= 0; i < s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		System.out.println("*******************");
		
		for(int i = s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
		String or = "Reverse of Rahul Shettty Academy is: ";
System.out.println("*******************");
		
		for(int i = s.length()-1;i>=0;i--)
		{
			or = or+s.charAt(i);
		}
		System.out.println(or);
		
		
		
		
		
		
	}

}
