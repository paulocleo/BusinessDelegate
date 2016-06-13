package br.edu.unibratec.businessDelegate;

import br.edu.unibratec.Dados;

/**
 * Created by Paulo Cruz on 11/06/2016.
 */
public class CarregarBanco {

    SessaoDelegate sessaoDelegate = new SessaoDelegate();

    public CarregarBanco(SessaoDelegate sessaoDelegate){
        this.sessaoDelegate = sessaoDelegate;
    }

    public void executar(){
        sessaoDelegate.AcaoEditar(new Dados("dado editado"));
        sessaoDelegate.AcaoGravar(new Dados("gravando dados"));
        sessaoDelegate.AcaoRemover(new Dados("removendo dados"));
    }

}
