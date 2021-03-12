package javafundamental.ArrayList;

import java.util.HashMap;

public class MapCompare {
    public static void main(String[] args) {
        //Map<Integer, String> hm1 = new HashMap<Integer, String>();
        HashMap<String, Integer> eng = new HashMap<String, Integer>();

        eng.put("Nir", 70);
        eng.put("Suba", 80);
        HashMap<String, Integer> arts = new HashMap<String, Integer>();
        arts.put("Nirmala", 75);
        arts.put("Subaksha", 60);

        //System.out.println(eng);
        //System.out.println(eng.entrySet());
        int maxAge;
        HashMap<String, Integer> college = new HashMap<String, Integer>();
        System.out.println(eng.size());
        for (HashMap.Entry<String, Integer> age1 : eng.entrySet()) {
            for (HashMap.Entry<String, Integer> age2 : arts.entrySet()) {
                //for(int i = 0;i<maths.size();i++){
                //math.comparingByValue()
                String maxName = "";
                System.out.println(eng.keySet() + " " + eng.get(age1));
                //Collections.max(math.getValue(), eng.getValue());
                if (arts.containsKey(age1) && arts.get(age2)< eng.get(age1)) {
                    maxAge =(int) eng.get(age1);
                    System.out.println("Key = " + maxAge + ", Value = " + maxName);
                }
                else {
                 maxAge =(int) arts.get(age2);
                 System.out.println("Key = " + maxAge + ", Value = " + maxName);

                }
            }
        }
    }
}

