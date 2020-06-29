package String2;
import java.util.Scanner;
public class S8 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s1;
		char s2='x',s3='y';
		s1=sc.nextLine();
		int len=s1.length(),count=0,count2=0;
		for(int i=0;i<len-2;i++)
		{
			 if (s1.charAt(i)==s2)
			 count++; 
			 if (s1.charAt(i)==s3)
			 count2++; 

		}
		if(count==count2)
			System.out.println("truee");
		else
			System.out.println("falsee");
	}
}
