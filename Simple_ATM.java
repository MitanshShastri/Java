import java.util.Scanner;
class ATM
{
	public static void main(String[] args)
	{
		String password="1234";
		int attempts=0;
		int balance=100000;
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			if(attempts==3)
			{
				System.out.println("Your account has been locked for 24 hours");
				break;
			}
			System.out.print("\nEnter your password");
			String userpass= sc.next();
			
			if(userpass.equals(password))
			{
				System.out.println("Welcome!");
				boolean b= true;
				while(true)
				{
					System.out.print("\nATM menu: ");
					System.out.println("choose 1 for password change");
					System.out.println("choose 2 for withdrawl");
					System.out.println("choose 3 for deposit");
					System.out.println("choose 4 for balance inquiry");
					System.out.println("choose 5 for EXIT");
					
					System.out.println("enter your choices(1-5): ");
					int choices=sc.nextInt();
					
					switch(choices)
					{
						case 1: System.out.print("enter new password");
						String newpass= sc.next();
						boolean isvalid= true;
						if(newpass.length()==4)
						{
							for(int i=0;i<newpass.length();i++)
							{
								if(newpass.charAt(i)<'0'||newpass.charAt(i)>'9')
								{
									isvalid=false;
									break;
								}
							}
						}
						else
						{
							isvalid=false;
						}
						if(isvalid)
						{
							password=newpass;
							System.out.println("password change successfully");
						}
						else
						{
							System.out.println("Invalid password");
						}
						break;
						
						case 2: System.out.println("enter the amount to be withdrawn:");
						int amtwithdrawn= sc.nextInt();
						if(amtwithdrawn>0 && amtwithdrawn<=balance)
						{
							balance-=amtwithdrawn;
							System.out.println("Withdrawl succesfully.upadated balance:Rs. "+balance);
						}
						else
						{
							System.out.println("insufficent balance");
						}
						break;
						
						case 3: System.out.println("enter the amount to be deposited:");
						int amtdeposited=sc.nextInt();
						if(amtdeposited>0)
						{
							balance+=amtdeposited;
							System.out.println("Deposited succesfully.updated balance:Rs. "+amtdeposited);
						}
						else
						{
							System.out.println("invalid deposit amount");
						}
						break;
						
						case 4: System.out.println("Your current balance is Rs: "+balance);
						break;
						
						case 5: System.out.println("Exiting the ATM.GOODBYE!");
						 b=false;
						break;
						
						default: System.out.println("enter number beetween 1 to 5 only");
					}
				}
			}
			else
			{
				attempts++;
				System.out.println("Invalid paasword.attempts left "+(3-attempts));
			}
		}
		
	}
}