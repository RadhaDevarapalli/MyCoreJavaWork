package com.corejava;
public class BankExample{

	public static void main(String[]args){
		String nameOfTheAccountHolderDepositedonMonday="Vinay";
		String nameOfTheAccountHolderDepositedonTuesday="Vinay";
		String nameofTheAccountHolderWithDrawonMonday="vinay";
		nameOfTheAccountHolderDepositedonMonday="radha";
	
		
	   
	    BankExample b=new BankExample();
	    int savingAccountBalance=0;
		savingAccountBalance += b.addMoneyToAccount(nameOfTheAccountHolderDepositedonMonday,"Monday",500);
		System.out.println("savings total balance"+savingAccountBalance);
		savingAccountBalance +=b.addMoneyToAccount(nameOfTheAccountHolderDepositedonTuesday,"Tuesday",10000);
		System.out.println("savings total balance"+savingAccountBalance);
			
	savingAccountBalance -=b.withdrawfromAccount(nameofTheAccountHolderWithDrawonMonday,"Monday",1500);
	System.out.println("savings total balance after withdraw"+savingAccountBalance);
	savingAccountBalance +=b.addMoneyToAccount( nameOfTheAccountHolderDepositedonMonday,"Monday",1000);
	System.out.println("savings total balance"+savingAccountBalance);
	savingAccountBalance -=b.withdrawfromAccount(nameOfTheAccountHolderDepositedonTuesday,"Tuesday",1000);
	System.out.println("Savings total balance transfer from one account to another account"+savingAccountBalance);
	
	}
	public int addMoneyToAccount(String accountholder, String weekday, int money) {
		System.out.println(accountholder +"came to bank on "+weekday+"bearing Account Number"+Integer.toHexString(System.identityHashCode(accountholder))+"and deposited"+money);
		return money;
	}
public int withdrawfromAccount(String accountholdername,String weekday,int money) {
	System.out.println(accountholdername +"came to bank on "+weekday+"bearing account number"+Integer.toHexString(System.identityHashCode(accountholdername))+"and withdraw"+money);
	return money;
}
public int transferMoney(int moneyTransfer,int sourceBalance,int targetBalance) {
	 sourceBalance=sourceBalance-moneyTransfer;
	 return 1000;
}
public boolean  BankExample(int sourceAccountNumber,int targetAccountNumber) {
	if(sourceAccountNumber==10 &&targetAccountNumber==20 ) {
		transferMoney(1000,2000,5000);
	}
	return false;
}
}