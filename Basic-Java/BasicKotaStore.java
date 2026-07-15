import java.util.Scanner;
import java.text.DecimalFormat;
public class BasicKotaStore
{
	public static void main(String[] args)
	{
		
		Scanner tp = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R##,###.00");
		double cost = 0, price;
		int count = 0;
		char opt, odOpt;
		String name;
		System.out.println("Hi there please provide your name below:");
		name = tp.nextLine();
		System.out.println("Hey "+ name +" please look at the menu below to order:");
		System.out.print("\t----Menu---- \n"+
		"1. Order Kota \n"+
		"2. Order Drink \n"+
	 	"3. Add side \n"+
		"4. Order \n"+
					"Option : ");
		opt = tp.next().charAt(0);
		while(opt != '4')
		{
			if(opt == '1')
			{
				do{
					
					System.out.println("\n\t-----Kota Menu----- ");
					System.out.print("1. Palony and special - R20\n"+
					"2. Palony, special and Vienna - R25\n"+
					"3. Palony, special and Russian - R27\n"+
					"4. Palony, special, Vienna and cheese - R30\n"+
					"5. Palony, special, Russian and cheese - R32\n"+
					"6. Palony, special, Vienna and Russian - R35\n"+
					"7. Palony, special, cheese, Vienna and Russian - R40\n"+
					"8. Done \n"+
					"Option : "
					);
					odOpt = tp.next().charAt(0);
					
					switch(odOpt)
					{
						
						case '1': cost += 20; System.out.println("\n Added!!"); count++; break;
						case '2': cost += 25; System.out.println("\n Added!!"); count++; break;
						case '3': cost += 27; System.out.println("\n Added!!"); count++; break;
						case '4': cost += 30; System.out.println("\n Added!!"); count++; break;
						case '5': cost += 32; System.out.println("\n Added!!"); count++; break;
						case '6': cost += 35; System.out.println("\n Added!!"); count++; break;
						case '7': cost += 40; System.out.println("\n Added!!"); count++; break;
						case '8': System.out.println("\n Done Kota Orders!!");  break;
						default: System.out.println("\n\nInvalid Option!!!\n");
							
					}
					
					System.out.println("\n Sub Total: R"+ cost);

				}while(odOpt != '8');
				
			}
			if(opt == '2')
			{
				do{
					
					System.out.println("\n\t-----Drink Menu---- ");
					System.out.print("1. Juice - R20\n"+
					"2. Tea - R22\n"+
					"3. Sprite - R25\n"+
					"4. Coke - R25\n"+
					"5. Water - R15\n"+
					"6. Coffee - R24\n"+
					"7. Done \n"+
					"Option : "
					);
					
					odOpt = tp.next().charAt(0);
					
					switch(odOpt)
					{
						
						case '1': cost += 20; System.out.println("\n Added!!"); count++; break;
						case '2': cost += 22; System.out.println("\n Added!!"); count++; break;
						case '3': 
						case '4': cost += 25; System.out.println("\n Added!!"); count++; break;
						case '5': cost += 15; System.out.println("\n Added!!"); count++; break;
						case '6': cost += 24; System.out.println("\n Added!!"); count++; break;
						case '7': System.out.println("\n Done Kota Orders!!"); break;
						default: System.out.println("\n\nInvalid Option!!!\n");
							
					}
					
					System.out.println("\n Sub Total: R"+ cost);

				}while(odOpt != '7');
				
			}
			
			if(opt == '3')
			{
				do{
					
					System.out.println("\n\t-----Sides Menu---- ");
					System.out.print("1. Fries - R20\n"+
					"2. Vienna - R8\n"+
					"3. Russian - R10\n"+
					"4. Palony - R5\n"+
					"5. Cheese - R4\n"+
					"6. Done Order \n"+
					"Option : "
					);
					
					odOpt = tp.next().charAt(0);
					
					switch(odOpt)
					{
						
						case '1': cost += 20; System.out.println("\n Added!!"); count++; break;
						case '2': cost += 8; System.out.println("\n Added!!"); count++; break;
						case '3': cost += 10; System.out.println("\n Added!!"); count++; break;
						case '4': cost += 5; System.out.println("\n Added!!"); count++; break;
						case '5': cost += 4; System.out.println("\n Added!!"); count++; break;
						case '6': System.out.println("\n Done Sides Orders!!"); break;
						default: System.out.println("\n\nInvalid Option!!!\n");
							
					}
					
					System.out.println("\n Sub Total: R"+ cost);

				}while(odOpt != '6');
				
			}
			
			System.out.println("\n\n----------------------------------------------------");
			System.out.println("Hey "+ name +" please look at the menu below to order:");
			System.out.print("Menu: \n"+
			"1. Order Kota \n"+
			"2. Order Drink \n"+
			"3. Add side \n"+
			"4. Order \n"+
					"Option : ");
			opt = tp.next().charAt(0);
		}
		
		System.out.println("Hey "+ name +" here is your Order Details Below:" );
		System.out.println("The total for your order is "+ df.format(cost)+" with " + count + " items");
		System.out.println("Thank you for ordering!!! \n\n Enjoy......" );		
		
	}
}
