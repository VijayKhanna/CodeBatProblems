package String1;
import java.util.Scanner;
public class P8 {
	public static void main(String args[])
	{
		String s1;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		int len = s1.length();
		String temp = s1.substring(1, len-1);
		System.out.print(temp);
	}
}
