package logicBuilding;
public class sumofdigit {
		public static int output1;
		public static void main( String [] args ) {
		userMethod( 12345 );
		System.out.println( output1 ); 
		}
		public static void userMethod( int input1 ) {
		int n;
int rem,tmp;
int k=0;
int b[]=new int[100];
int e[]=new int[100];
int count=0,sum=0;
System.out.println("enter the number");
tmp=input1;
while(tmp>0){
	rem=tmp%10;
	b[count]=rem;
	count++;
	tmp=tmp/10;
}
for(int i=count-1;i>=0;i--){
	e[i]=k+b[i];
	System.out.println(e[i]);
	k=e[i];
}
for(int j=count-1;j>=0;j--){
	sum=sum+e[j];
}
	System.out.println("sum="+sum);

	}
}
