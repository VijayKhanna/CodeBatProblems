package String1;
import java.util.Scanner;
public class P4 {
	public static void main(String args[])
	{
		String s1,tag;
		Scanner sc =  new Scanner(System.in);
		s1=sc.nextLine();
		tag=sc.nextLine();
		System.out.println(tag.substring(0,2)+s1+tag.substring(2,4));
	}
}
