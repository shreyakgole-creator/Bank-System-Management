package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtill
{
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("bank");

    public static EntityManager getEntityManager(){

        return emf.createEntityManager();

    }

    public static void close(){

        emf.close();

    }
}
