import java.util.*;

public class Reversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
    while(num!=0){
        rev=rev*10+num%10; //0*10=0+1234%10=4 //4*10=40+123%10=3 40+3=43
        num/=10;//1234/10=123
    }
    System.out.println("Reversed number is:"+rev);
    }

}
