package be.ledio.schoolAdmin.data;

import be.ledio.schoolAdmin.model.SchoolEntities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OperationalEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction et = em.getTransaction();
    private SchoolEntities InstanceEntity;


    public String retrieveEntity(SchoolEntities entity){
        et.begin();
        this.InstanceEntity = em.find(entity.getClass(), entity.getPK());
        et.commit();
        return this.InstanceEntity.toString();
    }

    public String createEntity(SchoolEntities entity){
        et.begin();
        em.persist(entity);
        et.commit();
        return "Following entity created : " + entity.toString();
    }

    public void updateEntity(SchoolEntities entity){
        et.begin();
        this.InstanceEntity = em.find(entity.getClass(), entity.getPK());
        em.merge(this.InstanceEntity);
        et.commit();
    }

    public void deleteEntity(SchoolEntities entity){
        et.begin();
        this.InstanceEntity = em.find(entity.getClass(), entity.getPK());
        em.remove(this.InstanceEntity);
        et.commit();
    }

    public void closeEntityManager(){
        em.close();
    }
}
