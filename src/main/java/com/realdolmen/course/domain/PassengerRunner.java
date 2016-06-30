package com.realdolmen.course.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

/**
 * Created by jonsnow on 30/06/16.
 */
public class PassengerRunner {

    public static void main(String[] args) {
//        EntityManager
        Passenger p = new Passenger();
        p.setId(1);
        p.setFirstName("Peter");
        p.setLastName("Pan");
        p.setDateOfBirth(1,10,1990);
        p.setAge(26);
        p.getLastFlight(new Date());
        p.getFrequentFlyerMiles(1200);

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("PassengerInformation");
        EntityManager em=emf.createEntityManager();

        EntityTransaction tx=em.getTransaction();
        tx.begin();
        em.persist(p);
        tx.commit();
        em.close();
        emf.close();
    }
}
