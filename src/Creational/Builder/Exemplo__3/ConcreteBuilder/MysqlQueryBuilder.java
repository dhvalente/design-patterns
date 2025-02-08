package Creational.Builder.Exemplo__3.ConcreteBuilder;

import Creational.Builder.Exemplo__3.Builder.SQLQueryBuilder;

public class MysqlQueryBuilder implements SQLQueryBuilder {

    protected StringBuilder query;

    public MysqlQueryBuilder() {
        this.reset();
    }

    private void reset() {
        this.query = new StringBuilder();
    }

    @Override
    public SQLQueryBuilder select(String table, String[] fields) {
        this.reset();
        this.query.append("SELECT ").append(String.join(", ", fields)).append(" FROM ").append(table);
        return this;
    }

    @Override
    public SQLQueryBuilder where(String field, String value, String operator) {
        if (!this.query.toString().toLowerCase().contains("select")) {
            throw new IllegalStateException("WHERE can only be added to SELECT");
        }
        this.query.append(" WHERE ").append(field).append(" ").append(operator).append(" '").append(value).append("'");
        return this;
    }

    @Override
    public SQLQueryBuilder limit(int start, int offset) {
        if (!this.query.toString().toLowerCase().contains("select")) {
            throw new IllegalStateException("LIMIT can only be added to SELECT");
        }
        this.query.append(" LIMIT ").append(start).append(", ").append(offset);
        return this;
    }

    @Override
    public String getSQL() {
        return this.query.toString() + ";";
    }
}