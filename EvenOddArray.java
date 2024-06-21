import java.util.*;
class EvenOddArray{
	public static void main(String[]args){
		int a[]={1,2,3,6,90};
		System.out.println("Even numbers in array...");
		for(int value:a){
			if(value%2==0)
				System.out.println(value);
			}
		System.out.println("Odd numbers in array....");
		for(int value:a){
			if(value%2!=0)
				System.out.println(value);
			}
		}
	}