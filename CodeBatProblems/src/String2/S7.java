package String2;
import java.util.Scanner;
public class S7 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s1;
		s1=sc.nextLine();
		int len=s1.length();
		for(int i=0;i<len;i++)
		{
			 if (s1.charAt(i)=='b' && s1.charAt(i+2)=='b')
				 System.out.println("true");
		}
				 System.out.println("false");
	}
}
