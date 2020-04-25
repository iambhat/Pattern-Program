package random;

import java.util.Scanner;

public class HexadecimalToDecimal {

	public static void main(String args[])
	{
		String hexdec_num;
		int dec_num = 0;

		String digits = "0123456789ABCDEF";

		Scanner scan = new Scanner(System.in);

		System.out.print("Input a hexadecimal number: ");
		hexdec_num = scan.nextLine();

		hexdec_num = hexdec_num.toUpperCase();

		for (int i = 0; i < hexdec_num .length(); i++)
		{
			char c = hexdec_num .charAt(i);
			int d = digits.indexOf(c);
			dec_num = 16*dec_num + d;
		}
		System.out.print("Equivalent decimal number is: " + dec_num+"\n");
	}
}
