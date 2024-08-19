package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name = "first_name_clients")
    private String nom;
    @Column(name = "laste_name clients")
    private String prenom;
    @Column(name = "email_clients")
    private String email;
    @Column(name = "phone_clients")
    private String phone;
    @Column(name = "adresse_clients")
    private String adresse;
    @Column(name = "Date_de_naissance_clients")
    private String Date_de_naissance;
    @Column(name = "num_cin_clients")
    private String Num_cin;
    @Column(name = "code_postale_clients")
    private String Code_postale;

    public clients() {
    }

    public int getId() {
        return id;
    }

    public clients(int id, String nom, String prenom, String email, String phone, String adresse,
            String date_de_naissance, String num_cin, String code_postale) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
        this.adresse = adresse;
        Date_de_naissance = date_de_naissance;
        Num_cin = num_cin;
        Code_postale = code_postale;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        Date_de_naissance = date_de_naissance;
    }

    public void setNum_cin(String num_cin) {
        Num_cin = num_cin;
    }

    public void setCode_postale(String code_postale) {
        Code_postale = code_postale;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getDate_de_naissance() {
        return Date_de_naissance;
    }

    public String getNum_cin() {
        return Num_cin;
    }

    public String getCode_postale() {
        return Code_postale;
    }

}
