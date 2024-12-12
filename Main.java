package MiEquipo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestion_equipos");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Equipo equipo = em.find(Equipo.class, 2);
        tx.begin();
//        em.persist(equipo); //Para añadir Equipos
//        Jugador j1 = new Jugador("Messi", 1.70f, 63f, equipo);
//        em.persist(j1);
//        j1.setNombre("Maradona");
//        em.merge(j1);
//        equipo.jugadores();
        
        tx.commit();






    }



}
