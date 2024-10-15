
package ma.projet.beans;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mariage {
    @EmbeddedId
    private MariagePk pk ;
    @ManyToOne
    @JoinColumn(name = "homme",insertable = false ,updatable = false)
    private Homme homme;
    @ManyToOne
    @JoinColumn(name = "femme", insertable = false, updatable = false)
    private Femme femme ;
    
 
    private Date dD ; 
  
    private Date dF ; 
    private int nbrEnfant ;

    public Mariage() {
    }

    public Mariage(Homme homme, Femme femme, Date dD, Date dF, int nbrEnfant) {
        this.homme = homme;
        this.femme = femme;
        this.dD = dD;
        this.dF = dF;
        this.nbrEnfant = nbrEnfant;
    }

    public MariagePk getPk() {
        return pk;
    }

    public void setPk(MariagePk pk) {
        this.pk = pk;
    }

    public Homme getHomme() {
        return homme;
    }

    public void setHomme(Homme homme) {
        this.homme = homme;
    }

    public Femme getFemme() {
        return femme;
    }

    public void setFemme(Femme femme) {
        this.femme = femme;
    }

    public Date getdD() {
        return dD;
    }

    public void setdD(Date dD) {
        this.dD = dD;
    }

    public Date getdF() {
        return dF;
    }

    public void setdF(Date dF) {
        this.dF = dF;
    }

    public int getNbrEnfant() {
        return nbrEnfant;
    }

    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }

   
    
    
}
