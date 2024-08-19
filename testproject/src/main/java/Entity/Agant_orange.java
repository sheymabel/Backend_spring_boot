package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agant_orange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email_agant")
    private String email;
    @Column(name = "password_agant")
    private String password;
    @Column(name = "first_name_agant")
    private String nom;
    @Column(name = "laste_name agant")
    private String prenom;

    public Agant_orange(String email, String password, String nom, String prenom, String num_telephone,
            String genre, String poste, String botique) {

        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.num_telephone = num_telephone;
        this.genre = genre;
        this.poste = poste;
        this.botique = botique;
    }

    @Column(name = "phone_agant")
    private String num_telephone;

    @Column(name = "genre_clients")
    private String genre;

    @Column(name = "postclients")
    private String poste;
    @Column(name = "botique_clients")
    private String botique;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNum_telephone(String num_telephone) {
        this.num_telephone = num_telephone;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public void setBotique(String botique) {
        this.botique = botique;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNum_telephone() {
        return num_telephone;
    }

    public String getGenre() {
        return genre;
    }

    public String getPoste() {
        return poste;
    }

    public String getBotique() {
        return botique;
    }

}
