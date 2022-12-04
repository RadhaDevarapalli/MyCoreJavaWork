package com.corejava;

public class Human{
	private int eyes=2;
	private int legs=2;
	private int hands=2;
	private int nose=1;
	private static int mouth=1;
	private int ears=2;
public void eating() {
	
		System.out.println("Iam eating with "+mouth+"mouth");
	}

public void sleeping() {
	System.out.println("Iam sleeping");
}
public void talking() {
	System.out.println("Iam talking");
}
public void running() {
	System.out.println("Iam running "+mouth);
}
Human(){
	System.out.println("constructor");
}
public static void main(String[]args){
	Human human=new Human();
human.sleeping();
human.running();
human.talking();
System.out.println("human has how many eyes  ?  "+ human.eyes);
System.out.println("human legs"+human.legs);
System.out.println(human.hands);
System.out.println(human.nose);
System.out.println(human.ears);
System.out.println(mouth);
}
}
