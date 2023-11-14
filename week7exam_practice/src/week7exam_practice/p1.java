package week7exam_practice;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of char: ");
		int counter = scanner.nextInt();
		System.out.print("Enter a char: ");
		char printable_char = scanner.next().charAt(0);
		scanner.close();
		for (int i = 0; i < counter; i++) {
			for (int j = 0; j < (int) (Math.random()*10); j++) {
				System.out.print("_");
			}
			System.out.print(printable_char);
		}
	}

}
