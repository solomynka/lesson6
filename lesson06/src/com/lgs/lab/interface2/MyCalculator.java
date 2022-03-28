package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {



	@Override
	public void devide(int a, int b) {
		System.out.println(a / b);
	}

	@Override
	public void plus(int a, int b) {
		System.out.println(a + b);
	}

	@Override
	public void minus(int a, double b) {
		System.out.println(a - b);
	}

	@Override
	public void multiply(int a,double b) {
		System.out.println(a * b);
	}

	

}
