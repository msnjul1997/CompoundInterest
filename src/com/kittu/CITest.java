package com.kittu;

import java.util.Scanner;

public class CITest {

	public static void main(String[] args) {

		double p, r, t, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Investment: ");
		p = sc.nextDouble();

		System.out.println("Enter the Annual Rate of interest : ");
		r = sc.nextDouble();
		r = r / 100;

		System.out.println("Enter the Time period : ");
		t = sc.nextDouble();

		System.out.println("Enter the number of times that interest is compounded per year");
		n = sc.nextDouble();

		sc.close();

		double Amount = p * Math.pow(1 + (r / n), n * t);
		double Compoundinterest = Amount - p;
		System.out.println("Compound Interest after " + t + " years: " + Compoundinterest);
		System.out.println("Amount after " + t + " years: " + Amount);
	}

	/*
	 * public void calculate(int p, int t, double r, int n) { double Amount = p *
	 * Math.pow(1 + (r / n), n * t); double cinterest= Amount-p;
	 * System.out.println("Compound Interest "+t+"years: "+cinterest);
	 * System.out.println("Amount after "+t+"years: "+Amount); } public static void
	 * main(String[] args) { CITest c=new CITest(); c.calculate(5000, 5, 10, 12); }
	 */
}
