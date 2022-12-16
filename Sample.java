package com.corejava;

public class Sample {
	private static int i = 20;
	int j = 30;
	static {
		System.out.println("StaticBlock");
	}
	{
		System.out.println("NonStaticBlock");
	}

	static void m1() {
		System.out.println("StaticMethod");
	}

	void m2() {
		System.out.println("NonStaticMethod");
	}

	Sample() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		m1();
		Sample s = new Sample();
		s.m2();
		System.out.println(i);
		System.out.println(s.j);

	}
}