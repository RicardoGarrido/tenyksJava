package test31.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import test31.model.Divisa;
import test31.model.Vuelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ingrid on 08/06/2017.
 */
public class VueloDAO extends GenericDaoImpl<Vuelo, Long> {

    public List<Vuelo> listarVuelos() {
        List<Vuelo> vuelos = new ArrayList<Vuelo>();
        Transaction trns = null;
        HibernateUtil hibernateUtil = new HibernateUtil();
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            trns = session.beginTransaction();
            vuelos = session.createQuery("from Vuelo").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return vuelos;
    }

}
