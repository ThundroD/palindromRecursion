package palindromRecursion;
import java.io.*;

public class PalindromRecursion {
//Recursive function which returns 1 if it is a palindrom, 0 if not
	static int isPalindrom(int arr[], int begin, int end) {
		if(begin >= end) {
			return 1;
		}
		if(arr[begin] == arr[end]) {
			return isPalindrom(arr, begin + 1, end - 1);
		}
		else {
			return 0;
		}
	}
	//initial array with System out print
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,2,1}; //array
		int n = intArray.length; //array length
		//if else statement to find if array is palindrom
		if(isPalindrom(intArray, 0, n-1) == 1) {
			System.out.println("It is a palindrome.");
			}
		else {
			System.out.println("It is not a palindrome.");
		}
	}
}
	




