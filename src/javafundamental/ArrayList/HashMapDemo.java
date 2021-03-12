package javafundamental.ArrayList;


import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] arg) {
       Map<Integer, String> gfg = new HashMap<Integer, String>();
/*
        // enter name/url pair
        gfg.put(1, "geeksforgeeks.org");
        gfg.put(2, "practice.geeksforgeeks.org");
        gfg.put(3, "code.geeksforgeeks.org");
        gfg.put(4, "quiz.geeksforgeeks.org");

        gfg.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

       */

        // enter name/url pair
        gfg.put(1, "geeksforgeeks.org");
        gfg.put(2, "practice.geeksforgeeks.org");
        gfg.put(3, "code.geeksforgeeks.org");
        gfg.put(4, "quiz.geeksforgeeks.org");

        // looping over keys
        for (Integer age : gfg.keySet())
        {
            // search  for value
            String url = gfg.get(age);
            if(age==3)
            System.out.println("Key = " + age + ", Value = " + url);
        }
    }
}

