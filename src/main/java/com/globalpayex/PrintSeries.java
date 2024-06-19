package com.globalpayex;

public class PrintSeries {

    public static String evenSeries(int n) {
        String result ="";
        for (int i = 0; i <= n; i += 2) {
            result = result + i;
            if(i<n-1){
                result = result+",";
            }
        }
        return result;
    }
}
