package String1;
import java.util.Scanner;
public class P18 {
	public static void main(String args[])
	{
		String s1;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		int len=s1.length();
		int n;
		n=sc.nextInt();
		System.out.println(s1.substring(n,n+2));
	}
}
