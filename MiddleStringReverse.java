package strings;

import java.util.Scanner;

public class MiddleStringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		String str = sc.nextLine();

		String[] words = str.split(" ");

		int mid = (words.length)/2;

		String rev= "";
		
		for(int i = 0;i<words.length;i++) {
			if(i == mid && words.length>1) {
				for(int j=words[mid].length()-1;j>=0;j--) {
					rev = rev + words[mid].charAt(j);
				}
				words[mid] = rev;
			}
		}
		for(int k =0;k<words.length;k++)
			System.out.print(words[k]+" ");
	}

}
