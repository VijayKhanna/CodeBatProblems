package String1;
import java.util.Scanner;
public class P12 {
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		int len=s1.length();
		System.out.println(s1.substring(len-2,len)+s1.substring(0,len-2));
	}
}
