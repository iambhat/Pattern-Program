package random;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int octal = 0;
		int base = 1;

		System.out.println("Enter the Octal Number :");
		int num = sc.nextInt();

		int tempNum = num;

		while(num > 0) {
			int lDigit = num % 10;
			octal = octal + lDigit * base;
			base = base * 8;
			num = num/10;
		}
		System.out.println("Decimal Equivalent of "+tempNum+" is "+octal);

	}

}
