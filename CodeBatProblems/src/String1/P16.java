package String1;
import java.util.Scanner;
public class P16 {
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		int len=s1.length();
		if(s1.charAt(len-1)=='l'&&s1.charAt(len)=='y')
		System.out.println("true");
		else
			System.out.println("false");
	}
}
