package com.Freljord.Infrastructure.Helper.Utility;

import java.util.Map;

public class HashMapUtils {

    private static final Map<Integer,String> stringToKeep = new java.util.HashMap<>();
    private static final Map<Integer,Integer> intToKeep = new java.util.HashMap<>();
    private static final String className = String.valueOf(HashMapUtils.class);

    public static void write (String data){

        stringToKeep.put(1, data);
        LoggerHelper.logAction("Write : " + data, className);
    }

    public static String read(){

        LoggerHelper.logAction("Reading : " + stringToKeep, className);
        return stringToKeep.get( 1 );
    }

    public static void clear(){

        stringToKeep.clear();
        LoggerHelper.logAction("Clearing : " + stringToKeep, className);
    }

    public static void writeInt(int data){

        intToKeep.put( 1, data );
        LoggerHelper.logAction("Write : " + data, className);
    }

    public static int readInt(){

        LoggerHelper.logAction("Reading : " + intToKeep, className);
        return intToKeep.get( 1 );
    }

    public static void clearInt(){

        intToKeep.clear();
        LoggerHelper.logAction("Clearing : " + intToKeep, className);
    }
}
