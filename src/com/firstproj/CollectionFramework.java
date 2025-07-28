package com.firstproj;

import java.util.*;

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

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);

        System.out.println("Linked List: "+ linkedList);

        // HashSet -- Hash means that same input will have same output
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(11);
        hashSet.add(11);
        hashSet.add(11);

        System.out.println("HashSet: "+hashSet);

        // LinkedHashSet -- maintains the order in which elements are inserted
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.contains(2);
        System.out.println("LinkedHashSet: "+linkedHashSet);

        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Archishmaan");
        hashMap.put(2, "Yatharth");
        hashMap.put(3, "Samarth");

        System.out.println("HashMap: " + hashMap.get(2));
    }
}
