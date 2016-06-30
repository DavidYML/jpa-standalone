package com.realdolmen.course;

import com.realdolmen.course.domain.Passenger;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by jonsnow on 30/06/16.
 */
public class PassengerPersistenceTest extends DataSetPersistenceTest {
    @Test
    public void idOfPassengerCheck() throws Exception {
        Passenger p = new Passenger("Peter", "Pan", 1200, new byte[]{(byte)0x80,(byte)0x80},null, 26, new Date());
        entityManager().persist(p);
        assertNotNull(p.getId());


    }

    public void idOfPassengerCheckgetId() throws Exception {
        assertEquals("", entityManager().find(Passenger.class, 1).getId());
    }

    }


