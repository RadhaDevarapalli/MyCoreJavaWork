package com.corejava;

public class ControlFlowExample {

    public String weekDays(int weekDayNumber){
        if(weekDayNumber == 1){
            return "Monday";
        }
        else if (weekDayNumber == 2){
            return "Tuesday";
        }

        else if (weekDayNumber == 3){
            return "Wednesday";
        }
        else if (weekDayNumber == 4){
            return "Thursday";
        }
        else if (weekDayNumber == 5){
            return "Friday";
        }
        else if (weekDayNumber == 6){
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
       System.out.println(cfe.weekDays(1));
        System.out.println(cfe.weekDays(2));
        System.out.println(cfe.weekDays(3));
        System.out.println(cfe.weekDays(4));
        System.out.println(cfe.weekDays(5));
        System.out.println(cfe.weekDays(6));
        System.out.println(cfe.weekDays(7));



    }








}
