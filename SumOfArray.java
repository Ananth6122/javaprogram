public class SumOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,14};
        int sum=0;
       /* for(int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }*/
        //Enhanced For loop
        for(int val:a){
			sum=sum+val;
			}
        System.out.println("Sum of array is:"+sum);
    }

}