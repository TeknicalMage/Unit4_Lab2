import java.util.Scanner;

public class stringmanip {
	public stringmanip() {
		main();
	}
	
	public void main(){
		display();	
		Scanner input = new Scanner(System.in);
		String h = input.nextLine();
		if(h.equals("A")) {
			RO2();			
		}else if(h.equals("B")) {
			FP();
		}else if(h.equals("C")) {
			RepeatFront();
		}else if(h.equals("D")) {
			RPrefix();
		}else if(h.equals("E")) {
			System.exit(0);
		}else {
			System.out.println("Command not recognized. Try Again plz");
			main();
		}
		
	}
	
	public void RO2() {
		System.out.println("Type your string");
		Scanner input = new Scanner(System.in);
		String i = input.nextLine();
		int t = i.length();
		System.out.println("Length is " +  t);
		int d = t - 2;
		int f = 2;
		System.out.print(i.substring(2,t));
		System.out.print(i.substring(0,2));
		System.out.print("\n" + "\n");
		main();
	}
	
	public void FP() {
		System.out.println("Type your First Word");
		Scanner input = new Scanner(System.in);
		String i = input.nextLine();
		System.out.println("Type your second word");
		String j = input.nextLine();
		int t = i.length();
		int u = j.length();
		System.out.println("Length is " +  t + "," + u);
		
		System.out.print(i + j);
		System.out.print(j + i);
	
		System.out.print("\n" + "\n");
		main();
	}
	
	public void RepeatFront() {
		System.out.println("Type your First Word");
		Scanner input = new Scanner(System.in);
		String i = input.nextLine();
		System.out.println("Type amount of letters you'd like to iterate");
		int a = input.nextInt();
		
		int t = i.length();
		//-- Testing Statements pulled in and out to help figure out the order and placement
		//System.out.println("Length is " +  t);
		//System.out.print(a + "+" + t);
		
		//-- A subtracting for loop where A is the input. Prints between 0 and the input(A) 
		while(a >= 1) {
			System.out.print(i.substring(0, a));
			a--;
		}
		//-- Spacing so I don't go insane	
		System.out.print("\n" + "\n");
			main();
	}
	
	public void RPrefix() {
		boolean instance;
		System.out.println("Type your string");
		Scanner input = new Scanner(System.in);
		String i = input.nextLine();
		System.out.println("Type your next int");
		int j = input.nextInt();
		int b = 1;
		String prefix = i.substring(0,j);
		String set = i.substring(0,b);
		int k = i.length();
		while(k >= b) {
		//System.out.print(i.substring(0,j));
		instance = set.contains(prefix);
		if(instance = true) {
			System.out.println("Yes");
		}else {
			System.out.print("No");
		}
		b++;
		}
		System.out.print("\n" + "\n");
		main();
	}
		
	public static void display() {
		System.out.println("Choose one of the options below");
		System.out.println("Type A for| Rotation of 2");
		System.out.println("Type B for| Fake Palindrome");
		System.out.println("Type C for| Repeat Front");
		System.out.println("Type D for| Repeated Prefix");
		System.out.println("Type E for| Exit");
		
	}

	public static void main(String[] args) {
		new stringmanip();
	}

}
