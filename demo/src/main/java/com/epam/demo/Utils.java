package com.epam.demo;

import java.util.List;

public class Utils {
    public static  void main(String[] args){}
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        boolean res = true;
        for(String item: args){
            if(Integer.getInteger(item) <=0){
                res = false;
                break;
            }
        }
        return res;
    }
}