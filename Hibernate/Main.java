package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Sumedh");
        s1.setRollNo(2);
        s1.setAge(21);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();  //cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1);

        transaction.commit();
        session.close();
        sf.close();

        System.out.println(s1);
    }
}
