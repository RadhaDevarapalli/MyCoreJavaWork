package com.corejava;

public class PrimitiveDataTypesExample {
	
public static void main(String[]args) {
	byte b1=10;
	byte b2=10;
	int i1=100;
	short s1=30;
	long l1=20l;
	float f1=30;
	float f2=30.5f;
	float f3=(float)30.5;
	float f4=5f/3f;
	double d1=25d;
	double d2=5f/3f;
	byte b3=(byte)(b1+b2);
	byte b4=(byte)(b1+i1);
	byte b5=(byte)(b1+s1);
	byte b6=(byte)(b1+l1);
	byte b7=(byte)(b1+f1);
	byte b8=(byte)128;
	byte b9=(byte)129;
	byte b10=(byte)257;
	char c='\u0039';
	boolean b = false;
	System.out.println(!b);
	System.out.println("b3"+b3);
	System.out.println("b4"+b4);
	System.out.println("b5"+b5);
	System.out.println("b6"+b6);
	System.out.println("b7"+b7);
	System.out.println("b8"+b8);
	System.out.println("b9"+b9);
	System.out.println("b10"+b10);
	System.out.println("f2"+f2);
	System.out.println("f3"+f3);
	System.out.println("f4"+f4);
	System.out.println("d1"+d1);
	System.out.println("d2"+d2);
	System.out.println(c);
}
}	
