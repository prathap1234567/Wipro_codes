package com.wipro.hibernattest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernatdemo.entity.Passport;
import com.wipro.hibernatdemo.entity.Person;

public class OnetoOneTest {

    public static void main(String[] args) {

        // 1. Create SessionFactory
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .buildSessionFactory();

        // 2. Open session
        Session session = factory.openSession();

        // 3. Begin transaction
        Transaction t = session.beginTransaction();

        // ✅ Insert
        Passport passport = new Passport("IND1234567");
        Person person = new Person("Prathap", "K", passport);
        session.persist(person);

        // ✅ Fetch
        Person p = session.find(Person.class, 1);
        System.out.println(p);

        // 4. Commit
        t.commit();

        session.close();
        factory.close();
    }
}