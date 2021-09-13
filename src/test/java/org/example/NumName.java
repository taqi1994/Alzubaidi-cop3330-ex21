/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


import java.util.*;


class NumName
{
    public String monthEntered(int month)
    {
        /* 'Swtich' is for 12 cases for 12 months,
           in order to convert it to its corresponding name
         */

        switch (month)
        {
            case 1:
                return "January";

            case 2:
                return "february";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

            //otherwise, give an error..
            default:
                return "error";

        }

    }


    public static void main (String [] args)
    {
        int month;

        Scanner reader = new Scanner (System.in);

        NumName name = new NumName();
        System.out.print("Please enter the number of month: ");

        month = reader.nextInt();
        String answer = name.monthEntered (month);

        //input is has to be from 1 to 12
        if ( month > 0 && month < 13)
            System.out.print("The name of the month is "+answer);

        //otherwise gives the user an error message:
        else
            System.out.print(answer+" Error, please correct your input (from 1 to 12) ");

    }
}