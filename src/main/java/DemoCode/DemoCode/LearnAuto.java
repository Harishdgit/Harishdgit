package DemoCode.DemoCode;

import java.util.Scanner;

public class LearnAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hash");
		
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int i=0;i<=rows ;i++) {
			for(int j=rows-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i ;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
