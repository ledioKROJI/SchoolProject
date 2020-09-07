package be.ledio.schoolAdmin.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerGenerator {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
    private static final EntityManager em = emf.createEntityManager();

    public static EntityManager generate(){
        return em;
    }
}
