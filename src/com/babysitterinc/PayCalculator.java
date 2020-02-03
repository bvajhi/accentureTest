package com.babysitterinc;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PayCalculator {
    public String convertTimeTo24Hour (String time){
        //Format of the date defined in the input String
        DateFormat df = new SimpleDateFormat("hh:mm aa");
        //Desired format: 24 hour format: Change the pattern as per the need
        DateFormat outputFormat = new SimpleDateFormat("HH:mm");
        Date date = null;
        String output = null;
        try{
            //Converting the input String to Date
            date= df.parse(time);
            //Changing the format of date and storing it in String
            output = outputFormat.format(date);
        }catch(ParseException pe){
            pe.printStackTrace();
        }
        return output;
    }

   public int calculatePayForFamilyA(int startHour, int endHour){
       int total = 0;

       if (endHour <= 23) {
           total = (endHour - startHour) * 15;

       } else if (startHour < 23 && endHour > 23) {
           total = ((23 - startHour) * 15) + ((endHour - 23) * 20);
       } else if (startHour > 23 && endHour > 23) {
           total = (endHour - startHour) * 20;

       }
       return total;
   }

    public int calculatePayForFamilyB(int startHour, int endHour) {
        int total= 0;
        if (endHour <= 22) {
            total = (endHour - startHour) * 12;
        } else if (startHour < 22 && endHour > 22) {
            total = ((22 - startHour) * 12) + 16 + ((endHour - 24) * 16);
            if (endHour > 22 && endHour < 24) {
                total = ((22 - startHour) * 12) + ((24 - endHour) * 8);
            }
        } else if (startHour >= 22 && endHour < 24) {
            total = ((startHour - 22) * 8) + ((endHour - 22) * 8);
        } else if (startHour >= 22 && endHour > 24) {
            total = ((24 - startHour) * 8) + ((endHour - 24) * 16);
            if (startHour >= 24) {
                total = (endHour - startHour) * 16;
            }
        } else if (startHour < 22 && endHour < 24) {
            total = ((22 - startHour) * 12) + ((24 - endHour) * 8);
        }
        return total;
    }

    public int calculatePayForFamilyC(int startHour, int endHour) {
        int total = 0;
        if (endHour <= 21) {
            total = (endHour - startHour) * 21;
        } else if (endHour >= 21 && startHour >= 21) {
            total = (endHour - startHour) * 15;
        } else if (startHour < 21 && endHour >= 21) {
            total = ((21 - startHour) * 21) + ((endHour - 21) * 15);
        }
        return total;
    }



}
