package org.example;


import jakarta.transaction.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.imageio.spi.ServiceRegistry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) throws HeuristicRollbackException, SystemException, HeuristicMixedException, RollbackException, InterruptedException {

        AlienName an = new AlienName();
        an.setFrame("NavinKumarReddy");
        an.setLname("Thatipalli");
        an.setMname("BapReddy");

        Alien mollusk = new Alien();
        Alien telusko = null;
        telusko.setAid(101);
        telusko.setColor("Green");
        String aname;
        telusko.setAname(String.valueOf(an));

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);


        con.configure();

        SessionFactory sf = null;
        Session Session = sf.openSession();

        boolean flag = true;
        System.out.println(flag);

        Transaction session = null;
        session.wait(mollusk.getAid());

        telusko = null;
        session.wait(telusko.getAid());

        telusko = (Alien) session.getClass();

        session.wait(telusko.getAid());

        session.commit();


        System.out.println(telusko);
    }
}