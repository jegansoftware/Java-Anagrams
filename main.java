//file name should be named as main.java


import java.util.*;
public class main {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String str1;
		String str2;
		int n,n1;
		int i;
		char apply;
		
		
		System.out.printf("\nEnter First Text :");
		str1=in.next();
		System.out.printf("\nEnter Second Text :");
		str2=in.next();
		
		n=str1.length();
		n1=str2.length();
		
		for(i=0;i<n;i++)
		{
			apply=str1.charAt(i);
			if((apply>='a' && apply<='z') || (apply>='A' && apply<='Z'))
			{
				if(i==n-1)
				{
					class1 in1=new class1();
					
					in1.jega(str1,str2);
				}
			}
			else
			{
				System.out.printf("\nCharacters Must be entered");
				System.out.printf("\nNumbers willn't be accepted");
				break;
			}
		}
		
		
		

		for(i=0;i<n1;i++)
		{
			apply=str2.charAt(i);
			if((apply>='a' && apply<='z') || (apply>='A' && apply<='Z'))
			{
				if(i==n-1)
				{
					class1 in1=new class1();
					
					in1.jega(str1,str2);
				}
			}
			else
			{
				System.out.printf("\nCharacters Must be entered");
				System.out.printf("\nNumbers willn't be accepted");
				break;
			}
		}
		
		
		
		
		

	}

}
