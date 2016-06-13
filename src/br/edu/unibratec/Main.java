package br.edu.unibratec;

import br.edu.unibratec.businessDelegate.CarregarBanco;
import br.edu.unibratec.businessDelegate.SessaoDelegate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SessaoDelegate delegate = new SessaoDelegate();

        delegate.setBanco("Mysql");
        CarregarBanco loadBanco = new CarregarBanco(delegate);
        loadBanco.executar();

        delegate.setBanco("Oracle");
        loadBanco.executar();

        delegate.setBanco("Postgres");
        loadBanco.executar();
    }
}
