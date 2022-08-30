package DemoCode.DemoCode;

import java.util.Scanner;

public class NewPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number of Rows");
		int rows = sc.nextInt();
		int first =0;
		int Second =1;
		int sum ;
		for(int i=0;i<10;i++) {
			sum = first  + Second;
			System.out.print(first+" ");
			first = Second;
			Second =  sum ;
		}
		System.out.println();
          System.out.println(Abc.x);
	}

}


class Abc{
	public static  int x=20;
	
	static {
		System.out.println("We are working ");
	}
	
}