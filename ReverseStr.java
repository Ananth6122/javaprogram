
import java.util.*;
public class ReverseStr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev="";
        //Using character array
        char a[]=str.toCharArray();
        int len=a.length;
        for(int i=len-1;i>=0;i--){
            rev=rev+a[i];
        }
        System.out.println("Reversed string:"+rev);
    }

}
