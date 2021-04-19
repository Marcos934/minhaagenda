package marcosmulinari.minhaagenda.model;

import jdk.jfr.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Agenda")
public class AgendaModel {

    @Id
    public Integer idContato;

    @Column(nullable = false, length = 85)
    public String nome;

    @Column(nullable = false, length = 1)
    public String sexo;

    @Column(nullable = false, length = 13)
    public String telefone;

    @Column(nullable = false, length = 85)
    public String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
