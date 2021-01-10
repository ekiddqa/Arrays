package com.qa.main;

public class Exercises {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		numbers[0] = 15;
		numbers[1] = 35;
		numbers[2] = 90;
		numbers[3] = 20;
		numbers[4] = 60;
		numbers[5] = 66;
		numbers[6] = 80;
		numbers[7] = 84;
		numbers[8] = 93;
		numbers[9] = 23;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println(numbers[6]);
		System.out.println(numbers[7]);
		System.out.println(numbers[8]);
		System.out.println(numbers[9]);
		
		int[] moreNumbers = new int[20];
		for(int a : moreNumbers) {
			moreNumbers[a] = 1;
			System.out.print(" " + moreNumbers[a]);
		}
	}

}
