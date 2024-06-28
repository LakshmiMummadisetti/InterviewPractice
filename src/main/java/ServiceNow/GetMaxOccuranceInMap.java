package ServiceNow;

import java.util.HashMap;
import java.util.Map;

public class GetMaxOccuranceInMap {

    public static void main(String[] args) {
        Integer [] num = {1,2,2,2,2,4,4,5,6,7,7,8,9,3,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : num)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int max = 0;
        int key = 0;

        for(Map.Entry<Integer,Integer> map2 : map.entrySet())
        {
            if(map2.getValue()>max)
            {
                max = map2.getValue();
                key = map2.getKey();
            }
        }
        System.out.println(key+","+max);

    }

}
