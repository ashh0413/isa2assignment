package two;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number:");
		num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial:"+fact);
	}

}
