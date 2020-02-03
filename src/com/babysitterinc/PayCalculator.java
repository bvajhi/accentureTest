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



}
