package be.ledio.schoolAdmin.data;

import be.ledio.schoolAdmin.model.SchoolEntities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class SchoolEntitiesDAO<E extends SchoolEntities> {
    private EntityManager em;
    private EntityTransaction et = em.getTransaction();
    private E tempEntity;

    SchoolEntitiesDAO(EntityManager em){
        this.em = em;
    }

    public E retrieveEntity(E entity){
        tempEntity = (E) em.find(entity.getClass(), entity.getPK());
        return tempEntity;
    }

    public void createEntity(E entity){
        et.begin();
        em.persist(entity);
        et.commit();
    }

    public void updateEntity(E entity){
        et.begin();
        tempEntity = this.retrieveEntity(entity);
        em.merge(tempEntity);
        et.commit();
    }

    public void deleteEntity(E entity){
        et.begin();
        tempEntity = this.retrieveEntity(entity);
        em.remove(tempEntity);
        et.commit();
    }
}
