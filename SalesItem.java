/*
Calculate the average sales based on the given input format. 
The program should take input in the form of a vector of items, 
where each item consists of a name (string), price (double), and quantity (integer). 
Implement a function calculateAverageSales that calculates 
and returns the average sales of the items.
*/

package com.sujeet.NQT24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item{
	String name;
	double price;
	int quantity;
	
	public Item(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
}

public class SalesItem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Item> items = new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter item name: ");
			String name = sc.next();
			System.out.println("Enter Price: ");
			double price = sc.nextDouble();
			System.out.println("Enter quantity: ");
			int quantity = sc.nextInt();
			
			items.add(new Item(name,price,quantity));
		}
		double avgSales = calculateAverageSales(items);
		System.out.println("Average Sales: "+avgSales);
	}

	private static double calculateAverageSales(List<Item> items) {
		double totalSale = 0;
		int totalItems = items.size();
		
		for(Item item: items) {
			totalSale += item.price * item.quantity;
		}
		
		return totalItems > 0 ? totalSale/totalItems : 0;
	}
}
