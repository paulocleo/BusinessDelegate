package br.edu.unibratec.businessDelegate;

import br.edu.unibratec.businessDelegate.Acoes;
import br.edu.unibratec.persistence.Mysql;
import br.edu.unibratec.persistence.Oracle;
import br.edu.unibratec.persistence.Postgres;

/**
 * Created by Paulo Cruz on 10/06/2016.
 */
public class BusinessLookUp {

    public Acoes getBanco(String conn){

        if(conn.equalsIgnoreCase("Mysql"))
            return new Mysql();

        else if(conn.equalsIgnoreCase("Postgres"))
            return new Postgres();

        else if(conn.equalsIgnoreCase("Oracle"))
            return new Oracle();

        else return null;
    }
}
