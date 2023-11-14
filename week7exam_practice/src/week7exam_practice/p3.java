package week7exam_practice;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter height: ");
		int height = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= height; i++) {
			if (i!=height) {
				left_tab(i);
				System.out.print("*");
				right_tab(height, i);
				System.out.print(" * ");
			} else {
				left_tab(i);
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}

	private static void right_tab(int height, int i) {
		for (int j = height; j > i; j--) {
			System.out.print("  ");
		}
	}

	private static void left_tab(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print(" ");
		}
	}

}
