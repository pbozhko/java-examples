package com.example.hibernate;

import com.example.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
        Map<String, String> settings = new HashMap();
        settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost/mydb");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "wc6120008");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        settings.put(Environment.SHOW_SQL, "true");

        registryBuilder.applySettings(settings);

        StandardServiceRegistry registry = registryBuilder.build();

        MetadataSources sources = new MetadataSources(registry).addAnnotatedClass(User.class);

        Metadata metadata = sources.getMetadataBuilder().build();

        return metadata.getSessionFactoryBuilder().build();
    }

    public static void main(String... args) {

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();

            User user = new User();
            user.setName("User");
            user.setAge(25);

            session.saveOrUpdate(user);

            User storeduser = session.load(User.class, 13);
            if (storeduser != null) {
                System.out.println(storeduser);
            } else {
                System.out.println("User not found");
            }

            session.getTransaction().commit();
            session.close();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            ex.printStackTrace();
        } finally {
            if (session.isOpen()) {
                session.close();
            }
            if (!sessionFactory.isClosed()) {
                sessionFactory.close();
            }
        }
    }
}
