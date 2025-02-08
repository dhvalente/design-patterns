package Creational.Builder.Exemplo__3;

import Creational.Builder.Exemplo__3.Builder.SQLQueryBuilder;
import Creational.Builder.Exemplo__3.ConcreteBuilder.MysqlQueryBuilder;
import Creational.Builder.Exemplo__3.ConcreteBuilder.PostgresQueryBuilder;

// Função cliente que utiliza o builder para construir e executar consultas SQL
public class Program {

    public static void main(String[] args) {
        System.out.println("Testing MySQL query builder:\n");
        clientCode(new MysqlQueryBuilder());

        System.out.println("\n\n");

        System.out.println("Testing PostgreSQL query builder:\n");
        clientCode(new PostgresQueryBuilder());
    }

    public static void clientCode(SQLQueryBuilder queryBuilder) {
        String query = queryBuilder
                .select("users", new String[]{"name", "email", "password"})
                .where("age", "18", ">")
                .where("age", "30", "<")
                .limit(10, 20)
                .getSQL();

        System.out.println(query);
    }
}