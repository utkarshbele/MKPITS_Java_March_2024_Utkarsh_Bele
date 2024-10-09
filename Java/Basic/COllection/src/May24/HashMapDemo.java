package May24;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map= new HashMap<>();
        map.put("Pune",14);
        map.put("nagpur",10);
        map.put("Nashik",95);
        map.put("Yavatmal",29);
        map.put("Amravati",31);


        System.out.println(map);
        for (Map.Entry entry: map.entrySet())
        {
            System.out.print(entry+" ");
        }

        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.containsKey("yavatmal")); //case sensitive
        map.putIfAbsent("Sydney",1995);

        System.out.println(map);
        System.out.println(map.hashCode());
        for(Object o:map.keySet())
        {
            System.out.println(o.hashCode());
        }
    }
}
