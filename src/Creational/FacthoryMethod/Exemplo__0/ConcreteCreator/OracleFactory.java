package Creational.FacthoryMethod.Exemplo__0.ConcreteCreator;

import Creational.FacthoryMethod.Exemplo__0.ConcreteProduct.OracleDatabase;
import Creational.FacthoryMethod.Exemplo__0.Creator.DatabaseFactory;
import Creational.FacthoryMethod.Exemplo__0.Product.Database;

public class OracleFactory implements DatabaseFactory {

    @Override
    public Database getDatabase() {
        return new OracleDatabase();
    }
}
