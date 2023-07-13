package Revisionn;
import java.util.Scanner;

public class AtmMachine2
{

	public static void main(String[] args)
	{ 
		double accBal=50000;
		int pin=7892;
		String name="ShabariVijay";
		

		Scanner scn =new Scanner(System.in);
		System.out.println("welcome to ATM");
		System.out.println("english\nkannada\nhindi");
		String language=scn.next();
		if("english".equals(language))
		{
			System.out.println("                        current   ");
			System.out.println("                        savings   ");
			String opt=scn.next();
			if("savings".equals(opt))
			{
				System.out.println("withdrawal\nbalanceEnquery\nminiStatement");
				String opt2=scn.next();
				if("withdrawal".equals(opt2))
				{
					System.out.println("                        enter Pin   ");
					int opt3=scn.nextInt();
					if(opt3==pin)
					{
						System.out.println("welcome "+name);
						System.out.println("plz enter the amount to be withdrawn");
						double withdrawalAmt=scn.nextDouble();
						if(withdrawalAmt<accBal)
						{
							System.out.println("              transaction successful");
							accBal=accBal-withdrawalAmt;
							System.out.println("              your accBal is="+accBal);
						}
						else
						{
							System.out.println("              insufficient funds");
						}
					}
					else
					{
						System.out.println("incorrect password");
					}	
				}
				else if("balanceEnquery".equals(opt2))
				{
					System.out.println("                        enter Pin   ");
					int opt3=scn.nextInt();
					if(opt3==pin)
					{
						System.out.println("welcome "+name);
						System.out.println("your account balance ="+accBal);
						System.out.println("do u want reciept\n-yes\n-no");
						String reciept=scn.next();
						if("yes".equals(reciept)) 
						{
							System.out.println("wait.........\n");
							for(int i=0;i<2;i++)
							{
								System.out.println(" ");
							}
							System.out.println("collect the reciept");
						}
						else if("no".equals(reciept))
						{
							System.out.println("okay");
						}
						
					}
					else
					{
						System.out.println("incorrect password");
					}
					
				}
				else if("miniStatement".equals(opt2))
				{
					System.out.println("                        enter Pin   ");
					int opt3=scn.nextInt();
					if(opt3==pin)
					{
						System.out.println("welcome "+name);
						System.out.println("(12-05-2018)your transaction=4500rs\n(15-05-2018)your transaction=8000rs\n(18-05-2018)your transaction=7900rs\n(29-05-2018)your transaction=10000rs\n(10-06-2018)your transaction=5000rs\n(15-06-2018)your transaction=10000rs\n");
						System.out.println("\n            your accountBalance ="+accBal);
					}
					else
					{
						System.out.println("incorrect password");
					}
				}
					
			}
			else if("current".equals(opt))
			{
				System.out.println("current account page");
			}
			
			
		}
		else if("kannada".equals(language))
		{
			System.out.println("                        current   ");
			System.out.println("                        savings   ");
			String opt=scn.next();
			if("savings".equals(opt))
			{
				System.out.println("withdrawal\nbalanceEnquery\nminiStatement");
				String opt2=scn.next();
				if("withdrawal".equals(opt2))
				{
					System.out.println("                        enter Pin   ");
					int opt3=scn.nextInt();
					if(opt3==pin)
					{
						System.out.println("welcome "+name);
						System.out.println("plz enter the amount to be withdrawn");
						double withdrawalAmt=scn.nextDouble();
						if(withdrawalAmt<accBal)
						{
							System.out.println("              transaction successful");
							accBal=accBal-withdrawalAmt;
							System.out.println("              your accBal is="+accBal);
						}
						else
						{
							System.out.println("              insufficient funds");
						}
					}
					else
					{
						System.out.println("incorrect password");
					}	
				}
				else if("balanceEnquery".equals(opt2))
				{
					System.out.println("                        enter Pin   ");
					int opt3=scn.nextInt();
					if(opt3==pin)
					{
						System.out.println("welcome "+name);
						System.out.println("your account balance ="+accBal);
						System.out.println("do u want reciept\n-yes\n-no");
						String reciept=scn.next();
						if("yes".equals(reciept)) 
						{
							System.out.println("wait.........\n");
							for(int i=0;i<5;i++)
							{
								System.out.println(" ");
							}
							System.out.println("collect the reciept");
						}
						else if("no".equals(reciept))
						{
							System.out.println("okay");
						}
						
					}
					else
					{
						System.out.println("incorrect password");
					}
					
				}
				else if("miniStatement".equals(opt2))
				{
					System.out.println("                        enter Pin   ");
					int opt3=scn.nextInt();
					if(opt3==pin)
					{
						System.out.println("welcome "+name);
						System.out.println("(12-05-2018)your transaction=4500rs\n(15-05-2018)your transaction=8000rs\n(18-05-2018)your transaction=7900rs\n(29-05-2018)your transaction=10000rs\n(10-06-2018)your transaction=5000rs\n(15-06-2018)your transaction=10000rs\n");
						System.out.println("\n            your accountBalance ="+accBal);
					}
					else
					{
						System.out.println("incorrect password");
					}
				}
					
			}
			else if("current".equals(opt))
			{
				System.out.println("current account page");
			}
		}	
		else if("hindi".equals(language))
		{
			System.out.println("                        current   ");
			System.out.println("                        savings   ");
			String opt=scn.next();
			if("savings".equals(opt))
			{
				System.out.println("withdrawal\nbalanceEnquery\nminiStatement");
				String opt2=scn.next();
				if("withdrawal".equals(opt2))
				{
					System.out.println("                        enter Pin   ");
					int opt3=scn.nextInt();
					if(opt3==pin)
					{
						System.out.println("welcome "+name);
						System.out.println("plz enter the amount to be withdrawn");
						double withdrawalAmt=scn.nextDouble();
						if(withdrawalAmt<accBal)
						{
							System.out.println("              transaction successful");
							accBal=accBal-withdrawalAmt;
							System.out.println("              your accBal is="+accBal);
						}
						else
						{
							System.out.println("              insufficient funds");
						}
					}
					else
					{
						System.out.println("incorrect password");
					}	
				}
				else if("balanceEnquery".equals(opt2))
				{
					System.out.println("                        enter Pin   ");
					int opt3=scn.nextInt();
					if(opt3==pin)
					{
						System.out.println("welcome "+name);
						System.out.println("your account balance ="+accBal);
						System.out.println("do u want reciept\n-yes\n-no");
						String reciept=scn.next();
						if("yes".equals(reciept)) 
						{
							System.out.println("wait.........\n");
							for(int i=0;i<2;i++)
							{
								System.out.println(" ");
							}
							System.out.println("collect the reciept");
						}
						else if("no".equals(reciept))
						{
							System.out.println("okay");
						}
						
					}
					else
					{
						System.out.println("incorrect password");
					}
					
				}
				else if("miniStatement".equals(opt2))
				{
					System.out.println("                        enter Pin   ");
					int opt3=scn.nextInt();
					if(opt3==pin)
					{
						System.out.println("welcome "+name);
						System.out.println("(12-05-2018)your transaction=4500rs\n(15-05-2018)your transaction=8000rs\n(18-05-2018)your transaction=7900rs\n(29-05-2018)your transaction=10000rs\n(10-06-2018)your transaction=5000rs\n(15-06-2018)your transaction=10000rs\n");
						System.out.println("\n            your accountBalance ="+accBal);
					}
					else
					{
						System.out.println("incorrect password");
					}
				}
					
			}
			else if("current".equals(opt))
			{
				System.out.println("current account page");
			}
		}
	
		
		
		

	}

}
