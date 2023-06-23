package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Categoria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete {
    public static void main(String[] args) {
        //Padrão
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("EC-PU");
        EntityManager em = factory.createEntityManager();

        //Define uma busca para a remoção de um item do banco de dados a partir de uma variavel criada
        Categoria cat = em.find(Categoria.class, 1);

        //Inicia a conexão com o BD
        em.getTransaction().begin();
        //Define o item a ser excluido
        em.remove(cat);
        //Salva a alteração no banco
        em.getTransaction().commit();

        //Fecha a fabrica e a conexão
        factory.close();
        em.close();
    }
}
