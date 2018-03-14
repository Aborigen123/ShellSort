package shellSort;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();		
				
		int  r, n = 0;

		System.out.println("Enter the number of array elements:");

		n = sc.nextInt();

				int[] array = new int[n];
				
				System.out.println("Enter the number to which the range of random numbers will be added (by default from 0 to the number you lead)");
				r = sc.nextInt();
				
				System.out.println("Here is your array of" +n+ " array elements");
				
				for(int i = 0; i<n; i++){
					array[i] = rand.nextInt(r);
		 	
				System.out.println(array[i]);
			}
				System.out.println("Sorted");
				
				int[] a = ShellSort(array);
				
				 for(int i = 0; i<a.length; i++){
					 System.out.println(a[i]);
				 }
	}
	

	 public static int[] ShellSort(int[] arr) {
		    int inner, outer;
		    int temp;
		 
		    int h = 1;
		    while (h <= arr.length / 3) {
		      h = h * 3 + 1;
		    }
		    while (h > 0) {
		      for (outer = h; outer < arr.length; outer++) {
		        temp = arr[outer];
		        inner = outer;
		 
		        while (inner > h - 1 && arr[inner - h] >= temp) {
		        	arr[inner] = arr[inner - h];
		          inner -= h;
		        }
		        arr[inner] = temp;
		      }
		      h = (h - 1) / 3;
		    }
			return arr;
	 }}
	 
	 
	