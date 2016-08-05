package guviprogram;

import java.util.Scanner;

public class givennoprint {
	public static void main(String[] args){
		int num;
		int sum = 0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=0;i<=num;i++){
			sum+=i;
		}
		System.out.println(sum);
	}

}
