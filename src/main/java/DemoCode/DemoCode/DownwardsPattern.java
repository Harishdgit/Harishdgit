package DemoCode.DemoCode;

import java.util.Arrays;
import java.util.Scanner;

public class DownwardsPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int k=rows-i;k>0;k--) 
			{
				System.out.print("  ");
		    }
			for(int j=1;j<i;j++) 
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		
		}
		
	}

}
