package Add_Cal;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number-1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the number-2:");
		int num2 = sc.nextInt();
		
		System.out.println(do_Add(num1, num2));

	}

	private static int do_Add(int num1, int num2) {
		return num1+num2;
		
	}

}
