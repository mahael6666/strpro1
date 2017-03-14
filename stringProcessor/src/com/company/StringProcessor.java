package com.company;

/**
 * Created by Михаил on 14.03.2017.
 */
public class StringProcessor {

    public static String integrationString(String s, int n) {
        if (n < 0) throw new IllegalArgumentException ();
        else if (n == 0) return "";
        else {
            String result = "";
            for (int i = 0; i < n; i++) {
                result += s;
            }

            return result;
        }

    }
    public static int countOfSubstr(String First, String Second) {
        int pos = 0,
                buf = 0,
                result = 0;

        boolean inWhile = true;
        if(First.length() < Second.length())
        {
            return 0;
        }
        if(First.length() == 0 || Second.length() == 0)
        {
            return 0;
        }
        while (inWhile)
        {
            buf = First.indexOf(Second, pos);
            if(buf == -1)
            {
                return 0;
            }
            else
            {
                pos = buf + Second.length();
                result++;
                if((First.length() - pos + 1) < Second.length())
                {
                    inWhile = false;
                }
            }
        }
        return result;
    }


    public static String third (String str) {
        String result = str.replaceAll("1", "One").replaceAll("2", "Two").replaceAll("3", "Three");

        return result;
    }
    public StringBuilder stringBuilder(StringBuilder stringBuilder) {
        int pos = 0,
                length = stringBuilder.length();

        for(int i = 1; i <= length; i++)
        {
            if(i % 2 == 0)
            {
                stringBuilder.deleteCharAt((i - pos) - 1);
                pos++;
            }
        }
        return stringBuilder;
    }

}
