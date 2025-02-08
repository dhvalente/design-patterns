package Creational.Builder.Exemplo__3.Builder;

public interface SQLQueryBuilder {

    SQLQueryBuilder select(String table, String[] fields);

    SQLQueryBuilder where(String field, String value, String operator);

    SQLQueryBuilder limit(int start, int offset);

    String getSQL();
}