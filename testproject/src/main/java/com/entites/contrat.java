package com.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom_client")
    private String nome;
    @Column(name = "Type_de_contrat_contrat")
    private String Type_de_contrat;
    @Column(name = "service_contrat")
    private String service;
    @Column(name = "produits_contrat")
    private String produits;
    @Column(name = "date_de_debut")
    private String date_de_debut;
    @Column(name = "\tdate_de_fin")
    private String date_de_fin;
    @Column(name = "date_creation_contrat")
    private String date_creation_contrat;
    @Column(name = "botique")
    private String botique;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public contrat(int id, String nome, String type_de_contrat, String service, String produits, String date_de_debut,
            String date_de_fin, String date_creation_contrat, String botique) {
        this.id = id;
        this.nome = nome;
        Type_de_contrat = type_de_contrat;
        this.service = service;
        this.produits = produits;
        this.date_de_debut = date_de_debut;
        this.date_de_fin = date_de_fin;
        this.date_creation_contrat = date_creation_contrat;
        this.botique = botique;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setType_de_contrat(String type_de_contrat) {
        Type_de_contrat = type_de_contrat;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setProduits(String produits) {
        this.produits = produits;
    }

    public void setDate_de_debut(String date_de_debut) {
        this.date_de_debut = date_de_debut;
    }

    public void setDate_de_fin(String date_de_fin) {
        this.date_de_fin = date_de_fin;
    }

    public void setDate_creation_contrat(String date_creation_contrat) {
        this.date_creation_contrat = date_creation_contrat;
    }

    public void setBotique(String botique) {
        this.botique = botique;
    }

    public String getType_de_contrat() {
        return Type_de_contrat;
    }

    public String getService() {
        return service;
    }

    public String getProduits() {
        return produits;
    }

    public String getDate_de_debut() {
        return date_de_debut;
    }

    public String getDate_de_fin() {
        return date_de_fin;
    }

    public String getDate_creation_contrat() {
        return date_creation_contrat;
    }

    public String getBotique() {
        return botique;
    }

  
}
