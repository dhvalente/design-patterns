package Creational.Builder.Exemplo__3.ConcreteBuilder;

import Creational.Builder.Exemplo__3.Builder.SQLQueryBuilder;

// Builder concreto para PostgreSQL, extendendo o MysqlQueryBuilder
public class PostgresQueryBuilder extends MysqlQueryBuilder {

    @Override
    public SQLQueryBuilder limit(int start, int offset) {
        super.limit(start, offset);
        this.query.insert(this.query.toString().toLowerCase().indexOf("limit"), " OFFSET " + offset);
        return this;
    }
}