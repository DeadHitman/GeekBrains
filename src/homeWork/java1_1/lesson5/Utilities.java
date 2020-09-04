package homeWork.java1_1.lesson5;

import java.util.Locale;

public class Utilities {

    public static double rnd(double min, double max)
    {
        max -= min;

        String result = String.format(Locale.ENGLISH,"%.2f",(Math.random() * ++max) + min);
        return Double.parseDouble(result);
    }
}
