package com.nesar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.setLid(1);
        laptop1.setLaptopName("Apple");
        laptop1.setLaptopModel("Macbook Air");
        laptop1.setRam("16 GB");

        Laptop laptop2 = new Laptop();
        laptop2.setLid(2);
        laptop2.setLaptopName("Apple");
        laptop2.setLaptopModel("Macbook Pro");
        laptop2.setRam("16 GB");

        Laptop laptop3 = new Laptop();
        laptop3.setLid(3);
        laptop3.setLaptopName("Apple");
        laptop3.setLaptopModel("Macbook");
        laptop3.setRam("16 GB");

        Student student1 = new Student();
        student1.setRollNo(1);
        student1.setName("Nesar");
        student1.setAge(26);

        Student student2 = new Student();
        student2.setRollNo(2);
        student2.setName("Ram");
        student2.setAge(22);

        student1.setLaptops(Arrays.asList(laptop1, laptop2));
        student2.setLaptops(List.of(laptop3));

        SessionFactory sf = new Configuration().configure()
                                               .addAnnotatedClasses(Student.class)
                                               .addAnnotatedClasses(Laptop.class)
                                               .buildSessionFactory();
        Session session1 = sf.openSession();

        Laptop l1 = session1.find(Laptop.class, 1);
        System.out.println(l1);

        session1.close();

        Session session2 = sf.openSession();

        Laptop l2 = session2.find(Laptop.class, 1);
        System.out.println(l2);

        session2.close();

//        String laptop_name = "Apple";
//
//        Query query = session.createQuery("select laptopName, laptopModel, ram from Laptop where laptopName like ?1");
//        query.setParameter(1, laptop_name);
//        List<Object[]> laptops = query.getResultList();
//
//        for(Object[] data: laptops){
//            System.out.println((String)data[0] + " : " + (String)data[1] + " : " + (String)data[2]);
//        }
//
//        System.out.println(laptops);

//        Transaction trans = session.beginTransaction();
//        session.persist(laptop1);
//        session.persist(laptop2);
//        session.persist(laptop3);
//        session.persist(student1);
//        session.persist(student2);
//        trans.commit();
        sf.close();
    }
}
