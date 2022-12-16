package com.corejava;

public class Samplestaticprogram {
private static int i=20;{
	System.out.println("static block");
}
public static void m1() {
	System.out.println("static method");
}
public static void main(String[]args) {
	System.out.println("main method");
m1();
System.out.println(i);
}
}
