
package ma.projet.service;

import java.util.Date;
import java.util.List;
import ma.projet.beans.Femme;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FemmeService implements IDao <Femme> {

    @Override
    public boolean create(Femme o) {
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
    public Femme getById(int id) {
        Session session = null;
        Femme e  = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            e = (Femme) session.get(Femme.class, id);
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
    public List<Femme> getAll() {
        Session session = null;
        List<Femme>  femmes = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            femmes = session.createQuery("from Femme").list();
            session.getTransaction().commit();
            return femmes;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return femmes;
    } 
//     public int compterEnfants(Femme femme, Date dateDebut, Date dateFin) {
//        Session session = null;
//         Transaction transaction = null;
//        int nombreEnfants = 0;
//
//        try {
//            session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//
//            // Utiliser la requête nommée
//            Query query = session.getNamedQuery("countChildren");
//            query.setParameter("femmeId", femme.getId());
//            query.setParameter("dateDebut", dateDebut);
//            query.setParameter("dateFin", dateFin);
//
//            // Exécuter la requête et obtenir le résultat
//            nombreEnfants = ((Number) query.getSingleResult()).intValue();
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//
//        return nombreEnfants;
//    }
//    
}
