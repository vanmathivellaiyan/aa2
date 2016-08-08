package aa;

import java.util.Scanner;

public class pyramid {
	private static Scanner reader;

	public static void main(String[] args)
	{
		int num,temp=0,horzCounter=0,tempNext=0;
		reader = new Scanner(System.in);
		num=reader.nextInt();
		//num=num;
		for(int countVer=0;countVer<num;countVer++)
		{
			temp=tempNext;			
			horzCounter++;
			for(int countSpace=0;countSpace<num-countVer-1;countSpace++)
			{				
				System.out.print("  ");
			}			
			for(int countHorz=0;countHorz<horzCounter;countHorz++)
			{				
				{	
					if(countHorz<=(horzCounter)/2)/*&&(horzCounter%2!=0))||((countHorz==((horzCounter)/2)+1)&&(horzCounter%2==0))*/
					{
						temp++;
						if(temp==10)
						{
							temp=0;
						}						
						System.out.print((temp)+" ");
						if(countHorz==((horzCounter)/2)/*&&(horzCounter%2!=0))||((countHorz==((horzCounter)/2)-1)&&(horzCounter%2==0))*/)
						{
							tempNext=temp;
						}						
					}
					else
					{
						temp--;
						if(temp<0)
						{
							temp=9;
						}					
						System.out.print((temp)+" ");
						
					}					
				}
			}						
			System.out.println();
			horzCounter++;
		}
	}
}



