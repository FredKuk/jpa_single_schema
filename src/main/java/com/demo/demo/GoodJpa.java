package com.demo.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name="good")
@Getter
@Setter
public class GoodJpa {
    @Id
    // @Column(name="goodNo", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goodNo;
    String name;
    int type;
    String company;
    Date startDate;
    Date changeDate;
    int stat;
}
