package com.kittu;

import java.util.Scanner;

public class ElectricityBillTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter units : ");
	    int units = sc.nextInt();
	    double bill = calculateElectricBill(units);
	    System.out.println("Electricity Bill amount = " + bill);
	}
	 public static double calculateElectricBill(int units) {
		 
		    double fixedPrice = 100;
		    double rate1 = 6.30; //  Between 0-100
		    double rate2 = 6.85; //  Between 101-200
		    double Above200 = 7.40; //  above 200
		    
		    if(units <= 100) {
			      return (fixedPrice + units * rate1);
			    }
			    else if(units <= 200) {
			      return ( fixedPrice + (100 * rate1) + (units-100)*rate2);
			    }
			    else {
			      return ( fixedPrice + (100 * rate1) + (100 * rate2) + (units-200) * Above200 );
			}
	  }
}
