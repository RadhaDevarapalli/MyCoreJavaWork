package com.corejava;

public class SampleNonStaticprogram {
private int j=20;
{
	System.out.println("NonStaticBlock");
}
public void m2()
{
	System.out.println("NonStaticMethod");
}
SampleNonStaticprogram() {
	System.out.println("constructor");
}
public static void main (String[]args) {
	SampleNonStaticprogram ref=new SampleNonStaticprogram();
	ref.m2();
	System.out.println(ref.j);
}
}
