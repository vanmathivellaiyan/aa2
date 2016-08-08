package logicBuilding;

import java.util.Scanner;

public class sumofpow1 {
	public static void main(String[] args){
		int a[]=new int [100];
		int b[]=new int[100];
		int sum=0,digit=0;
		int rem = 0,temp;
		int c;
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		while(sum>0){
			temp=sum%10;
			a[rem]=temp;
			rem++;
			c=c/10;
			}
		for(int i=0;i<c;i++)
		{
			b[i]=1;
		}
		for(int j=0;j<4;j++)
		{
			b[j]=a[j]*b[j];
			System.out.println(b[j]);
		}
		
	}

}
