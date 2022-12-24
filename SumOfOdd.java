package basicprogram;
import java.util.Scanner;

public class SumOfOdd 
{

	public static void main(String[] args) 
		{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=1;i<=n;i=2);
		{
			sum=sum+i;
		}
		System.out.println("sum of odd numbers "+n+" "+sum);
		
	}

}




