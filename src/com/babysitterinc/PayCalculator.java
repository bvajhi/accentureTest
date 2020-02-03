package com.babysitterinc;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PayCalculator {
    //Assumes the given to the class is 24 hour format
    public String convertTimeTo24Hour (String time){
        //Format of the date defined in the input String
        DateFormat df = new SimpleDateFormat("hh:mm aa");
        //Desired format: 24 hour format: Change the pattern as per the need
        DateFormat outputformat = new SimpleDateFormat("HH:mm");
        Date date = null;
        String output = null;
        try{
            //Converting the input String to Date
            date= df.parse(time);
            //Changing the format of date and storing it in String
            output = outputformat.format(date);
        }catch(ParseException pe){
            pe.printStackTrace();
        }
        return output;
    }



}
