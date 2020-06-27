package String1;
import java.util.Scanner;
public class P14 {
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		int len=s1.length();
		if(len%2!=0)
		System.out.println(s1.substring(1,len-1));
		else
			System.out.println("");
	}
}
