package javafundamental.ArrayList;

import java.util.HashMap;
import java.util.Map;

class Mapdemo {
    public static void main(String[] args) {
        Map<String, Integer> staffDetailEng = new HashMap<String, Integer>();
        staffDetailEng.put("T1", 75);
        staffDetailEng.put("T2", 68);
        staffDetailEng.put("T3", 80);

        Map<String, Integer> staffDetailArts = new HashMap<String, Integer>();
        staffDetailArts.put("T1", 60);
        staffDetailArts.put("T2", 70);
        staffDetailArts.put("T3", 79);

        for (String s : staffDetailEng.keySet())
            System.out.println("Teacher " + s + " with max feedback:" + Math.max(staffDetailEng.get(s), staffDetailArts.get(s)));

    }
}
