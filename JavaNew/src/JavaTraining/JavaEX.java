package JavaTraining;

import java.util.Scanner;

public class JavaEX {

	public static void main(String[] args) {

		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int i = sc.nextInt();

		if (i % 2 == 0) {
			System.out.println("even number " + i);

		} else {
			System.out.println("odd number");
		}

	}

}
