package DemoCode.DemoCode;

import java.util.Scanner;

public class StringRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String word = sc.next();
		if(sentence.contains(word)) {
			sentence = sentence.toLowerCase().replace(word, "");
		}
		System.out.println(sentence);
	}

}
