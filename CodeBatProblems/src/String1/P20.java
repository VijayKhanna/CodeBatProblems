package String1;
import java.util.Scanner;
public class P20 {
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		int len=s1.length();
		if(s1.substring(0,3).equalsIgnoreCase("bad"))
		System.out.println("truee");
		else
			System.out.println("falsee");
	}
}
