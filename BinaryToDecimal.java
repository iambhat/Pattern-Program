package random;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int decimal = 0;
		int base = 1;
			
		System.out.println("Enter the Binary Number :");
		int num = sc.nextInt();
			
		int tempNum = num;
			
		while(num > 0) {
			int lDigit = num % 10;
			decimal = decimal + lDigit * base;
			base = base * 2;
			num = num/10;
		}
		System.out.println("Decimal Equivalent of "+tempNum+" is "+decimal);
		
	}
	
}



OUTPUT:

Enter the Binary Number :
1010
Decimal Equivalent of 1010 is 10
