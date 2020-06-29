package String2;
import java.util.Scanner;
public class S1 {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	String s1,s2=" ";
	s1=sc.nextLine();
	int len=s1.length();
	for(int i=0;i<len;i++)
	{
		s2=s1.substring(i,i+1)+s1.substring(i,i+1);
		System.out.print(s2);
	}
}
}
