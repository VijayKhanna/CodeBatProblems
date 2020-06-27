package String1;
import java.util.Scanner;
public class P13 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1;
	s1=sc.nextLine();
	int len;
	boolean front=false;
		if(front)
			System.out.println(s1.substring(0, 1));
		else
			System.out.println(s1.substring(s1.length()-1));
}
}
