package test31.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import test31.model.Divisa;


public class DivisaDAO extends GenericDaoImpl<Divisa, Long> {

    public List<Divisa> ListarDivisas() {
        List<Divisa> divisas = new ArrayList<Divisa>();
        Transaction trns = null;
        HibernateUtil hibernateUtil = new HibernateUtil();
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            trns = session.beginTransaction();
            divisas = session.createQuery("from Divisa").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return divisas;
    }

}
