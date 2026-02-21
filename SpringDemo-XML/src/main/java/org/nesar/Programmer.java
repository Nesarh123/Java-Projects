package org.nesar;

import java.beans.ConstructorProperties;

public class Programmer {

    private int age;
    Computer com;

    public Programmer() {
        System.out.println("Programmer Object created");
    }

//    @ConstructorProperties({"age", "laptop"})
//    public Programmer(int age, Laptop laptop) {
//        System.out.println("Parameterised Constructor created");
//        this.age = age;
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }
}
