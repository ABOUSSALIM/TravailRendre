
package ma.projet.beans;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity

@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id ;
    protected String nom ;
    protected String prenom ;
    @Column(name = "telephone")
    protected String tele ;
    @Column(name = "addresse")
    protected String add;
    @Column(name = "date_naissance")
    protected Date dN ;

    public Personne() {
    }

    public Personne(String nom, String prenom, String tele, String add, Date dN) {
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
        this.add = add;
        this.dN = dN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Date getdN() {
        return dN;
    }

    public void setdN(Date dN) {
        this.dN = dN;
    }

   
    
    
    
    
}
