package com.xyinc.gps.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = " pois ")
@EntityListeners (AuditingEntityListener.class)
public class Pois {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotBlank
    private String name;

    @Min(0)
    private Integer cooX1;

    @Min(0)
    private Integer cooY1;

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "coordenadaX", nullable = false)
    public Integer getCooX1() {
        return cooX1;
    }

    public void setCooX1(Integer cooX1) {
        this.cooX1 = cooX1;
    }

    @Column(name = "coordenadaY", nullable = false)
    public Integer getCooY1() {
        return cooY1;
    }

    public void setCooY1(Integer cooY1) {
        this.cooY1 = cooY1;
    }

}


