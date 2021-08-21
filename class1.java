//File name should be named as class1.java
public class class1 {
int a4[]=new int[26];
int a5[]=new int[26];
	
	public void jega(String a,String b)
	{
		int n;
		int n1;
		int i;
		char a1;
		
		n=a.length();
		n1=b.length();
		
		///Compare value 
		
	if(n==n1)
	{
				for(i=0;i<n;i++)
				{
					a1=a.charAt(i);
					
					if(a1=='a'||a1=='A')
					{
						a4[0]++;
					}
					else if(a1=='b' || a1=='B')
					{
						a4[1]++;
					}
					else if(a1=='c' || a1=='C')
					{
						a4[2]++;
					}
					else if(a1=='d' || a1=='D')
					{
						a4[3]++;
					}
					else if(a1=='e' || a1=='E')
					{
						a4[4]++;
					}
					else if(a1=='f' || a1=='F')
					{
						a4[5]++;
					}
					else if(a1=='g' || a1=='G')
					{
						a4[6]++;
					}
					else if(a1=='h' || a1=='H')
					{
						a4[7]++;
					}
					else if(a1=='i' || a1=='I')
					{
						a4[8]++;
					}
					else if(a1=='J' || a1=='j')
					{
						a4[9]++;
					}
					else if(a1=='K' || a1=='k')
					{
						a4[10]++;
					}
					else if(a1=='L' || a1=='l')
					{
						a4[11]++;
					}
					else if(a1=='M' || a1=='m')
					{
						a4[12]++;
					}
					else if(a1=='N' || a1=='n')
					{
						a4[13]++;
					}
					else if(a1=='O' || a1=='o')
					{
						a4[14]++;
					}
					else if(a1=='p' || a1=='P')
					{
						a4[15]++;
					}
					else if(a1=='q' || a1=='Q')
					{
						a4[16]++;
					}
					else if(a1=='r' || a1=='R')
					{
						a4[17]++;
					}
					else if(a1=='S' || a1=='s')
					{
						a4[18]++;
					}
					else if(a1=='t' || a1=='T')
					{
						a4[19]++;
					}
					else if(a1=='u' || a1=='U')
					{
						a4[20]++;
					}
					else if(a1=='V' || a1=='v')
					{
						a4[21]++;
					}
					else if(a1=='W' || a1=='w')
					{
						a4[22]++;
					}
					else if(a1=='x' || a1=='X')
					{
						a4[23]++;
					}
					else if(a1=='y' || a1=='Y')
					{
						a4[24]++;
					}
					else if(a1=='Z' || a1=='z')
					{
						a4[25]++;
					}
				}
				
				
				for(i=0;i<n;i++)
				{
					a1=b.charAt(i);
					
					if(a1=='a'||a1=='A')
					{
						a5[0]++;
					}
					else if(a1=='b' || a1=='B')
					{
						a5[1]++;
					}
					else if(a1=='c' || a1=='C')
					{
						a5[2]++;
					}
					else if(a1=='d' || a1=='D')
					{
						a5[3]++;
					}
					else if(a1=='e' || a1=='E')
					{
						a5[4]++;
					}
					else if(a1=='f' || a1=='F')
					{
						a5[5]++;
					}
					else if(a1=='g' || a1=='G')
					{
						a5[6]++;
					}
					else if(a1=='h' || a1=='H')
					{
						a5[7]++;
					}
					else if(a1=='i' || a1=='I')
					{
						a5[8]++;
					}
					else if(a1=='J' || a1=='j')
					{
						a5[9]++;
					}
					else if(a1=='K' || a1=='k')
					{
						a5[10]++;
					}
					else if(a1=='L' || a1=='l')
					{
						a5[11]++;
					}
					else if(a1=='M' || a1=='m')
					{
						a5[12]++;
					}
					else if(a1=='N' || a1=='n')
					{
						a5[13]++;
					}
					else if(a1=='O' || a1=='o')
					{
						a5[14]++;
					}
					else if(a1=='p' || a1=='P')
					{
						a5[15]++;
					}
					else if(a1=='q' || a1=='Q')
					{
						a5[16]++;
					}
					else if(a1=='r' || a1=='R')
					{
						a5[17]++;
					}
					else if(a1=='S' || a1=='s')
					{
						a5[18]++;
					}
					else if(a1=='t' || a1=='T')
					{
						a5[19]++;
					}
					else if(a1=='u' || a1=='U')
					{
						a5[20]++;
					}
					else if(a1=='V' || a1=='v')
					{
						a5[21]++;
					}
					else if(a1=='W' || a1=='w')
					{
						a5[22]++;
					}
					else if(a1=='x' || a1=='X')
					{
						a5[23]++;
					}
					else if(a1=='y' || a1=='Y')
					{
						a5[24]++;
					}
					else if(a1=='Z' || a1=='z')
					{
						a5[25]++;
					}
				}
				
			
				if((a4[0]==a5[0]) && (a4[1]==a5[1]) && (a4[2]==a5[2]) &&  (a4[3]==a5[3])  && (a4[4]==a5[4]) &&
						(a4[5]==a5[5]) && (a4[6]==a5[6]) && (a4[7]==a5[7]) &&  (a4[8]==a5[8])  && (a4[9]==a5[9]) &&
						
						(a4[10]==a5[10]) && (a4[11]==a5[11]) && (a4[12]==a5[12]) &&  (a4[13]==a5[13])  && (a4[14]==a5[14])&&
						
						(a4[15]==a5[15]) && (a4[16]==a5[16]) && (a4[17]==a5[17]) &&  (a4[18]==a5[18])  && (a4[19]==a5[19]) &&
						
						(a4[20]==a5[20]) && (a4[21]==a5[21]) && (a4[22]==a5[22]) &&  (a4[23]==a5[23])  && (a4[24]==a5[24]) 
						
						&&(a4[25]==a5[25])
						)
				{
					
					System.out.printf("\nIt is an Anagrams");
				}
				else 
				{
					System.out.printf("\nIt isn't an Anagrams");
				}
				
	}
	else 
	{
		System.out.printf("\nIt is not an Anagrams");
	}
		
				
	}

}
