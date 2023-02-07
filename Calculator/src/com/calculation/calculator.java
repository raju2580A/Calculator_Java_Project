package com.calculation;

import java.util.Scanner;
import com.addition.*;
import com.division.*;
import com.multipliction.*;
import com.substraction.*;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int choice =0;
Scanner input = new Scanner (System.in);
	
	float n1,n2;
	System.out.println("welcome to calculator project");
	try {
		while( choice !=5)
		{
			System.out.println("\n1 -addition" );
			System.out.println("2 -substraction");
		    System.out.println("3 -multiplication");
			System.out.println("4 -division");
			System.out.println("5 -Exit");
		 
			System.out.println("\n enter your choice");
			
		
			choice =input.nextInt();
			if (choice == 5)
			{
				System.out.println("\n Thanks for using");
			System.exit(0);
			}
		if(choice >0 && choice <=5) {
			System.out.println("\n enter first value");
       n1 = input.nextFloat();
       
       System.out.println("\n enter second value");
       n2 =input.nextFloat();	
			
         if (choice ==1) {
    	   System.out.println("sum :" + addition.addition(n1, n2));
       }
       else if(choice ==2) {
    	   System.out.println("substraction :" + substraction.substraction(n1, n2));
       }
       
       else if (choice ==3) {
    	   
		System.out.println("multiplication :" + multipliction.multipliction(n1,n2));
    	   
       }
       else if (choice == 4) {
    	   System.out.println("division :"+ division.division(n1, n2));
       }
		}
       else {
    	   System.out.println("plese select the available choice");
       }
		}
	}
	
       catch (Exception ex) {
    	   System.out.println("\n error" + ex.toString() + "Occurd");
       }
	
	
}

}
