package String2;
import java.util.Scanner;
public class S11 {
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc= new Scanner(System.in);
		s1=sc.nextLine();
		int n;
		int len=s1.length();
		n=sc.nextInt();
		int p=n;
		while(n>0) 
		{
			System.out.print(s1.substring(0,p));
			n--;
		}
	}

}
