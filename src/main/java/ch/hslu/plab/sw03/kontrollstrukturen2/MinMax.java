package ch.hslu.plab.sw03.kontrollstrukturen2;

import java.util.Collections;
import java.util.Arrays;


public class MinMax {
    public static int getMin(final int firstNumberToCompare, final int secondNumberToCompare){
        if(firstNumberToCompare <= secondNumberToCompare){
            return firstNumberToCompare;
        }
        return secondNumberToCompare;
    }

    public static int getMax(final int firstNumberToCompare, final int secondNumberToCompare){
        if(firstNumberToCompare >= secondNumberToCompare){
            return firstNumberToCompare;
        }
        return secondNumberToCompare;
    }

    public static int getMax(final Integer... numbers){
        return Collections.max(Arrays.asList(numbers));
    }

    public static int getMin(final Integer... numbers){
        return Collections.min(Arrays.asList(numbers));
    }
}
