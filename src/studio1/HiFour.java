package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("HI!! What is your name??");
		String s0 = in.nextLine();
		System.out.println("Greetings " + s0 + "!");
		String s1 = in.nextLine();
		System.out.println("Greetings " + s0 + " and " + s1 );
		String s2 = in.nextLine();
		System.out.println("Greetings " + s0 + ", " + s1 + ", and "+ s2);
		String s3 = in.nextLine();
		System.out.println("Greetings " + s0 + ", " + s1 + ", " + s2 +", and " + s3);
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
