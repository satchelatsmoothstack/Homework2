package com.homework2;
import java.util.*;

public class Questsion1 {

	public static void main( String args[] ){
		try {
			Scanner sc = new Scanner(System.in);	
			System.out.print("Choose a random number: ");
			int choice = sc.nextInt();
			int total_sum = 0;
			total_sum += choice;
			System.out.println("Current Total: " + total_sum);
			while(true){
				System.out.print("Choose a random number: ");
				choice=sc.nextInt();			
				total_sum += choice;
				System.out.println("Current Total: " + total_sum);
				}
			} 
		catch(InputMismatchException e){
			System.out.println("Please only enter integers");
				}
			}
}


