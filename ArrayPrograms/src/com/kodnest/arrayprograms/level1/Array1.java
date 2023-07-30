package com.kodnest.arrayprograms.level1;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the length of the array: ");
		        int length = scanner.nextInt();
		        System.out.println("Enter the elements of the array:");
		        for (int i=0;i<=10;i++) {
		            System.out.print("Element " + (i) + ": ");
		            array[i] = scanner.nextInt();
		        }

		        System.out.println("Contents of the array:");
		        for (int i = 0; i <=10; i++) {
		            System.out.print(array[i] + " ");
		        }

		        
		        scanner.close();
		    }
		
	}

		        

