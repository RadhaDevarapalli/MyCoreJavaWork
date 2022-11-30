package com.corejava;

public class ControlFlowExample {

    public int weekDayNumbersWithMultipleConditions(String weekDay){
        if(weekDay == "Monday" || weekDay == "Tuesday"){
            return 1;
        }
        else if (weekDay == "Wednesday" || weekDay == "Thursday"){
            return 2;
        }

        else if (weekDay == "Friday"){
            return 5;
        }
        else if (weekDay == "Saturday"){
            return 6;
        }
        else{
            return 7;

        }

    }
//2 1 2 6 7
    public static void main(String[] args) {
        ControlFlowExample cfe = new ControlFlowExample();
       System.out.println(cfe.weekDayNumbersWithMultipleConditions("Wednesday"));
        System.out.println(cfe.weekDayNumbersWithMultipleConditions("Tuesday"));
        System.out.println(cfe.weekDayNumbersWithMultipleConditions("Thursday"));
        System.out.println(cfe.weekDayNumbersWithMultipleConditions("Saturday"));
        System.out.println(cfe.weekDayNumbersWithMultipleConditions("Sunday"));

    }








}
