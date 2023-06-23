package br.newtonpaiva.dominio;

import javax.persistence.*;
import java.util.Objects;
//@Entity diz a linguagem que os dados são atomicos/indivisiveis
//@Table define as configurações das tabelas


@Entity
@Table(name = "id_categoria")
public class Categoria {
    //@Id define que esse atributo é a chave primaria
    //@GeneratedValue define  as configurações para a geração da chave primaria.
    //@Column define as configurações da coluna
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Categoria_id")
    private Integer id;
    private String nome;

    //A partir daqui o codigo é gerado automaticamente

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //Retorno do toString
    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
