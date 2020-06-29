package String2;
import java.util.Scanner;
public class S5 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s1,s2;
		s1=sc.nextLine();
		s2=sc.nextLine();
		int len=s1.length();
		int len1=s2.length();
		if (len <len1) 
		{
			String temp = s2.substring(len1 - len, len1);
			if (temp.compareTo(s1) == 0)
				System.out.println("truee");
			else
				System.out.println("falsee");
		} 
		else
		{
			String temp = s1.substring(len - len1, len);
			if (temp.compareTo(s2) == 0)
				System.out.println("truee");
			else
				System.out.println("falsee");
		}
	}
}
