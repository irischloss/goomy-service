package com.example.koki_service.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.example.koki_service.mapper", sqlSessionFactoryRef = "personSqlSessionFactory")
public class PersonDataSourceConfig {

    @Bean(name = "personDataSourceProperties")
    @ConfigurationProperties("spring.datasource.person")
    public DataSourceProperties personDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "personDataSource")
    public DataSource personDataSource(@Qualifier("personDataSourceProperties") DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Bean(name = "personSqlSessionFactory")
    public SqlSessionFactory personSqlSessionFactory(@Qualifier("personDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/persondb/*.xml"));
        return factoryBean.getObject();
    }

    @Bean(name = "personSqlSessionTemplate")
    public SqlSessionTemplate personSqlSessionTemplate(@Qualifier("personSqlSessionFactory") SqlSessionFactory factory) {
        return new SqlSessionTemplate(factory);
    }
}
