package basicprogram;
import java.util.Scanner;
public class MulttiplicationTable {

	public static void main(String[] args) 
	{
		int product=1,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			product=n*i;
			System.out.println(n+"x" +i+ "=" +product);

			
		}

	}

}
