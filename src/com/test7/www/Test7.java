package com.test7.www;

import java.util.*;

/**
 * Created by Ivan on 3/16/2016.
 * <p/>
 * Maps
 */
public class Test7 {
    public static void main(String[] args) {
//        HashMap
//        TreeMap
//        LinkedHashMap

        HashMap<Integer,String> mhashMap = new HashMap<>();
        mhashMap.put(555,"val1");
        mhashMap.put(555,"val2");
        mhashMap.put(777,"val1");
        System.out.println(mhashMap);
        String str =mhashMap.get(555);
        System.out.println(str);
        System.out.println(mhashMap.get(777).contains("al"));

        System.out.println(mhashMap.values());
        System.out.println(mhashMap.keySet());


        Set<Map.Entry<Integer,String>> entrySet=mhashMap.entrySet();
        System.out.println(entrySet);
        Iterator <Map.Entry<Integer,String>> it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            entry.setValue("change");
            System.out.println(entry);
        }

        TreeMap<Person,ArrayList<String>> treeMap = new TreeMap<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("sucker");
        strings.add("test");
        strings.add("test2");
        treeMap.put(new Person("John", 23), strings);
        System.out.println(treeMap);


        HashMap<HashMap<String, String>,HashMap<Integer, Integer>> uberHashMap  = new HashMap<>();
        HashMap<String,String> hashMapString = new HashMap<>();
        hashMapString.put("a","aa");
        hashMapString.put("b","bb");


        HashMap<Integer, Integer> hashMapInteger = new HashMap<>();
        hashMapInteger.put(1,11);
        hashMapInteger.put(2,22);


        uberHashMap.put(hashMapString,hashMapInteger);
        int i =  uberHashMap.get(hashMapString).get(2);


    }
}
