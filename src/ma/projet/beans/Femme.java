
package ma.projet.beans;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQuery(
    name = "countChildren",
    query = "SELECT COUNT(*) FROM enfants WHERE femme_id = :femmeId AND date_naissance BETWEEN :dateDebut AND :dateFin",
    resultClass = Long.class // Indiquer le type de résultat attendu
)
public class Femme extends Personne{

    public Femme() {
    }

    public Femme(String nom, String prenom, String tele, String add, Date dN) {
        super(nom, prenom, tele, add, dN);
    }

    
}
