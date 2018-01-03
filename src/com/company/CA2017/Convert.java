package com.company.CA2017;

/**
 * Created by T00036644 on 06/10/2017.
 */
public class Convert {

    public static String converttofeet(double height){

        //constants
        final double CM_TO_INCHES = 2.56;
        final int MTS_TO_CM = 100;
        final int INCHES_TO_FT = 12;

        //conversion algorithm
        double heightininches = height/CM_TO_INCHES*MTS_TO_CM;
        int feet = (int) heightininches/INCHES_TO_FT;

        //int feet = (int) Math.floor(heightininches/12);
        int inche= (int) heightininches%INCHES_TO_FT;

        //return a String representation
        return feet+" ft "+ inche+ " inches";

    }

}
