package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

interface Pet{
    String name();
    void speak();

    float getAge() {
        return age;
    }

    void setAge(float age) {
        this.age = age;
    }


}
class Cat implements Pet {
    float age;

    public void speak(){
        System.out.println("Miau, miau");
    }

    public float getAge() {
        return age;
    }
}

class Dog implements Pet{
    float age;

    public void speak(){
        System.out.println("Hau, hau");
    }

    public float getAge() {
        return age;
    }
}