package five;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num1,num2,num3,count=0,output=0,digit,a;
		
		System.out.print("Enter the number:");
		num1=scan.nextInt();
		num2=num1;
		num3=num1;
		while(num2>0)
		{
			count++;
			num2/=10;
		}
		while(num3>0)
		{
			a=1;
			digit=num3%10;
			for(int i=1;i<=count;i++)
			{
				a=a*digit;
			}
			output=output+a;
			num3/=10;
		}
		if(num1==output)
		{
			System.out.println("It is a armstrong");
		}
		else
		{
			System.out.println("It is not a armstrong");
		}
		
	}

}
