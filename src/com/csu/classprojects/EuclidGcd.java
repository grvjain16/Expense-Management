package com.csu.classprojects;

import java.util.Scanner;

public class EuclidGcd    
{
    public long gcd(long m, long n)
    {
        if (m % n == 0)
            return n;
        return gcd(n, m % n);
    }
    @SuppressWarnings("resource")
	public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Euclid GCD Algorithm Test\n");
        EuclidGcd eg = new EuclidGcd();
 
        System.out.println("Enter two integer numbers\n");
        long n1 = input.nextLong();
        long n2 = input.nextLong();
        long gcd = eg.gcd(n1, n2);
        System.out.println("\nGCD of "+ n1 +" and "+ n2 +" = "+ gcd);
    }
}
