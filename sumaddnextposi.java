package logicBuilding;

import java.util.Scanner;

public class sumaddnextposi {
	public static void main(String[] args){
		int num;
		int rem = 0;
		int digit;
		int sum = 0;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int a[]=new int[100];
		int b[]=new int[100];
		while(num>0){
			rem=num%10;
			rem++;
			num=num/10;
		}
		for(int i=0;i<rem;i++){
			rem=a[i];
		}
		for(int j=1;j>=rem;j--){
			rem=a[j]*b[j];
		}
		for(int j=0;j<4;j++){
			 temp =temp+a[sum];
		}
		System.out.println(temp);
	}

}
