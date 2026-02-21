package org.nesar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
@Scope("prototype")
public class Programmer {

    @Value("25")
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

    @Autowired
//    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }
}
