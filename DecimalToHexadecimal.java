package random;

import java.util.Scanner;

public class DecimalToHexadecimal {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String hexadecimal="";
			int remainder=0;
			
			String a[]= {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
			
			System.out.println("Enter the Decimal Number :");
			int num = sc.nextInt();
			
			int tempNum = num;
			
			while(num > 0) {
				remainder = num % 16;
				hexadecimal = a[remainder] + hexadecimal;
				num = num/16;
			}
			System.out.println("Hexa Decimal Equivalent of "+tempNum+" is "+hexadecimal);
			
		}

	}
