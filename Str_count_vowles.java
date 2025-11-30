// WAP to entered a string and count its vowels.
import java.util.Scanner;
class strvowels
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s= sc.next();
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
		if((ch=='a' || ch=='A') || (ch=='e' || ch=='E') || (ch=='o' || ch=='O') || (ch=='i' || ch=='I') || (ch=='u' || ch=='U'))
			cnt++;
		}
		System.out.println("Number of vowels in a entered string: "+cnt);
	}
}
	