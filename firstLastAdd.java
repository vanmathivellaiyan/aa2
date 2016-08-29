package guviprogram;

import java.util.Scanner;

public class firstLastAdd {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num;
	int rem[] =new int[10];
	num=sc.nextInt();
	for(int i=0;i<num;i++){
	if(num>0){
		rem[i]=num%10;
		num=num/10;
	}
	}
	System.out.println(rem[0]);
	int len=Integer.toString(num).length();
	
		System.out.println(len);
		System.out.println(rem[0]+len);
		//sto=rem+num+sto;
}
}
