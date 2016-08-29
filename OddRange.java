package logicBuilding;

import java.util.Scanner;

public class OddRange {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int hh=0;
	int sum=0;
	int[] num=new int[10];
	for(int i=0;i<num.length;i++){
		num[i]=sc.nextInt();
	}
	for(int j=0;j<num.length;j++){
		if(num[j]%2!=0){
			hh=num[j];
			System.out.println(hh);
			sum=sum+hh;
		}
	}
	System.out.println(sum);
}
}
