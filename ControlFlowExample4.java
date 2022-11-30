package com.corejava;

public class ControlFlowExample {

    public String weekDayNumbersWithMultipleConditions(int weekDayNumber){
        if(weekDayNumber == 1 || weekDayNumber == 2){
            return "Monday";
        }
        else if (weekDayNumber == 3 || weekDayNumber == 4){
            return "Tuesday";
        }

        else if (weekDayNumber == 4){
            return "Wednesday";
        }
        else if (weekDayNumber == 5){
            return "Saturday";
        }
        else{
            return "Sunday";

        }

    }
//2 1 2 6 7

    // 1 1 2 2 6
    public static void main(String[] args) {
        ControlFlowExample cfe = new ControlFlowExample();
       System.out.println(cfe.weekDayNumbersWithMultipleConditions(1));
        System.out.println(cfe.weekDayNumbersWithMultipleConditions(2));
        System.out.println(cfe.weekDayNumbersWithMultipleConditions(3));
        System.out.println(cfe.weekDayNumbersWithMultipleConditions(4));
        System.out.println(cfe.weekDayNumbersWithMultipleConditions(5));

    }








}
