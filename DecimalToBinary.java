package random;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String binary="";
		int remainder=0;
		
		System.out.println("Enter the Decimal Number :");
		int num = sc.nextInt();
		
		int tempNum = num;
		
		while(num > 0) {
			remainder = num % 2 ;
			binary = remainder + binary;
			num = num/2;
		}
		System.out.println("Binary Equivalent of "+tempNum+" is "+binary);
		
	}

}
