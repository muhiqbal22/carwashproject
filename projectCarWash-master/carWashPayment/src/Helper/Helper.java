package Helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author miqba
 */
public class Helper {

     public Date parseStringToDate(String _date) throws ParseException {
        return new SimpleDateFormat("dd-MM-yyyy").parse(_date);
    }
    
    public String parseDateToString(Date _date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        return dateFormat.format(_date);
    }
}
