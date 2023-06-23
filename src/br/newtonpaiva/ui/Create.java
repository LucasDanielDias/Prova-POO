package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Categoria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Create {
    public static void main(String[] args) {
        //Criação da Factory de criação do item no BD ( até o momento padrão)
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("EC-PU");
        EntityManager em = factory.createEntityManager();

        //Abre a conexão com o banco
        em.getTransaction().begin();

        //Cria o item
        Categoria c = new Categoria();
        c.setId(1);
        c.setNome("Jogos");

        //Salva o item no banco
        em.persist(c);

        //Salva o item no banco
        em.getTransaction().commit();
        em.close();
        factory.close();

    }
}
