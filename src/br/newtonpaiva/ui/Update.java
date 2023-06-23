package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Categoria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Update {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("EC-PU");
        EntityManager em = factory.createEntityManager();

        Categoria cat = em.find(Categoria.class, 1);

        em.getTransaction().begin();

        //Seta o nome da categoria como livros e comita
        cat.setNome("Livros");
        em.getTransaction().commit();

        // Não utilizamos ees codigo pois o causa do ID
//        Categoria cat = new Categoria();
//        cat.setId(1);
//        cat.setNome("Livros");
//
//        em.getTransaction().begin();
        // merge e a união e atualização no bd
//        em.merge(cat);
//        em.getTransaction().commit();




        factory.close();
        em.close();
    }
}
