package test.p5.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import test.p5.entities.Greeter;

import java.util.List;

public class ServPost {
    public void setUp() throws Exception {
        Greeter greetJpa = new Greeter();
        greetJpa.setGreeting("Bye");
        greetJpa.setTarget("JPA");

        Greeter greetHibernate = new Greeter();
        greetHibernate.setGreeting("Hello");
        greetHibernate.setTarget("Hibernate");

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory;
        try {
            sessionFactory = new MetadataSources(registry)
                    .buildMetadata()
                    .buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw e;
        }

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(greetHibernate);
        session.save(greetJpa);
        session.getTransaction().commit();
        session.close();
    }
    public void read() throws Exception {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory;
        try {
            sessionFactory = new MetadataSources(registry)
                    .buildMetadata()
                    .buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw e;
        }
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Greeter> greetings = session.createQuery("from Greeter")
                .list();
        greetings.forEach(g -> System.out.println(String.format("%s, %s!",
                g.getGreeting(),
                g.getTarget())));
        session.getTransaction().commit();
        session.close();
    }
}
