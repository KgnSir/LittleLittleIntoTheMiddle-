

import java.util.Random;
import java.util.Scanner;

public class janken {

public static void main(String[] args) {
		
		int sen,pc;
		
		Random rnd=new Random();
		pc=rnd.nextInt(5)+1; 
		System.out.println("pc"+pc);
		System.out.println("1.taş");
		System.out.println("2.kağıt");
		System.out.println("3.makas");
		System.out.println("4.kertenkele");
		System.out.println("5.spock");
		System.out.println("Lütfen seçiminizi yapınız");
		Scanner gelenioku=new Scanner(System.in);
		sen=gelenioku.nextInt();
		if(sen!=1 && sen!=2 && sen!=3 && sen!=4 && sen!=5)
		{
			System.out.println("yanlış seçim yaptın.");
		}
		else 
		{ 
		
			if(pc==sen)
			{
				System.out.println("berabere");
			}
			if(pc==1 &&sen==2)
			{
				System.out.println("ben kazandın");
			}
			if(pc==1 && sen==3)
			{
				System.out.println("pc kazandın");
			}			
			if(pc==1 && sen==4)
			{
				System.out.println("pc kazandın");
			}
			if(pc==1 && sen==5)
			{
				System.out.println("ben kazandın");
			}				
			if(pc==2 && sen==1)
			{
				System.out.println("pc kazandın");
			}			
			if(pc==2 && sen==3)
			{
				System.out.println("ben kazandın");
			}
			
			if(pc==2 && sen==4)
			{
				System.out.println("ben kazandın");
			}
			if(pc==2 && sen==5)
			{
				System.out.println("pc kazandın");
			}				
			if(pc==3 && sen==1)
			{
				System.out.println("ben kazandı");
			}
			if(pc==3 && sen==2)
			{
				System.out.println("pc kazandın");
			}
			if(pc==3 && sen==4)
			{
				System.out.println("pc kazandın");
			}
			if(pc==3 && sen==5)
			{
				System.out.println("ben kazandın");
				
				
			}
			if(pc==4 && sen==1)
			{
				System.out.println("ben kazandın");
			}
			if(pc==4 && sen==2)
			{
				System.out.println("pc kazandın");
			}
			if(pc==4 && sen==3)
			{
				System.out.println("ben kazandın");
			}
			if(pc==4 && sen==5)
			{
				System.out.println("pc kazandın");
			}	
			if(pc==5 && sen==1)
			{
				System.out.println("pc kazandın");
			}
			if(pc==5 && sen==2)
			{
				System.out.println("ben kazandın");
			}
			if(pc==5 && sen==3)
			{
				System.out.println("pc kazandın");
			}
			if(pc==5 && sen==4)
			{
				System.out.println(" ben kazandın");
			}
			
		}
		
		
		
		
		
		

	}

}
