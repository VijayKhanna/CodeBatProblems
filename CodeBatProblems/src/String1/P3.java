package String1;

import java.util.Scanner;

public class P3 {
public static void main(String args[])
{
	String s1,tag;
	Scanner sc =  new Scanner(System.in);
	s1=sc.nextLine();
	tag=sc.nextLine();
	System.out.println('<' +tag+ '>' +s1+ '<' +'/' + tag+ '>');
}
}
