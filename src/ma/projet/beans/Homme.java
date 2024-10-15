
package ma.projet.beans;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Homme extends Personne{

    public Homme() {
    }

    public Homme(String nom, String prenom, String tele, String add, Date dN) {
        super(nom, prenom, tele, add, dN);
    }

   
    
}
