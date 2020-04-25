package random;

import java.util.Scanner;

public class DecimalToOctal {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String octal="";
			int remainder=0;
			
			System.out.println("Enter the Decimal Number :");
			int num = sc.nextInt();
			
			int tempNum = num;
			
			while(num > 0) {
				remainder = num % 8;
				octal = remainder + octal;
				num = num/8;
			}
			System.out.println("Octal Equivalent of "+tempNum+" is "+octal);
			
		}

	}
