package String1;
import java.util.Scanner;
public class P5 {
	public static void main(String args[])
	{
		String s1;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		int len = s1.length();
		String temp = s1.substring(len-2, len);
		int n=3;
		while(n>0)
		{
			System.out.print(temp);
			n--;
		}
	}
}
