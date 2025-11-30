//WAP to concate two strings without using inbuilt function.
import java.util.Scanner;
class strconcat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s1=sc.nextLine();
		System.out.print("Enter second string: ");
		String s2=sc.nextLine();
		String newString = "";
		for(int i=0;i<s1.length();i++)
		{
			newString+=s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++)
		{
			newString+=s2.charAt(i);
		}
		System.out.println("New string: "+newString);
	}
}