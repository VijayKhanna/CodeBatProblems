package String2;
import java.util.Scanner;
public class S6 {
	public static boolean main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s1;
		String s2="xyz";
		s1=sc.nextLine();
		int len=s1.length(),count=0,count2=0;
		for(int i=0;i<len-2;i++)
		{
			 if (s1.substring(i, i+3).equals(s2))
				 return true;
			 else
				 return false;
		}
	}
}
