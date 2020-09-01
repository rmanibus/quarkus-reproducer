package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class MyEntity extends PanacheEntity {

    public String name;
    public LocalDate birth;
    public String status;
}
