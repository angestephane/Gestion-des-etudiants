package com.steph.gestiondesetudiants.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name ="nom", nullable = false)
    private String nom;

    @Column(name ="prenom", nullable = false)
    private String prenom;

    @Column(name ="apoge", nullable = false)
    private String apoge;

    @Column(name ="email", nullable = false)
    private String email;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String apoge, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.apoge = apoge;
        this.email = email;
    }
}
