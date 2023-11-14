package week7exam_practice;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int decimal_number = scanner.nextInt();
		scanner.close();
		boolean run=true;
		int[] binary_number = new int[32];
		int index_counter=0;
		while (run) {
			if(index_counter==binary_number.length-1||decimal_number==0||decimal_number==1) {
				run=!run;
			}
			if (decimal_number%2==0) {
				binary_number[index_counter]=0;
			}else {			
				binary_number[index_counter]=1;
			}
			decimal_number/=2;
			index_counter+=1;
		}
		System.out.println();
		int limiter=0;
		for (int i = binary_number.length-1; i >0; i--) {
			if (binary_number[i]==0) {
				limiter=i;
			} else {
				i=0;
			}
		}
		System.out.print("Binary: ");
		for (int i = 0; i < limiter; i++) {
			System.out.print(binary_number[i]+" ");
		}
	}

}
