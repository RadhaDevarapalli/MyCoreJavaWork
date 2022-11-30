package com.corejava;

public class ControlFlowExample {

    public String weekDayNumbersWithMultipleConditions(int weekDayNumberOne,int weekDayNumberTwo ){
        if(weekDayNumberOne == 1 && weekDayNumberTwo == 2){
            return "Monday";
        } else if (weekDayNumberOne == 5 || weekDayNumberTwo == 6) {
            return "Tuesday";

        } else{
            return "Sunday";
        }

    }
//2 1 2 6 7

    // 1 1 2 2 6
    public static void main(String[] args) {
        ControlFlowExample cfe = new ControlFlowExample();
       System.out.println(cfe.weekDayNumbersWithMultipleConditions(4,7));


    }








}
