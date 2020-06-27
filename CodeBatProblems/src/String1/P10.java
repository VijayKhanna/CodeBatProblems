package String1;
import java.util.Scanner;
public class P10 {
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		int len=s1.length();
		int len2=s2.length();
		System.out.println(s1.substring(1,len)+s2.substring(1,len));
	}
}
