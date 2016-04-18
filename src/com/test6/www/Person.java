package com.test6.www;

/**
 * Created by Ivan on 3/7/2016.
 */
public class Person implements Comparable<Person> {

    int age;
    String gender;

    public Person(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                '}';


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return gender != null ? gender.equals(person.gender) : person.gender == null;

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Person o) {
        int res = this.age - o.age;
        if (res == 0) {
            res = this.gender.compareTo(o.gender);
            return res;
        }
        return res;
    }
}
