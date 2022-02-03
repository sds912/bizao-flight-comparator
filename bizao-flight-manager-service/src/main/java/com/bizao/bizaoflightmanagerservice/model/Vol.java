package com.bizao.bizaoflightmanagerservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ValueGenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor 
@NoArgsConstructor
public class Vol {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private Long   numeroVol;
    private String depart;
    private String destination;
    private Date   DateDepart;
    private Date   DateArrivee;
    private Double prix;
}
