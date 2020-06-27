package String1;
import java.util.Scanner;
public class P21 {
	public static void main(String args[])
	{
		String s1;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		int len=s1.length();
		if(len>2)
		System.out.println(s1.substring(0,2));
		else
			System.out.println(s1+"@");
	}
}
