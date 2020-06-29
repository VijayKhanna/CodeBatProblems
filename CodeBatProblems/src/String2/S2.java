package String2;
import java.util.Scanner;
public class S2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s1,s2=" ";
		s1=sc.nextLine();
		int len=s1.length(),count=0;
		for(int i=0;i<len;i++)
		{
			if ( (s1.charAt(i) == 'h') && (s1.charAt(i+1) =='i') )
				count+=1;
		}
		System.out.println(count);
	}
}
