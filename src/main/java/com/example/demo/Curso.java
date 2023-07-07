package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//###################################################
//#                 Resque Con Base de datos        #
//###################################################
//#tabla:Curso:                                     #
//#  - id: int (strategy=GenerationType.AUTO)       #
//#  - nombre: string                               #
//#  - Credito: int                                  #
//###################################################


@Entity
@Table(name ="curso")
public class Curso {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

    private Integer credits;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    

}