package String2;
import java.util.Scanner;
public class S12 {
	public static void main(String args[])
	{
		String s1,s2,s3=" ";
		Scanner sc= new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		int n,i;
		int len=s1.length();
		n=sc.nextInt();
		if(n==0)
			System.out.print(s1);
		else
			for(i=0;i<n-1;i++)
				s3+=s1+s2;
		System.out.print(s3);
	}
}
