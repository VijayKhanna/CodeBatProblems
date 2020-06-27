package String1;
import java.util.Scanner;
public class P9 {
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		int len=s1.length();
		int len2=s2.length();
		if(len>len2)
			System.out.println(s2+s1+s2);
		else if(len<len2)
			System.out.println(s1+s2+s1);
		else
			System.out.println(s2+s1+s2+s1);
	}
}
