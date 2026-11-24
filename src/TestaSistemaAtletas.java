import domain.atleta.Atleta;
import domain.sistemaGerencia.SistemaGerenciaDeAtletas;
import domain.telefone.Telefone;
import exception.AtletaJaExisteException;
import service.MeuSistemaGerenciaDeAtletas;

import java.util.ArrayList;
import java.util.List;

public class TestaSistemaAtletas {

    public static void main(String [] args) throws AtletaJaExisteException {
        SistemaGerenciaDeAtletas sistema = new MeuSistemaGerenciaDeAtletas();
        sistema.cadastrarAtleta("CX123", 20, new ArrayList<>());
        sistema.cadastrarTelefoneDeAtleta("CX123", new Telefone("83", "99998888", "Celular"));
        sistema.cadastrarTelefoneDeAtleta("CX123", new Telefone("83", "33335555", "Fixo"));
        sistema.cadastrarAtleta("CX555", 50, new ArrayList<>());
        List<Atleta> listaAtletas = sistema.pesquisarAtletasComIdadeEntre(15,20);
        for (Atleta a: listaAtletas){
            System.out.println("Código:"+a.getCodigo()+", Idade:"+ a.getIdade());
        }
        //TODO: Completar a partir daqui
    }
}
