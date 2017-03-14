package com.company;

import static com.company.StringProcessor.integrationString;

public class Main {


    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder ("12345");
        StringBuilder stringBuilderSwap = new StringBuilder ();
        StringProcessor processor = new StringProcessor ();
        try {
            System.out.println (integrationString ("k-ko", 2));
            System.out.println (integrationString ("sad", 2));
            System.out.println (integrationString ("", 2));
        } catch (Exception e) {
            System.out.println (e);
        }

        System.out.println (processor.countOfSubstr ("mansadman ", "man"));
        System.out.println (processor.countOfSubstr ("sadman", "man"));
        System.out.println (processor.countOfSubstr ("", ""));
        System.out.println (processor.countOfSubstr ("", "s"));

        System.out.println(processor.third("10"));
        System.out.println(processor.third("20"));
        System.out.println(processor.third("30"));

        System.out.println(processor.stringBuilder (stringBuilder));
    }
}

