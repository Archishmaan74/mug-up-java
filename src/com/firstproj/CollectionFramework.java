package com.firstproj;

import java.util.ArrayList;

public class CollectionFramework {
    public static void main(String[] args){
        // List --> ArrayList & LinkedList
        // Set --> HashSet & LinkedHashSet
        // Map --> Hashmap & LinkedHashMap

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList);
        System.out.println("Second element: "+ arrayList.get(1));

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);

        arrayList.addAll(arrayList2);
        System.out.println("Joining two array lists: "+ arrayList);

    }
}
