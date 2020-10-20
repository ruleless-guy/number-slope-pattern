package com.asg.app;

public class Main {
	public static void main(String[] args) {
		
		int num = 5;
		
		for(int i = 1; i <= num; i++) {
			for(int ii = 1; ii <= i; ii++) {
				System.out.print(ii);
			}
			System.out.println();
		}
	}
}
