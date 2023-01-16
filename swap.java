class swap{
	public static void main(String[]args){
		int a;
		int b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping:"+a+ "" +b);
		
		b=a+b-(a=b);
		System.out.println("After swapping:"+a+ " " +b);
		
	}
}