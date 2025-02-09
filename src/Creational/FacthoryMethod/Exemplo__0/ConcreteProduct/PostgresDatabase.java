package Creational.FacthoryMethod.Exemplo__0.ConcreteProduct;

import Creational.FacthoryMethod.Exemplo__0.Product.Database;

public class PostgresDatabase implements Database {

    public void query(String sql) {
        System.out.println("Querying " + sql + " in Postgres database");
    }

    public void update(String sql) {
        System.out.println("Uptade querry " + sql + " in Postgres database");
    }
}
