package com.code;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GiftCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch,weightOfSweet=0;
		List<String> listOfChocolate=new ArrayList<String>();
		List<String> listOfSweet=new ArrayList<String>();
		
		while (true) {
			System.out.println("\n1. Collect chocolate");
			System.out.println("2. Collect sweet");
			System.out.println("3. Sort chocolate");
			System.out.println("4. Show chocolates");
			System.out.println("5. Show sweets (upto specified weight)");
			System.out.println("6. Exit");
			
			System.out.println("Enter choice :");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter chocolate name :");
				String chocolateName=sc.next();
				Chocolate chocolate=new Chocolate(chocolateName);
				listOfChocolate.add(chocolate.getName());
				break;
			case 2:
				System.out.println("Enter sweet name :");
				String sweetName=sc.next();
				Sweet sweet=new Sweet(sweetName);
				listOfSweet.add(sweet.getName());
				++weightOfSweet;
				break;
			case 3:
				Collections.sort(listOfChocolate);
				break;
			case 4:
				System.out.println("Chocolates are :");
				for(String al:listOfChocolate)
					System.out.println(al);
				break;
			case 5:
				System.out.println("Enter weight limit :");
				int maxWeight=sc.nextInt(),startLimit=0;
				System.out.println("Sweets are :");
				for(String al:listOfSweet) {
					System.out.println(al);
					++startLimit;
					if(startLimit==maxWeight)
						break;
				}
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Wrong Choice!");
			}
		}
	}
}