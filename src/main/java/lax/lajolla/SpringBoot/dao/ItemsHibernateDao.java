package lax.lajolla.SpringBoot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lax.lajolla.SpringBoot.items.Palabras;

@Repository
@Transactional
@Profile("Hibernate")
public class ItemsHibernateDao implements ItemsDao { 

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Environment env;

    @PersistenceContext
    private EntityManager entityManager;
    
    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public List<Palabras> getAll() {
        logger.info("getAll::" + env.getActiveProfiles());
        return (List<Palabras>) getEntityManager().createQuery("FROM PALABRAS", Palabras.class).getResultList();
    }

    public Palabras save(Palabras palabra) {
        logger.info("Save::" + env.getActiveProfiles());
        getEntityManager().persist(palabra);
        return null;
    }
}
