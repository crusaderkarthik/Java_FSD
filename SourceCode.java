package MyFirstPackage;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		/*Take input from user
		Scanner name = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String x = name.nextLine();
//		String -> nextLine() -> This is for string
  		Int -> nextInt() -> This is for Integer
		
		Scanner age = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int y = age.nextInt();
		
		System.out.println("The name of the person is "+x+" and his age is "+y);
	*/
		
		/*If else with user inputs
		Scanner num = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int z = num.nextInt();
		
		if(z>=18 && z<30) {
			System.out.println("Welcome to site. You age is "+z+" and you are allowed");
		}
		else {
			System.out.println("Bye. Your age is "+z+" and you are not allowed");
		}
		*/
		
		
		/*Switch Loop
		Scanner runs = new Scanner(System.in);
		System.out.print("Enter the score: ");
		int score = runs.nextInt();
		
		switch(score) {
		case 100:
			System.out.println("Century");
			break;
		case 90:
			System.out.println("10 more runs to Century");
			break;
		case 50:
			System.out.println("Half Century");
			break;
		case 0:
			System.out.println("Duck Out");
			break;
		default:
			System.out.println("Score is " +score+" on the way and going good");
			break;
		}
		*/
		
		
		//Iteration
//		int a = 10;
//		a--; //a = a-1
//		a++; // a = a+1
//		a+=5; // a = a + 5
//		System.out.println(a);
	
		/* While Loop
		int i = 0;
		
		while(i<5) {
			System.out.println(i);
			i++;
		}
		*/
		
		/* Do while
		System.out.println("--------------");
		int  j = 0;
		do {
			System.out.println(j);
			j++;
		}
		while(j<5);
		*/
		
		/* For Loop   */
		
		/*
		for (statement1, statement2, statement3) {
			//code block to be executed
		}
Statement1 is executed before the execution of the code block
Statement2 defines the condition for executing the code block
Statement3 is executed after the code block has been executed		
		*/
		
//Print the number from 0 to 4 using "for loop"
		
//		for(int i = 0; i<=10; i=i+1) {
//			System.out.println(i);
//		}
		
		/*
//		Nested loops
//		It is also possible to place a loop inside another loop. This concept is called nested loop
		for(int i=1;i<=2;i++) {
			System.out.println("Outer loop: "+i);
			//Executes 2 times
		
		for (int j=1;j<=3;j++) {
			System.out.println(" Inner loop: "+j);
		}
		//Executes 3 times
		
		}
		//Executes 6 times(2*3)
		
		
		/*
		0;0<5; //0
		1;1<5; //1
		2;2<5; //2
		3;3<5; //3
		4;4<5; //4
		5;5<5; False
		*/
		
		
//		String[] vehicle = {"Volvo","BMW","Toyoto","Tesla"};
//		vehicle[2]="Mahindra";
//		System.out.println(vehicle[2]);
//		System.out.println(vehicle.length);
		
		//Count starts from 1
		//Index starts from 0
		
		String[] vehicle = {"Volvo","BMW","Toyoto","Tesla"};		
		for (int i=0; i<vehicle.length;i++) {
			System.out.println(vehicle[i]);
		}
	}
}
