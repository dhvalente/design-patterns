package Creational.FacthoryMethod.Exemplo__0;

import Creational.FacthoryMethod.Exemplo__0.ConcreteCreator.PostgresFactory;
import Creational.FacthoryMethod.Exemplo__0.Product.Database;

public class Client {

    public static void main(String[] args) {
		Database db = new PostgresFactory().getDatabase();
        //Database db = new OracleFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }
}
