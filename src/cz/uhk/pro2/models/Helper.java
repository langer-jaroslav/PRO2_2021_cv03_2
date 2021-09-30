package cz.uhk.pro2.models;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static void print(int cislo){
        System.out.println(cislo);
    }

    public static void print(String text) {
        System.out.println(text);
    }



    public static List<CalculationHistory> history;
    public static int Sum(int a, int b){
        int result = a+b;
        CalculationHistory record = new CalculationHistory(a, b,result);
        if(history==null)
            history = new ArrayList<>();

        history.add(record);
        return result;
    }

    public static <T> double Sum(T a, T b){
        double dA = Double.parseDouble(a.toString());
        double dB = Double.parseDouble(b.toString());

        return dA + dB;
    }

}
