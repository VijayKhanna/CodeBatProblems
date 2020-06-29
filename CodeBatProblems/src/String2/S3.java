package String2;
import java.util.Scanner;
public class S3 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s1;
		String s2="cat",s3="dog";
		s1=sc.nextLine();
		int len=s1.length(),count=0,count2=0;
		for(int i=0;i<len-2;i++)
		{
			 if (s1.substring(i, i+3).compareTo(s2)==0)
			 count++; 
			 if (s1.substring(i, i+3).compareTo(s3)==0)
			 count2++; 

		}
		if(count==count2)
			System.out.println("truee");
		else
			System.out.println("falsee");
	}
}
