package methodsAndObjects;

import java.util.HashMap;
import java.util.Map;

public class MapUsingHashMap {
    public static void main(String args[])
    {
        Map<String,Integer> student = new HashMap<>();
        student.put("Lakshmi", 98);
        student.put("Kumari", 48);
        student.put("sai", 90);
        student.put("prathap", 99);
        student.put("Lakshmi", 99);
        System.out.println(student);
        System.out.println(student.get("Lakshmi"));
        System.out.println(student.keySet());
        System.out.println(student.values());
        for(String st :student.keySet())
            System.out.println(st+"value is "+student.get(st));

    }
}
