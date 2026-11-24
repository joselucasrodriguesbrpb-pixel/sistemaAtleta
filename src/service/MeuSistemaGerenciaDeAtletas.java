package service;

import domain.atleta.Atleta;
import domain.sistemaGerencia.SistemaGerenciaDeAtletas;
import domain.telefone.Telefone;
import exception.AtletaJaExisteException;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaGerenciaDeAtletas implements SistemaGerenciaDeAtletas {
    private List<Atleta> atletas;

    public MeuSistemaGerenciaDeAtletas() {
        this.atletas = new ArrayList<>();
    }

    public boolean cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel) {
        for (Atleta a : this.atletas) {
            if (a.getCodigo().equals(codigoAtleta)) {
                a.cadastraTelefone(tel);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean apagarTelefoneDeAtleta(String codigoAtleta, Telefone tel) {
        return false;
    }

    @Override
    public void cadastrarAtleta(String codigoAtleta, int idade, List<Telefone> telefones) throws AtletaJaExisteException {
        for (Atleta a : this.atletas) {
            if (codigoAtleta.equals(a.getCodigo())) {
                throw new AtletaJaExisteException("Já existe um atleta com este código cadastrado!");
            }
        }
        this.atletas.add(new Atleta(codigoAtleta, idade, telefones));
    }

    @Override
    public List<Atleta> pesquisarAtletasComIdadeEntre(int idadeInferior, int idadeSuperior) {
        return List.of();
    }

    @Override
    public int pesquisarMaiorIdadeDosAtletas() {
        if (this.atletas.isEmpty()) {
            return 0;
        }
        int maiorIdade = 0;

        for (Atleta a : this.atletas) {
            if (a.getIdade() > maiorIdade) {
                maiorIdade = a.getIdade();
            }
        }
        return maiorIdade;
    }
}