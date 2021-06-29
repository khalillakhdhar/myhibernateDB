package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

@Entity
public class Student {
@Id //clé primaire
@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
long id;
@NotNull //non null
String nom;
@NotBlank
String classe;
@Column(columnDefinition = "varchar(255) default 'etudiant'")
String grade;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getClasse() {
	return classe;
}

public void setClasse(String classe) {
	this.classe = classe;
}




}
