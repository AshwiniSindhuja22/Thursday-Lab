package basicprogram;

import java.util.Scanner;

public class ProductNumber {

	public static void main(String[] args)
	{
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		for(i=1;i<=n;i=i+2);
		{
			sum=sum+i;
		}
		System.out.println("the sum of product of natural numbers:" +sum);	
		

	}

}
