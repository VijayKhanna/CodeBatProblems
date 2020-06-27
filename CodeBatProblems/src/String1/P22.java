package String1;
import java.util.Scanner;
public class P22 {
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		int len=s1.length();
		int len2=s2.length();
		if(len>2&&len2>2)
		System.out.println(s1.substring(0)+s2.substring(len));
		else
			System.out.println(s1+"@");
	}
}
