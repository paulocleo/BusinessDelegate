package br.edu.unibratec.persistence;

import br.edu.unibratec.Dados;
import br.edu.unibratec.businessDelegate.Acoes;


/**
 * Created by Paulo Cruz on 08/06/2016.
 */
public class Oracle implements Acoes {
    String conn;

    @Override
    public void gravar(Dados dados) {
        conn = getconexao();
        System.out.println("Conexão: " + conn);
        System.out.println("Dados editados! " + dados.getDados());
    }

    @Override
    public void editar(Dados dados) {
        conn = getconexao();
        System.out.println("Conexão: " + conn);
        System.out.println("Dados editados! " + dados.getDados());
    }

    @Override
    public void remover(Dados dados) {
        conn = getconexao();
        System.out.println("Conexão: " + conn);
        System.out.println("Dados editados! " + dados.getDados());
    }

    @Override
    public String getconexao() {
        return "jdbc: URL Oracle";
    }
}
