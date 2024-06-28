package ServiceNow;

import java.util.HashMap;
import java.util.Map;

public class GetMaxOccuranceInMapForChar {

    public static void main(String[] args) {
        String str = "abgvfhjbbvddhhhhjhnscdcc";
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        int max = 0;
        char key ='a';

        for(Map.Entry<Character,Integer> map2 : map.entrySet())
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
