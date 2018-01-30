package jp.co.training.config;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.SimpleDataSource;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MainConfig implements Config {
    private static final SimpleDataSource dataSource;
    private static final Dialect dialect = new PostgresDialect();

    static {
        dataSource = new SimpleDataSource();
        dataSource.setUrl("jdbc:log4jdbc:postgresql://localhost:5432/training");
        dataSource.setUser("syssqu");
        dataSource.setPassword("root");
    }
    @Override
    public DataSource getDataSource(){
        return dataSource;
    }
    @Override
    public Dialect getDialect(){
        return dialect;
    }

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

}