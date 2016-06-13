package br.edu.unibratec.businessDelegate;

import br.edu.unibratec.Dados;

/**
 * Created by Paulo Cruz on 09/06/2016.
 */
public interface Acoes {

    void gravar(Dados dados);
    void editar(Dados dados);
    void remover(Dados dados);
    String getconexao();
}
