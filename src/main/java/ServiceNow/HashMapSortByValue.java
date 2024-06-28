package ServiceNow;

import java.util.*;

public class HashMapSortByValue {
    public static void main(String args[])
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("sai", 33);
        map.put("Lakshmi", 66);
        map.put("kumari", 77);
        map.put("kumari", 77);
        map.put("Anjali", 88);
        map.put("dad", 32);
        map.put("mom", 12);

        List<Integer> li = new ArrayList<>(map.values());
       // li.toArray();
        Collections.sort(li);

        System.out.println(li);
        LinkedHashMap<String,Integer> outputmap = new LinkedHashMap<>();
        for(Integer en : li)
        {
            for(Map.Entry<String,Integer> ent :map.entrySet())
            {
                if(ent.getValue()==en) {
                    outputmap.put(ent.getKey(), en);
                }

            }
        }
        System.out.println(outputmap);

    }
}
