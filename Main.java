import java.util.*;
class Calculator{
	int Add(int a, int b){
		return (a+b);
	}
	int Subtract(int a, int b){
		if(a>b)
			return (a-b);
		else 
			return (b-a);
	}
	int Product(int a, int b){
		return (a*b);
	}
	int Division(int a, int b){
		return (a/b);
	}
}

class Main{
	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);
		int a,b,choice;
		Calculator obj = new Calculator();
		do{
			System.out.println("Enter a number");
			a = inp.nextInt();
			System.out.println("Enter a number");
			b = inp.nextInt();
			System.out.println("Enter 1 for addition");
			System.out.println("Enter 2 for subrtaction");
			System.out.println("Enter 3 for multiplication");
			System.out.println("Enter 4 for division");
			choice = inp.nextInt();
			switch(choice){
				case 1:
					System.out.println("The sum is "+obj.Add(a,b));
					break;
				case 2:
					System.out.println("The difference is "+obj.Subtract(a,b));
					break;
				case 3:
					System.out.println("The product is "+obj.Product(a,b));
					break;
				case 4:
					System.out.println("The division is "+obj.Division(a,b));
					break;
				default:
					System.out.println("Enter a valid choice");
			}
			System.out.println("To continue using the program Enter 1 or else 0");
			choice = inp.nextInt();
		}while(choice == 1);
	}
}