package br.edu.unibratec.businessDelegate;

import br.edu.unibratec.Dados;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * Created by Paulo Cruz on 09/06/2016.
 */
public class SessaoDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    Acoes acao;
    String banco;

    public void setBanco(String banco){
        this.banco = banco;
    }

    public void AcaoGravar(Dados dado){
        acao = lookupService.getBanco(banco);
        acao.gravar(dado);
    }

    public  void AcaoEditar(Dados dado){
        acao = lookupService.getBanco(banco);
        acao.editar(dado);
    }

    public  void AcaoRemover(Dados dado){
        acao = lookupService.getBanco(banco);
        acao.remover(dado);
    }
}
