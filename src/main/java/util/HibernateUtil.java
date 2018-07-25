package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil{

    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable r){
            System.err.println("Exception occured");
            throw new ExceptionInInitializerError(r);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
