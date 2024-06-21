import java.util.Scanner;

public class LargestOf3Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first num:");
        int a=sc.nextInt();
        System.out.println("Enter second num:");
        int b=sc.nextInt();
        System.out.println("Enter third num:");
        int c=sc.nextInt();
        int largest1=a>b?a:b;
        int largest2=largest1>c?largest1:c;
        System.out.println(largest2+"is a largest number");
        
    }
    
}
