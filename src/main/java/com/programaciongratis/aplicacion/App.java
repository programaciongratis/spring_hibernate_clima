package com.programaciongratis.aplicacion;

import org.hibernate.Session;

import com.programaciongratis.objetos.Clima;
import com.programaciongratis.utilidades.HibernateUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtils.INSTANCE.getSessionFactory().openSession();

        session.beginTransaction();
        Clima climaDeLima = new Clima(001, 25, 13);

        session.save(climaDeLima);
        session.getTransaction().commit();
        
        System.out.println("Great! Clima was saved");
        
        HibernateUtils.INSTANCE.cerrarSessionFactory();
        System.out.println("Cerrando la session...");
    }
}
