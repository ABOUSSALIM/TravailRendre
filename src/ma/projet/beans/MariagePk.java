/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MariagePk implements Serializable{
    
    private int homme ;
    private int femme ;
  

    public MariagePk() {
    }

    public MariagePk(int homme, int femme) {
        this.homme = homme;
        this.femme = femme;
       
    }

    public int getHomme() {
        return homme;
    }

    public void setHomme(int homme) {
        this.homme = homme;
    }

    public int getFemme() {
        return femme;
    }

    public void setFemme(int femme) {
        this.femme = femme;
    }

}
