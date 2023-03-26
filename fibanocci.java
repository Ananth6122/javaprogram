import java.util.*;
public class fibanocci
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a= 0, b = 1;
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();   
        System.out.println("First " + n + " terms of fibonnaci series: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = a+b;
            a=b;
            b=sum;
        }
    }
}
