package com.test6.www;

/**
 * Created by Ivan on 3/7/2016.
 */
public class Car implements Comparable<Car> {
    int hp;
    int wheelRatio;
    String brandName;

    public Car(int hp, int wheelRatio, String brandName) {
        this.hp = hp;
        this.wheelRatio = wheelRatio;
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hp=" + hp +
                ", wheelRatio=" + wheelRatio +
                ", brandName='" + brandName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (hp != car.hp) return false;
        if (wheelRatio != car.wheelRatio) return false;
        return brandName != null ? brandName.equals(car.brandName) : car.brandName == null;

    }

    @Override
    public int hashCode() {
        int result = hp;
        result = 31 * result + wheelRatio;
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Car o) {
        int res = this.brandName.compareTo(o.brandName);
        if(res==0){
            res = this.hp-o.hp;
            if(res==0){
                res = this.wheelRatio-o.wheelRatio;
                return res;
            }
            return res;
        }
        return res;
    }
}
