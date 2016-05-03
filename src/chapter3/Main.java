package chapter3;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * author: leslie
 * date: 3 May 2016
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int absN = Math.abs(n);
		int digit = absN%10;
		int countDigit = 1;
		int tempCount = 1;
		int leftSum = 0;
		ArrayList num = new ArrayList();
		String wholeProu="";
		if(n == 0){
			System.out.println("ling");
		}else{
			while(leftSum != absN){
				num.add(digit);
				//System.out.println("num has digit " + digit);
				leftSum = leftSum + digit*tempCount;
				tempCount = tempCount*10;
				digit = (absN - leftSum)/tempCount%10;
				//System.out.println("digit is " + digit +" leftSum is " + leftSum + " tempCount is " + tempCount);
				
			}
			for(int i = num.size()-1; i>=0; i--){
				wholeProu = wholeProu + pronunciation((int) num.get(i)) + " ";
			}
			wholeProu = wholeProu.trim();
			if(n<0){
				System.out.println("fu " + wholeProu);
			}else{
				System.out.println(wholeProu);
			}
			
		}
		

	}
	
	private static String pronunciation(int digit){
		String pronDigit = null;
		switch(digit){
		case 0:
			pronDigit = "ling";
			break;
		case 1:
			pronDigit = "yi";
			break;
		case 2:
			pronDigit = "er";
			break;
		case 3:
			pronDigit = "san";
			break;
		case 4:
			pronDigit = "si";
			break;
		case 5:
			pronDigit = "wu";
			break;
		case 6: 
			pronDigit = "liu";
			break;
		case 7:
			pronDigit = "qi";
			break;
		case 8:
			pronDigit = "ba";
			break;
		case 9:
			pronDigit = "jiu";
			break;
		}
		return pronDigit;
	}
	
}

/*
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int countPrime = 1;
		int sum = 0;
		int i = 2;
		while(countPrime <= m){
			if(isPrime(i)){
				if(countPrime >= n && countPrime <= m){
					sum = sum + i;
				}
				countPrime = countPrime + 1;
			}
			
			i++;
		}
		
		System.out.println(sum);

	}
	
	private static boolean isPrime(int testNum){
		for(int i = 2; i < testNum; i++){
			if(testNum % i == 0){
				return false;
			}
		}
		return true;
	}
	
}

*/
/*
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int count = 1;
		int digit = i%10;
		ArrayList consistency = new ArrayList();
		int digitCount = 1;
		int tempSum = 0;
		while(digit != 0){
			tempSum = tempSum + digit * count;
			if(isOdd(digitCount) == isOdd(digit)){
				consistency.add(1);
			}else{
				consistency.add(0);
			}
			digit = (i - tempSum)/(10*count)%10;
			count = count*10;
			digitCount++;
		}
		int sum = 0;
		int tempCount = 1;
		for(int j = 0; j < consistency.size(); j++){
			int k = (int) consistency.get(j);
			sum = sum + k*tempCount;
			tempCount = tempCount * 2;
		}
		System.out.println(sum);

	}
	
	private static boolean isOdd(int i){
		if(i%2 == 0){
			return false;
		}else{
			return true;
		}
	}
	
}
*/
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int countOdd = 0;
//		int countEven = 0;
//		int i = in.nextInt();
//		while(i != -1){
//			if(isOdd(i)){
//				countOdd++;
//			}else{
//				countEven++;
//			}
//			i = in.nextInt();
//		}
//		System.out.println(countOdd + " " + countEven);
//
//	}
//	private static boolean isOdd(int i){
//		if(i%2 == 0){
//			return false;
//		}else{
//			return true;
//		}
//	}
//}
