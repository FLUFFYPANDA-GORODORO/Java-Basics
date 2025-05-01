//We have used merge method to update the data . This method first checks if the data is present in the database or not .
//If yes the data is preent in the database it will change the values .
//If not it save it as a new record . Pretty interesting method yohhohohohohooho

package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("John");
        s1.setRollNo(4);
        s1.setAge(20);



//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();  //cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.merge(s1);
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);
    }
}
