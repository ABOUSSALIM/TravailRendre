
package ma.projet.test;

import java.util.Date;
import ma.projet.beans.Femme;
import ma.projet.beans.Homme;
import ma.projet.service.FemmeService;
import ma.projet.service.HommeService;
import ma.projet.service.MariageService;


public class Test {

    
    public static void main(String[] args) {
      
        FemmeService fms = new FemmeService();
        HommeService hms = new HommeService();
        MariageService mrgs = new MariageService();
        hms.create(new Homme("ATTOCHI", "AZIZ", "0606060607", "SIDI YAHYA LGHARB", new Date()));
        
        
        
    }
    
}
