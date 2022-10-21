package interview;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		String str="abhishek is a good boy";
		String rev="";
		//breaking the sentence into words
		String s[]=str.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println(s[0]);
		
		//Adding the words stored in the array to the last
		for (int i = 0; i < s.length; i++) {
			rev=s[i]+" "+rev;
		}
		//printing the reversed sentence
		System.out.print(rev);
		System.out.println("hello");
	}

}
