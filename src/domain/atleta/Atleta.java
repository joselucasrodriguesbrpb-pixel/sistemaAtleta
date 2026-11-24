package domain.atleta;

import domain.telefone.Telefone;

import java.util.List;

public class Atleta {
    private String codigo;
    private int idade;
    private List<Telefone> telefones;


    public Atleta(String codigo, int idade, List<Telefone> telefones) {
        this.codigo = codigo;
        this.idade = idade;
        this.telefones = telefones;
    }
    public void cadastraTelefone(Telefone tel) {
        this.telefones.add(tel);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

}