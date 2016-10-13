package br.senac.rn.model;

import br.senac.rn.dao.PersistDB;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sexos")
public class Sexo implements PersistDB {
    
    @Id
    @GeneratedValue
    @Column(name = "sex_id")
    private int id;
    @Column(name = "sex_sexo")
    private String nome;
    @Column(name = "sex_sigla")
    private String Sigla;

    @Override
    public String toString() {
        return "Sexo{" + "id=" + id + ", nome=" + nome + ", Sigla=" + Sigla + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }
    
}
