package khoa.nv.kshop.configuration;

import org.hibernate.dialect.MySQLDialect;

public class MySQLDialectUtf8mb4 extends MySQLDialect {
    @Override
    public String getTableTypeString() {
        var engine = super.getTableTypeString();
        return engine + " DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci";
    }
}
