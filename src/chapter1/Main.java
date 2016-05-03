package chapter1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int c = (int) (h-32)*5/9;
		System.out.println(c);
	}

}
