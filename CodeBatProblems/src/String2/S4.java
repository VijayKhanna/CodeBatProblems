package String2;
import java.util.Scanner;
public class S4 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s1;
		String s2="code",s3="cope",s4="cooe";
		s1=sc.nextLine();
		int len=s1.length(),count=0;
		for(int i=0;i<len-3;i++)
		{
			 if (s1.substring(i, i+4).compareTo(s2)==0||s1.substring(i, i+4).compareTo(s3)==0||s1.substring(i, i+4).compareTo(s4)==0)
			 count++; 
		}
		System.out.println(count);
	}
}
