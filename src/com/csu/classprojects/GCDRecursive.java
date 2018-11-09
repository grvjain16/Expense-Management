package com.csu.classprojects;

import java.util.Scanner;

public class GCDRecursive {

    public static void main(String[] args) {
    	
    	
    	Scanner input = new Scanner(System.in);
        System.out.println("Euclid GCD Algorithm Test\n");
 
        System.out.println("Enter two integer numbers\n");
        long n1 = input.nextLong();
        long n2 = input.nextLong();
    	
    	
        long hcf = gcdNoRecursive(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
    }

    public static long gcdNoRecursive(long p, long q) {
        while (q != 0) {
            long temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
}
