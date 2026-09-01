package collectionFramework;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapABsics {

    static void main(String[] args) {

        Map<String,String> mapping = new HashMap<>();

        //insertion
        mapping.put("in","india");
        //mapping.put("in","india2"); //updates the old entry from india->india2
        mapping.put("en","england");
        mapping.put("us", "united sates");

        System.out.println(mapping);

        Map<String,String> table = new HashMap<>();
        table.put("br", "brazil");

        System.out.println("before: "+ table);
        table.putAll(mapping);
        System.out.println("after: "+ table);

        //deletion
        table.remove("en");
        System.out.println(table);

//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());

        table.putIfAbsent("in","india3"); //if entry is not present then it gets added orelse nope
        table.putIfAbsent("es","spain");
        System.out.println(table);

        System.out.println(table.get("es"));

        System.out.println(table.getOrDefault("usa","NONE"));

        //containsKey() and containsValue()

        table.replace("in", "indonesia");
        System.out.println(table);

        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        Collection<String> valueset = table.values();
        System.out.println(valueset);

        //return all the entries from the table

        Set<Map.Entry<String,String>> entryst = table.entrySet();
        System.out.println("entries: "+ entryst);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key: "+ entry.getKey()+ "  values: "+entry.getValue());
        }


    }
}
