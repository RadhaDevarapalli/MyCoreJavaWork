package com.corejava;

public class PanExample {
	public static void main(String[]args) {
		String nameOfThePersonYear1="Vinay";
		String nameOfThePersonYear2="vinay";
		String nameOfThePersonYear3="vinay";
		String nameOfThePersonYear4="vinay";
		String nameofthepersonyear5="vinay";
		
		int year1=2018;
		int year2=2019;
		int year3=2020;
		int year4=2021;
		int year5=2022;
		
		int y1tax=3000;
		int y2tax=5000;
		int y3tax=1000;
		int y4tax=1500;
		int y5tax=2000;
		
		PanExample pe=new PanExample();
		int panAccountTotalMoney=100000;
		
		panAccountTotalMoney  -= pe.WithDrawMoneyOnPanAccount(nameOfThePersonYear1,year1,y1tax);
		System.out.println("Balance amount in vinay pan   " +panAccountTotalMoney);
		
		panAccountTotalMoney -=pe.WithDrawMoneyOnPanAccount(nameOfThePersonYear2, year2, y2tax);
		System.out.println("Balance amount in vinay pan "+panAccountTotalMoney);
		
		panAccountTotalMoney -=pe.WithDrawMoneyOnPanAccount(nameOfThePersonYear3,year3,y3tax);
		System.out.println("Balance amount in vinay pan "+panAccountTotalMoney);
		
		panAccountTotalMoney -=pe.WithDrawMoneyOnPanAccount(nameOfThePersonYear4,year4,y4tax);
		System.out.println("Balance amount in vinay pan "+panAccountTotalMoney);
		
		panAccountTotalMoney -=pe.WithDrawMoneyOnPanAccount(nameofthepersonyear5,year5,y5tax);
		System.out.println("balance amount in vinay pan "+panAccountTotalMoney);
}
	public int WithDrawMoneyOnPanAccount(String name,int year,int  money) {
		System.out.println("Vinay has Withdrawn money"  +money+"in the following year"+year+"with the Pancard no"+Integer.toHexString(System.identityHashCode(name)));
    return money; 		
	}
}