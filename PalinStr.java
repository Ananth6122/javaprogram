import java.util.Scanner;
public class PalinStr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String org_str=str;
        String rev="";
        //Using character array
        char a[]=str.toCharArray();
       int len=a.length;
       for(int i=len-1;i>=0;i--){
       rev=rev+a[i];

    }
    if(org_str.equals(rev)){
        System.out.println(org_str+"is a palindrome");
    }
    else{
        System.out.println("Not a palindrome");
    }
}

}
