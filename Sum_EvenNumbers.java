// WAP which can take n numbers from user and find out sum of all even numbers.
import java.util.Scanner;
class array2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter elements:");
		int n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter elements-"+(i+1)+":");
			a[i]=sc.nextInt();
		}
		int sumeven=0;
		int sumodd=0;
		for(int i=0;i<n;i++){
			if(a[i]%2==0){
				sumeven+=a[i];
			}
			else{
				sumodd+=a[i];
			}
		}
		System.out.print("Sum of all even number= "+sumeven);
		System.out.println("Sum of all odd number= "+sumodd);
	}
}

