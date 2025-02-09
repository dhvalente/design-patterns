package Creational.FacthoryMethod.Exemplo__0.ConcreteCreator;

import Creational.FacthoryMethod.Exemplo__0.ConcreteProduct.PostgresDatabase;
import Creational.FacthoryMethod.Exemplo__0.Creator.DatabaseFactory;
import Creational.FacthoryMethod.Exemplo__0.Product.Database;

public class PostgresFactory implements DatabaseFactory {

    @Override
    public Database getDatabase() {
        return new PostgresDatabase();
    }
}
