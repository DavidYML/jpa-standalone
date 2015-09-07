package com.realdolmen.course.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Runner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("KevinPu");
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(new Book("Ninteen Eighty Four", "George Orwell", Book.Genre.fiction));
            transaction.commit();
        } finally {
            if(entityManager != null) {
                entityManager.close();
            }
            if(entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
    }
}
