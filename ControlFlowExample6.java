package com.corejava;

public class ControlFlowExample {

    public String weekDayNumbersWithMultipleConditions(int weekDayNumberOne,int weekDayNumberTwo ){
        if((weekDayNumberOne == 1 || weekDayNumberOne == 5) && (weekDayNumberTwo == 2 || weekDayNumberTwo == 3)){
            return "Tuesday";
        } else if (weekDayNumberOne == 1) {
            return "Wednesday";

        } else{
            return "Sunday";
        }

    }
//2 1 2 6 7

    // 1 1 2 2 6
    public static void main(String[] args) {
        ControlFlowExample cfe = new ControlFlowExample();
       System.out.println(cfe.weekDayNumbersWithMultipleConditions(1,7));


    }








}
