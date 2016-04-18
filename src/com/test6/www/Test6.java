package com.test6.www;

import com.test5.com.*;

import java.util.*;

/**
 * Collections
 * compareTo
 * equals
 */
public class Test6 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add(0, "two");
        System.out.println(list.get(0));

        System.out.println(list);


        System.out.println(list.size());

        list.remove("One");
        System.out.println(list);


        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(new Person(28, "Serj"));
        list2.add(new Person(25, "Ivan"));
        list2.remove(new Person(28, "Serijggkljhijgiugj"));
        System.out.println(list2);
        System.out.println(list2.contains(new Person(28, "Serj")));
        list2.set(0, new Person(28, "Serijggkljhijgiugj"));
        System.out.println(list2);


//        LinkedList<String> linkedList = new LinkedList<>();


        Iterator<Person> iterator = list2.iterator();

        while (iterator.hasNext()) {

            Person temp = iterator.next();
            System.out.println(temp);

            if (temp.age == 28) {
                iterator.remove();
            }
        }


        for (Person p : list2) {
            if (p.age == 28) {
                list2.remove(p);
            }

        }


        Set<Person> set = new TreeSet<>();
        set.add(new Person(1, "a"));
        set.add(new Person(1, "a"));
        set.add(new Person(2, "a"));
        set.add(new Person(3, "b"));
        System.out.println(set);


        HashSet<Person> hashSet = new HashSet<>(set);
//        hashSet.addAll(set);
        System.out.println("hashSet ");
        System.out.println(hashSet);

        for (Person p :
                hashSet) {
            System.out.println(p.hashCode());
        }


        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person(3, "b"));
        linkedHashSet.add(new Person(1, "a"));
        linkedHashSet.add(new Person(1, "a"));
        linkedHashSet.add(new Person(2, "a"));

        System.out.println(linkedHashSet);


        System.out.println("---------------");

        TreeSet<Car> treeSet = new TreeSet<>();
        treeSet.add(new Car(100, 15, "BMW"));
        treeSet.add(new Car(150, 16, "Kia"));
        treeSet.add(new Car(120, 14, "Mercedes"));
        treeSet.add(new Car(164, 17, "Subaru"));
        System.out.println(treeSet);


        Iterator<Car> it = treeSet.iterator();

        while (it.hasNext()) {
            Car iter = it.next();
            if (iter.hp > 100) {
                iter.wheelRatio++;
            }
        }
        System.out.println(treeSet);


    }

}
