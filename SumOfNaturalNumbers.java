package basicprogram;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num,sum=0;
	System.out.println("Enter range:");
	
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			sum=sum+1;
		}
		System. out.println("sum of natural numbers of range"+num+":"+sum);
		
		 			
		}


	}


