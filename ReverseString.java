package com.corejava;

public class ReverseString {

	public static void main(String[] args) {
		String str="Radha Reddy Vasepalli";
		System.out.println("Length Of Str------>"  +str.length());
		String reversedString="";
		for(int i=str.length()-1;i>-0;i--) {
		reversedString=reversedString+str.charAt(i);
		System.out.println(reversedString);
	
		System.out.println(str.length());
		System.out.println(str.substring(5,21));
		

		}
	}

}
