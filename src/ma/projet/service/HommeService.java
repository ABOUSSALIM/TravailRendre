
package ma.projet.service;

import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;
import ma.projet.beans.Femme;
import ma.projet.dao.IDao;
import ma.projet.beans.Homme;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import ma.projet.beans.Mariage;
import org.hibernate.Query;
import org.hibernate.Transaction;
public class HommeService implements IDao <Homme> {


  

    @Override
    public boolean create(Homme o) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return false;
    }

    @Override
    public Homme getById(int id) {
        Session session = null;
        Homme e  = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            e = (Homme) session.get(Homme.class, id);
            session.getTransaction().commit();
            return e;
        } catch (HibernateException ex) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return e;
    }

    @Override
    public List<Homme> getAll() {
        Session session = null;
        List<Homme>  hommes = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            hommes = session.createQuery("from Homme").list();
            session.getTransaction().commit();
            return hommes;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return hommes;
    }
    

//   public void femme4(Homme homme, Date dateDebut, Date dateFin) {
//    Transaction transaction = null;
//    List<Femme> epouses = null;
//    Session session = null;
//    try {
//        session = HibernateUtil.getSessionFactory().openSession(); 
//        transaction = session.beginTransaction();
//     TypedQuery<Femme> query = session.createQuery(
//    "SELECT m.femme FROM Mariage m WHERE m.homme.id = :hommeId AND m.dD BETWEEN :dateDebut AND :dateFin", 
//    Femme.class
//);
//     query.setParameter("hommeId", homme.getId()); // Utilisez l'ID de l'homme
//        query.setParameter("dateDebut", dateDebut);
//        query.setParameter("dateFin", dateFin);
//
//        epouses = query.getResultList();
//        transaction.commit();
//    } catch (Exception e) {
//        if (transaction != null) {
//            transaction.rollback();}
//        e.printStackTrace();
//    } finally {
//            session.close(); 
//    }
//    if (epouses != null && !epouses.isEmpty()) {
//        System.out.println("Épouses de " + homme.getNom() + " entre " + dateDebut + " et " + dateFin + ":");
//        for (Femme femme : epouses) {
//            System.out.println("- " + femme.getNom() + " " + femme.getPrenom());
//        }
//    } else {
//        System.out.println("Aucune épouse trouvée pour " + homme.getNom() + " entre " + dateDebut + " et " + dateFin + ".");
//    }
//}

    }
    

